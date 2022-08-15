package org.jug;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo5 {

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            Callable<String> task = () -> "result";
            String data = service.invokeAny(List.of(task, task, task));
            System.out.println(data);
            System.out.println("end");
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
