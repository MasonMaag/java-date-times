package com.devmountain.currentdate;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class WorldClock {

    public LocalDate getNowForDate() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDateTime getNowForDateAndTime() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        return getNowDatetimeId("America/New_York");
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return getNowDatetimeId("America/Los_Angeles");
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        return getNowDatetimeId("Europe/London");
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return getNowDatetimeId("Europe/Moscow");
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return getNowDatetimeId("Asia/Tokyo");
    }

    private ZonedDateTime getNowDatetimeId(String zoneId) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime zonedDateTime = now.withZoneSameInstant(ZoneId.of(zoneId));
        return zonedDateTime;
    }
}
