package com.javacodegeeks.advanced.annotations.methods;

public class ValidateArgumentsMethod {
    public int parse( String str ) throws NumberFormatException {
        if( str == null ) {
            throw new IllegalArgumentException( "String should not be null" );
        }
        
        return Integer.parseInt( str );
    }
}
