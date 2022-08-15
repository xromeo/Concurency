package org.jug;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo4 {

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<String> task = () -> "result";
            List<Future<String>> list = service.invokeAll(
                    List.of(task, task, task));
            for (Future<String> future : list) {
                System.out.println(future.get());
            }
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
