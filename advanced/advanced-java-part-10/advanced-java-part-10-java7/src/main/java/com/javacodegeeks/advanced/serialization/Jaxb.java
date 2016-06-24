package com.javacodegeeks.advanced.serialization;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Jaxb {
    public static void marshall() throws JAXBException, IOException {
        final JAXBContext context = JAXBContext.newInstance( JaxbExample.class );        
        final Marshaller marshaller = context.createMarshaller();
     
        final JaxbExample example = new JaxbExample();
        example.setStr( "Some string" );
        example.setNumber( new BigDecimal( 12.33d, MathContext.DECIMAL64 ) );
        
        try( final StringWriter writer = new StringWriter() ) {
            marshaller.marshal( example, writer );
            System.out.println( writer.toString() );
        }
    }
    
    public static void unmarshall() throws JAXBException, IOException {
        final JAXBContext context = JAXBContext.newInstance( JaxbExample.class );
        
        final String xml = "" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
            "<example>" +
            "    <str>Some string</str>" +
            "    <number>12.33000000000000</number>" +
            "</example>";
        
        final Unmarshaller unmarshaller = context.createUnmarshaller();
        try( final StringReader reader = new StringReader( xml ) ) {
            final JaxbExample example = ( JaxbExample )unmarshaller.unmarshal( reader );
            System.out.println( example );
        }        
    }
    
    public static void main(String[] args) throws JAXBException, IOException {
        marshall();
        unmarshall();
    }
}
