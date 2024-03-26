package Threads.CallableRunnableDemo;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
            return "This is from Callable thread";
    }
}
