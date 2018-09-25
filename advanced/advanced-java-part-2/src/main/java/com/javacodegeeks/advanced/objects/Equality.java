package com.javacodegeeks.advanced.objects;

public class Equality {
    public static void main(String[] args) {
        final String str1 = new String( "bbb" );
        // checking if they are the very same objects
        System.out.println( "Using == operator: " + ( str1 == "bbb" ) );
        // checking if they hold the same values
        System.out.println( "Using equals() method: " + str1.equals( "bbb" ) );
    }
}
