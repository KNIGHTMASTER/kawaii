package com.tripoin.kawaii.data.provider;

import java.time.ZonedDateTime;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class CurrentTimeDateTimeService implements DateTimeService {

    @Override
    public ZonedDateTime getCurrentDateAndTime() {
        return ZonedDateTime.now();
    }
}
