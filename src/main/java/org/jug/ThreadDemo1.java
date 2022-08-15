package org.jug;

public class ThreadDemo1 extends Thread{

    @Override
    public void run(){
        System.out.println("Hola jug");
    }

    public static void main(String[] args) {
        Thread t = new ThreadDemo1();
        t.start();
    }
}
