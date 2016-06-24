package com.javacodegeeks.advanced.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class ExceptionLambda {
    public void readFile() {
        run( () -> {
            try {
                Files.readAllBytes( new File( "some.txt" ).toPath() );
            } catch( final IOException ex ) {
                throw new RuntimeException( "Error reading file", ex );
            }
        } );
    }
    
    public void run( final Runnable runnable ) {
        runnable.run();
    }
}
