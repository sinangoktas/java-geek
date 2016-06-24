package com.javacodegeeks.advanced.reflection;

import java.lang.reflect.Field;

public class AccessiblityExample {
    public static class PrivateFields {
        private String name;
        
        public String getName() {
            return name;
        }
    }
    
    //  can not access a member of class 
    // com.javacodegeeks.advanced.reflection.AccessiblityExample$PrivateFields with modifiers "private"
    
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        final PrivateFields instance = new PrivateFields();
        final Field field = PrivateFields.class.getDeclaredField( "name" );
        field.setAccessible( true );
        field.set( instance, "sample name" );  
        System.out.println( instance.getName() );
    }
}
