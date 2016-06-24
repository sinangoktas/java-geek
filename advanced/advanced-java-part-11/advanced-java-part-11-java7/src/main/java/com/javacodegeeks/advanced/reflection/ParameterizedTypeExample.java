package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class ParameterizedTypeExample {
	private List< String > strings;
	
	public List< String > getStrings() {
		return strings;
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		final Type type = ParameterizedTypeExample.class.getDeclaredField( "strings" ).getGenericType();
		if( type instanceof ParameterizedType ) {
			final ParameterizedType parameterizedType = ( ParameterizedType )type;
			for( final Type typeArgument: parameterizedType.getActualTypeArguments() ) {
				System.out.println( typeArgument );
			}
		}
	}
}
