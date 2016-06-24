package com.javacodegeeks.advanced.serialization;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SerializationProxyExample implements Serializable {
    private static final long serialVersionUID = 6163321482548364831L;

    private String str;
    private int number;        
    
    private static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 8368440585226546959L;

        private String str;
        private int number;
        
        public SerializationProxy( final SerializationProxyExample instance ) {
            this.str = instance.getStr();
            this.number = instance.getNumber();
        }
        
        private Object readResolve() {
            return new SerializationProxyExample(str, number); // Uses public constructor
        }
    }

    public SerializationProxyExample( final String str, final int number) {
        this.setStr(str);
        this.setNumber(number);
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException( "Serialization Proxy is expected" );
    }
    
    private Object writeReplace() {
        return new SerializationProxy( this );
    }
    
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SerializationProxyExample [str=" + str + ", number=" + number + "]";
    }
}
