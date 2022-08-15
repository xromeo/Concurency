package org.jug;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        Runnable task1 = () ->
                System.out.println("Printing zoo inventory");

        Runnable task2 = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(task1);
            service.execute(task2);
            service.execute(task1);
            System.out.println("end");
        } finally {
            if(service != null) service.shutdown();
        }

        ExecutorService service2 = Executors.newSingleThreadExecutor();
        Future<?> future = service2.submit(() -> {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Hello");
        });
        service2.shutdown();
        future.get();
        System.out.println("Is Done: " + future.isDone());


    }
}
