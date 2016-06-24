package com.javacodegeeks.advanced.generic;

import java.io.IOException;
import java.util.TimeZone;

public interface TimezoneService {
    TimeZone getTimeZone( final double lat, final double lon ) throws IOException;
}