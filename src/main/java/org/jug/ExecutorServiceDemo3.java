package org.jug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo3 {

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());   // 41
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
