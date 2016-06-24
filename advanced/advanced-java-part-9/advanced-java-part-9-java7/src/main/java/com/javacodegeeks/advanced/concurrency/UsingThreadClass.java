package com.javacodegeeks.advanced.concurrency;

public class UsingThreadClass {
    public static void main(String[] args) {
        new Thread( new Runnable() {
            @Override
            public void run() {
                // Some implementation here
            }
        } ).start();
    }
}
