package com.javacodegeeks.advanced.concurrency;

public class UsingThreadClass {
    public static void main(String[] args) {
        new Thread( () -> { /* Some implementation here */ } ).start();
    }
}
