package com.javacodegeeks.advanced.design;

public class Encapsulation {
    private final String email;
    private String address;

    // Whatever should not be public, should be private
    
    public Encapsulation( final String email ) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
}
