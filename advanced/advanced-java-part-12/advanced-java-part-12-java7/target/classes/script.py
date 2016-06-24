from java.lang import Runtime

for it in books: 
    print "Book '%s' is written by %s" % (it.title, it.author)

print "Executed by " + engine.getClass().simpleName
print "Free memory (bytes): " + str( Runtime.getRuntime().freeMemory() )