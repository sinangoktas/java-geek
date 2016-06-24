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

public class ScriptingPythonExample {
	public static void main(String[] args) throws ScriptException, IOException {
	    final ScriptEngineManager factory = new ScriptEngineManager();
	    final ScriptEngine engine = factory.getEngineByName( "jython" );
	    
	    final Collection< Book > books = Arrays.asList(
	            new Book( "Mark Lutz", "Learning Python" ),
	            new Book( "Jamie Chan", "Learn Python in One Day and Learn It Well" )
	        );
	            
	    final Bindings bindings = engine.createBindings();
	    bindings.put( "books", books );
        bindings.put( "engine", engine );
        
        try( final Reader reader = new InputStreamReader( Book.class.getResourceAsStream("/script.py" ) ) ) {
            engine.eval( reader, bindings );        
        }
	}
}
