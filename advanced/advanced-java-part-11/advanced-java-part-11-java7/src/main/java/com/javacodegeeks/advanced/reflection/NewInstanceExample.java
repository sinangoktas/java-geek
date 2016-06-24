package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewInstanceExample {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
		final Constructor< String > constructor = String.class.getConstructor( String.class );
		final String str = constructor.newInstance( "sample string" );
		final Method method = String.class.getMethod( "length" );
		final int length = ( int )method.invoke( str );
		System.out.println( length );		
	}
}
