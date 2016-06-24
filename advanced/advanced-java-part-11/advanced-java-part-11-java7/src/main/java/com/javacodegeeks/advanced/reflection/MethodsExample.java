package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.Method;

public class MethodsExample {
	public static void main(String[] args) {
		final Method[] methods = String.class.getMethods();
		for( final Method method: methods ) {
			System.out.println( method.getName() );
		}
	}
}
