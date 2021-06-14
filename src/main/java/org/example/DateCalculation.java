package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateCalculation {
    public static void main(String[] args) {
        calculateAndShowDate(new Date());

    }

    public static void calculateAndShowDate(Date date1){
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondFriday = firstInYear.with(TemporalAdjusters
                .nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println("Second Friday on : " + secondFriday);
    }
}
