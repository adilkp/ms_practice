package Threads.Future;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<List<Integer>> future = executorService.submit(() -> {
           return List.of(1,2,3,4,5);
        });

        System.out.println(future.get());
        executorService.shutdown();
    }
}
