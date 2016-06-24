package com.javacodegeeks.advanced.enums;

public enum DaysOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public boolean isWeekend( DaysOfTheWeek day ) {
        return( day == SATURDAY || day == SUNDAY );
    }
}
