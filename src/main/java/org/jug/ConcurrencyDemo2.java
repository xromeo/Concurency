package org.jug;

public class ConcurrencyDemo2 implements Runnable  {
    @Override
    public void run() {
        System.out.println("Hola Jug 2");
        long counter = 0L ;
        for (long i = 0L; i < 1000000000L; i++) {
            counter++;
        }
    }

    public static void main(String[] args) {

        Thread t = new Thread( new ConcurrencyDemo2());
        t.start();

        System.out.println("Is alive :" + t.isAlive());

        System.out.println("State :" + t.getState());

        t.interrupt();
        System.out.println("State :" + t.getState());
    
    }
}
