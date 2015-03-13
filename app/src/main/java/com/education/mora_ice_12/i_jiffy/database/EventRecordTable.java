package com.education.mora_ice_12.i_jiffy.database;

import java.io.StringBufferInputStream;

/**
 * Created by drex on 3/12/15.
 */
public class EventRecordTable {
    /*
    CREATE TABLE event_record(
        event_id VARCHAR(8) PRIMARY KEY NOT NULL,
        title VARCHAR(30) NOT NULL,
        due_date DATE,
        description VARCHAR(200),

        );
    */
    // primary key for event
    // please use EVE prefix
    public static final String ID = "event_id";

    // Title of the event
    public static final String TITLE = "title";

    // Due date to finish the event
    public static final String DUE_DATE = "due_date";

    // Description of the event
    public static final String DESCRIPTION = "description";

    // Boolean value to hold whether event is repeated or not
    public static final String REPEATED = "repeated";

}
