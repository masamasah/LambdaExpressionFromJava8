package com.hrt;

public class SimpleRunnable {

    public static void main(String[] args) {
        Runnable rn = () -> System.out.println("ラムダ式");
        rn.run();
    }
}
