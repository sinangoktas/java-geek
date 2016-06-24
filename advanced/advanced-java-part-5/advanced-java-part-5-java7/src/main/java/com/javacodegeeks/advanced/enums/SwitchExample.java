package com.javacodegeeks.advanced.enums;

public class SwitchExample {

    public void performAction( DaysOfTheWeek instance ) {
        switch( instance ) {
            case MONDAY:
                // Do something
                break;
                
            case TUESDAY:
                // Do something
                break;
            
            // Other enum constants here
        }
    }
}
