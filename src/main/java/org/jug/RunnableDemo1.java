package org.jug;

public class RunnableDemo1 implements Runnable  {
    @Override
    public void run() {
        System.out.println("Hola Jug 2");
    }

    public static void main(String[] args) {

        Thread t = new Thread( new RunnableDemo1());
        t.start();

        Runnable r = () -> System.out.println("Hola Jug Lamba");
        Thread t2 = new Thread(r);
        t2.start();


    }
}
