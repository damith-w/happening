package com.education.mora_ice_12.i_jiffy.database;

/**
 * Created by drex on 3/12/15.
 */
public class NotificationTable {
    // Identify notification using notification id
    // Use a alphanumeric id with the prefix NOTxxxxxx
    /*
    CREATE TABLE notification(
        notification_id VARCHAR(8) PRIMARY KEY NOT NULL,
        start_time VARCHAR(8),
        end_time VARCHAR(8),
        progress FLOAT
        );
     */
    public static final String ID = "notification_id";

    // notification starting time
    public static final String START_TIME = "start_time";

    // notification end time
    public static final String END_TIME = "end_time";

    // current progress of the notification related event
    public static final String PROGRESS = "progress";


}
