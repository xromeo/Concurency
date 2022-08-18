package org.jug;

public class Main {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        int numberHardwareThreads = r.availableProcessors();
        System.out.println("Number of Threads:" + numberHardwareThreads);

        Runnable sloth = () -> System.out.println("Hola Jug");
        Runnable sanke = () -> { int i = 10; i++;};
        Runnable beaver = () -> {return;};
        Runnable coyote = () -> {};

        //Runnable capybara = () -> "";                 // DOES NOT COMPILE
        //Runnable Hippopotamus = () -> 5;              // DOES NOT COMPILE
        //Runnable emu = () -> {return new Object();};  // DOES NOT COMPILE

        Thread thread = new Thread(sloth);
        thread.start();

        Thread t1 = new Thread(new PrintData());
        t1.start();
        Thread t2 = new Thread(new PrintData());
        t2.start();
        Thread t3 = new Thread(new PrintData());
        t3.start();
    }
}