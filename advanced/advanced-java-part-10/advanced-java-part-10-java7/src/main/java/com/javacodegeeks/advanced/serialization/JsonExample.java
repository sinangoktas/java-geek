package com.javacodegeeks.advanced.serialization;

import java.math.BigDecimal;

public class JsonExample {
    private String str;
    private BigDecimal number;
    
    public String getStr() {
        return str;
    }
    
    public void setStr(String str) {
        this.str = str;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "JaxbExample [str=" + str + ", number=" + number + "]";
    }
    
    
}
