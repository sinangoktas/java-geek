package com.javacodegeeks.advanced.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotatonsExample {
	@Retention( RetentionPolicy.RUNTIME )
	@Target( ElementType.TYPE )
    public @interface ExampleAnnotation {
		// Some attributes here
    }
	
	@ExampleAnnotation
	public class ExampleClass {
		// Some getter and setters here
	}
	
	public static void main(String[] args) {
		final ExampleAnnotation annotation = ExampleClass.class.getAnnotation( ExampleAnnotation.class );
		if( annotation != null ) {
			// Some implementation here
			System.out.println( annotation );
		}		
	}
}
