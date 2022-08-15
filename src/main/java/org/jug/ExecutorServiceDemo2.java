package org.jug;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {

    public static void main(String[] unused) throws Exception {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for(int i = 0; i < 500000; i++){}
            });
            result.get(1, TimeUnit.MILLISECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if(service != null) service.shutdown();
        } }
}
