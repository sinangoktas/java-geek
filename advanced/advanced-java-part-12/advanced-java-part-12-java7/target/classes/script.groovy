books.each { 
    println "Book '$it.title' is written by $it.author"
}

println "Executed by ${engine.getClass().simpleName}"
println "Free memory (bytes): " + Runtime.getRuntime().freeMemory()