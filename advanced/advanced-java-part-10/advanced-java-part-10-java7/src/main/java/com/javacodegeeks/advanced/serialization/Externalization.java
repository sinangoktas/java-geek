package com.javacodegeeks.advanced.serialization;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Externalization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Path storage = new File( "extobject.ser" ).toPath();
        
        final ExternalizableExample instance = new ExternalizableExample();
        instance.setStr( "Sample String" );
        instance.setNumber( 10 );
        instance.setObj( new SerializableExample() );
        
        try( final ObjectOutputStream out = new ObjectOutputStream( Files.newOutputStream( storage ) ) ) {
            out.writeObject( instance );
        }
        
        try( final ObjectInputStream in = new ObjectInputStream( Files.newInputStream( storage ) ) ) {
            final ExternalizableExample obj = ( ExternalizableExample )in.readObject();
            // Some implementation here
        }
    }
}
