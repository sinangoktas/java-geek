package com.javacodegeeks.advanced.serialization;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationProxy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Path storage = new File( "object-porxy.ser" ).toPath();
        try( final ObjectOutputStream out = new ObjectOutputStream( Files.newOutputStream( storage ) ) ) {
            out.writeObject( new SerializationProxyExample( "example", 10 ) );
        }
        
        try( final ObjectInputStream in = new ObjectInputStream( Files.newInputStream( storage ) ) ) {
            final SerializationProxyExample instance = ( SerializationProxyExample )in.readObject();
            System.out.println( instance );
            // Some implementation here
        }
    }
}
