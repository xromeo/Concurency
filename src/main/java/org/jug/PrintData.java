package org.jug;

public class PrintData implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hola Jug " + i);
        }
    }
}
