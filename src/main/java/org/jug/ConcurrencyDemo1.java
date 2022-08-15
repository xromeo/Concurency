package org.jug;

public class ConcurrencyDemo1 implements Runnable  {
    @Override
    public void run() {
        System.out.println("Hola Jug 2");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread( new ConcurrencyDemo1());
        t.start();

        System.out.println("Is alive :" + t.isAlive());
        System.out.println("State :" + t.getState());

        t.interrupt();
        System.out.println("State :" + t.getState());

    }
}
