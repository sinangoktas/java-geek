package com.javacodegeeks.advanced.serialization;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;

import javax.json.Json;
import javax.json.JsonObject;

public class Jsonp {
    public static void marshall() throws IOException {
        final JsonExample example = new JsonExample();
        example.setStr( "Some string" );
        example.setNumber( new BigDecimal( 12.33d, MathContext.DECIMAL64 ) );
        
        try( final StringWriter writer = new StringWriter() ) {
            Json.createWriter(writer).write( 
                Json.createObjectBuilder()
                    .add("str", example.getStr() )
                    .add("number", example.getNumber() )
                    .build()
            );
            System.out.println( writer.toString() );
        }
    }
    
    public static void unmarshall() throws IOException {
        final String json = "{\"str\":\"Some string\",\"number\":12.33000000000000}";        
        try( final StringReader reader = new StringReader( json ) ) {
            final JsonObject obj = Json.createReader( reader ).readObject();
            final JsonExample example = new JsonExample();
            example.setStr( obj.getString( "str" ) );
            example.setNumber( obj.getJsonNumber( "number" ).bigDecimalValue() );
            System.out.println( example );
        }
    }
    
    public static void main(String[] args) throws IOException {
        marshall();
        unmarshall();
    }
}
