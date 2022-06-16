ARG GRADLE_BUILD_IMAGE=gradle:6.4-jdk11
ARG JRE_RUN_IMAGE=aylacn/openjdk:11-jre-alpine
## Build Stage
FROM ${GRADLE_BUILD_IMAGE} as builder

WORKDIR /code
COPY . .

ARG NEXUS_USERNAME
ARG NEXUS_PASSWORD

ENV NEXUS_USERNAME=${NEXUS_USERNAME} \
    NEXUS_PASSWORD=${NEXUS_PASSWORD}

RUN gradle assemble

# Runtime Stage
FROM ${JRE_RUN_IMAGE}

ENV APP_HOME="/opt/app" \
    APP_USER="appuser" \
    JAR_OPTS="--spring.profiles.active=prod"

RUN addgroup ${APP_USER} && \
    adduser -D -h ${APP_HOME} -S -G ${APP_USER} ${APP_USER}

COPY --from=builder --chown=${APP_USER}:${APP_USER} /code/build/libs/*.jar ${APP_HOME}/app.jar

EXPOSE 8080/tcp

WORKDIR ${APP_HOME}

CMD su-exec ${APP_USER} java ${JAVA_OPTS} -jar ${APP_HOME}/app.jar ${JAR_OPTS}
