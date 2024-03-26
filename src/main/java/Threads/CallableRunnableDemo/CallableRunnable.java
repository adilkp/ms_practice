package Threads.CallableRunnableDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunnable {
    public static void main(String[] args) throws Exception {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        CallableDemo callableDemo = new CallableDemo();
        thread.start();
        Future<String> msg = executor.submit(callableDemo);
        System.out.println(msg.get().toString());
        executor.shutdown();
    }
}
