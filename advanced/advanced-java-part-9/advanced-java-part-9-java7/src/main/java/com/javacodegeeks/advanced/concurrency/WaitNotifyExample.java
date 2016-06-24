package com.javacodegeeks.advanced.concurrency;

public class WaitNotifyExample {
    private Object lock = new Object();

    public void performAction() {
        synchronized( lock ) {
            while( <condition> ) {
                // Causes the current thread to wait until
                // another thread invokes the notify() or notifyAll() methods.
                lock.wait();
            }
              
            // Some implementation here            
        }
    }
    
    public void performAnotherAction() {
        synchronized( lock ) {              
            // Some implementation here
            
            // Wakes up a single thread that is waiting on this object's monitor.
            lock.notify();
        }
    }
}
