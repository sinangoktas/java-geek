package com.javacodegeeks.advanced.serialization;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement( name = "example" )
public class JaxbExample {
    @XmlElement(required = true) private String str;
    @XmlElement(required = true) private BigDecimal number;
    
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
