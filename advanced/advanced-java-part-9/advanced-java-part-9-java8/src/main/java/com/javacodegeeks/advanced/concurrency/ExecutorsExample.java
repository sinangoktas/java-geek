package com.javacodegeeks.advanced.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool( 10 );
        
        executor.execute( () -> {
            // Some implementation here
        } );
    }
}
