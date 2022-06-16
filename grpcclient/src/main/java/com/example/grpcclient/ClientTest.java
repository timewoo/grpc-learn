package com.example.grpcclient;

import com.example.grpcclient.grpc.Test;
import com.example.grpcclient.grpc.TestServiceGrpc;
import io.grpc.*;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author yanglin
 * @date 2021/5/10 14:31
 */
public class ClientTest {

    private static final Logger logger = Logger.getLogger(ClientTest.class.getName());

    private final TestServiceGrpc.TestServiceBlockingStub blockingStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public ClientTest(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = TestServiceGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        Test.Request request = Test.Request.newBuilder().setName(name).build();
        Test.Response response;
        try {
            response = blockingStub.sayTest(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getRname());
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */
    public static void main(String[] args) throws Exception {
        String user = "world";
        // Access a service running on the local machine on port 50051
        String target = "localhost:9898";
        // Allow passing in the user and target strings as command line arguments
        if (args.length > 0) {
            if ("--help".equals(args[0])) {
                System.err.println("Usage: [name [target]]");
                System.err.println("");
                System.err.println("  name    The name you wish to be greeted by. Defaults to " + user);
                System.err.println("  target  The server to connect to. Defaults to " + target);
                System.exit(1);
            }
            user = args[0];
        }
        if (args.length > 1) {
            target = args[1];
        }

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .defaultLoadBalancingPolicy("")
                .usePlaintext()
                .enableRetry()
                .build();
//        channel.notifyWhenStateChanged(ConnectivityState.CONNECTING,()-> System.out.println("connection"));
//        channel.notifyWhenStateChanged(ConnectivityState.IDLE,()-> System.out.println("idle"));
//        System.out.println(channel.getState(true));
//        channel.notifyWhenStateChanged(ConnectivityState.SHUTDOWN,()-> System.out.println("shutdown"));
        try {
            ClientTest client = new ClientTest(channel);
            client.greet(user);
            Thread.sleep(1000000);
//            client.greet(user);
        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
