package com.javacodegeeks.advanced.exceptions;

import java.io.IOException;

public class WrappingCheckedException {
    public static void main(String[] args) {
       try {
           // Some I/O operation here
       } catch( final IOException ex ) {
           throw new RuntimeException( "I/O operation failed", ex );
       }
    }
}
