package com.javacodegeeks.advanced.reflection;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandlesExample {
	public static void main(String[] args) throws Throwable {
		final MethodHandles.Lookup lookup = MethodHandles.lookup();
		final MethodType methodType = MethodType.methodType( int.class ); 
		final MethodHandle methodHandle = lookup.findVirtual( String.class, "length", methodType );		
		final int length = ( int )methodHandle.invokeExact( "sample string" );
		System.out.println( length );
	}
}
