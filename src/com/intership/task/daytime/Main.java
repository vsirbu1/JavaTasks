package com.intership.task.daytime;

import java.time.*;

public class Main {
    public static void main(String[] args) {
//Task1
        ZonedDateTime SYD = ZonedDateTime.of(2018, 11, 14, 11, 15, 0, 0, ZoneId.of("Australia/Sydney"));
        ZonedDateTime LAX = ZonedDateTime.of(2018, 11, 14, 6, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
        System.out.println("Duration of flying: " + Duration.between(SYD, LAX).toString().substring(2));
        //Task 2
        LocalDate premiereStarWars = LocalDate.of(1977, 5, 25);
        LocalDate twoYearsDate = LocalDate.of(1979, 5, 25);
        LocalDate oneYearDate = LocalDate.of(1978, 5, 25);
        LocalDate currentDate = LocalDate.of(1977, 5, 25);
        System.out.println("Premiere day was "+premiereStarWars.getDayOfWeek());
        double i=0;
        while (!currentDate.isAfter(twoYearsDate))
        {
            if(currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)||currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY))
            {
                i++;
            }
            if(currentDate.equals(oneYearDate))
            {
                double d=i*120/60/24;
                System.out.println("In first year film played:");
                System.out.println((int) i*120+" minutes or");
                System.out.println((int) i*120/60+" hours, or");
                System.out.println(d+" days");
            }
            currentDate=currentDate.plusDays(1);
        }
        int s=(int) i;
        System.out.println("In 2 year film played "+s+ " times");
    }
}
