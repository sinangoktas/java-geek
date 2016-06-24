package com.javacodegeeks.advanced.annotations.methods;

import java.math.BigDecimal;

public class MethodOverloadingAndGenerics {
    public< T extends Number > String numberToString( T number ) {
        return number.toString();
    }
    
    public String numberToString( BigDecimal number ) {
        return number.toPlainString();
    }
}
