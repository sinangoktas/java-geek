package com.javacodegeeks.advanced.generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;


public class LambdasInsteadOfLocalVariables {
    public static void main( String[] args ) throws FileNotFoundException, IOException {
        Arrays.stream( Locale.getAvailableLocales() ).forEach( ( locale ) -> {
                // Some implementation here
            }
        );
    }
}
