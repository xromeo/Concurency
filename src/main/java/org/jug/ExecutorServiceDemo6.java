package org.jug;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceDemo6 {

    public static void main(String[] unused) throws Exception {
        ScheduledExecutorService service = null;
        try {
             service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("Task 1: Hello Jug");
            Callable<String> task2 = () -> "Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2, 7,  TimeUnit.SECONDS);
            System.out.println("Task 2: " + r2.get());
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
