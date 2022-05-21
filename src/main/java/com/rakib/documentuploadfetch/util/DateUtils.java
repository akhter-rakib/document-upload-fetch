package com.rakib.documentuploadfetch.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {
    private DateUtils() {
    }

    public static String getStringDate(Date date, String format) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(date);
        } catch (Exception e) {
            return null;
        }
    }
}
