package com.javacodegeeks.advanced.dynamic;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptingJavaScriptExample {
	public static void main( String[] args ) throws ScriptException {
        final ScriptEngineManager factory = new ScriptEngineManager();
        final ScriptEngine engine = factory.getEngineByName( "JavaScript" );
        
        final Bindings bindings = engine.createBindings();
        bindings.put( "str", "Calling JavaScript" );
        bindings.put( "engine", engine );
        
        engine.eval( "print(str + ' from ' + engine.getClass().getSimpleName() )", bindings );
	}
}
