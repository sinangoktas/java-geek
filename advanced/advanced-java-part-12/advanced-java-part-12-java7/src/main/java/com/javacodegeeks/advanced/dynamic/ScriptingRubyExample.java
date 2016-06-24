package com.javacodegeeks.advanced.dynamic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collection;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptingRubyExample {
	public static void main(String[] args) throws ScriptException, IOException {
	    final ScriptEngineManager factory = new ScriptEngineManager();
	    final ScriptEngine engine = factory.getEngineByName( "jruby" );
	    
	    final Collection< Book > books = Arrays.asList(
	            new Book( "Sandi Metz", "Practical Object-Oriented Design in Ruby" ),
	            new Book( "Paolo Perrotta", "Metaprogramming Ruby 2" )
	        );
	            
	    final Bindings bindings = engine.createBindings();
	    bindings.put( "books", books );
        bindings.put( "engine", engine );
        
        try( final Reader reader = new InputStreamReader( Book.class.getResourceAsStream("/script.jruby" ) ) ) {
            engine.eval( reader, bindings );        
        }
	}
}
