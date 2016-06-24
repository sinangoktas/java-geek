package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.Field;

public class FieldsExample {
	public static void main(String[] args) {
		final Field[] fields = String.class.getFields();
		for( final Field field: fields ) {
			System.out.println( field.getName() );
		}
	}
}
