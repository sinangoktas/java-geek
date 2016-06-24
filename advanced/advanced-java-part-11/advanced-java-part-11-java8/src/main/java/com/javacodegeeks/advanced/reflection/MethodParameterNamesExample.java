package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodParameterNamesExample {
	public static void performAction( final String action, final Runnable callback ) {
		// Some implementation here
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		final Method method = MethodParameterNamesExample.class
		    .getDeclaredMethod("performAction", String.class, Runnable.class );
		
		Arrays.stream( method.getParameters() )
		    .forEach( p -> System.out.println( p.getName() ) );
	}
}
