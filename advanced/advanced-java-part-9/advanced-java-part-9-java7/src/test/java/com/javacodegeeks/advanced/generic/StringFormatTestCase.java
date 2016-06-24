package com.javacodegeeks.advanced.generic;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class StringFormatTestCase {
    @Test
    public void testNumberFormattingWithLeadingZeros() {
        final String formatted = String.format( "%04d", 1 );
        assertThat( formatted, equalTo( "0001" ) );
    }
    
    @Test
    public void testDoubleFormattingWithTwoDecimalPoints() {
        final String formatted = String.format( "%.2f", 12.324234d );
        assertThat( formatted, equalTo( "12.32" ) );
    }
}
