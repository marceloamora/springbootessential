package com.essencials.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtil {

    public String formatLocalDateTimeToDateDataBaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(localDateTime);
    }
}
