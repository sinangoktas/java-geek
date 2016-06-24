package com.javacodegeeks.advanced.generic;

import java.io.IOException;
import java.util.TimeZone;

public class TimezoneServiceTestImpl implements TimezoneService {
    @Override
    public TimeZone getTimeZone(final double lat, final double lon) throws IOException {
        return TimeZone.getDefault();
    }
}