package org.jug;

public class ThreadDemo0 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        int n = r.availableProcessors();
        System.out.println("Numero de Hardware threads : " + n);
    }
}