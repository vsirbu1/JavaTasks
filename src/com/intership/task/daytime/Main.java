package com.intership.task.daytime;

import java.time.*;

public class Main {
    public static void main(String[] args) {
//Task1
        //FB takes the plane from Sydney (SYD) to Los Angeles (LAX). The flight starts
        //at 11:15 AM local Sydney time and ends at 06:00 AM local LA time.
        // What is the duration of flight
        ZonedDateTime SYD = ZonedDateTime.of(2018, 11, 14, 11, 15, 0, 0, ZoneId.of("Australia/Sydney"));
        ZonedDateTime LAX = ZonedDateTime.of(2018, 11, 14, 6, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
        System.out.println("Duration of flying: " + Duration.between(SYD, LAX).toString().substring(2));
        //Task 2
        //Star Wars Episode IV was released on May 25, 1977 and has a running time of 120 minutes.
        //Assume that it was played in cinemas on premiere (May 25, 1977) and then only once a day every Saturday and Sunday
        //What day of the week was in released?
        // How many times was it played in the first 2 years?
        //How many TOTAL minutes/hours/days of playtime it summed up in the 1st year?
        //Bonus
        //Assume that it was also played on every February 29th and never on January 1st. Recalculate the above questions.
        LocalDate premiereStarWars = LocalDate.of(1977, 5, 25);
        LocalDate twoYearsDate = LocalDate.of(1979, 5, 25);
        LocalDate oneYearDate = LocalDate.of(1978, 5, 25);
        LocalDate currentDate = LocalDate.of(1977, 5, 26);
        System.out.println("Premiere day was "+premiereStarWars.getDayOfWeek());
        double i=1;
        while (!currentDate.isAfter(twoYearsDate))
        {
            if(currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)||currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY))
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

//        System.out.println("Bonus Part");
//        currentDate = LocalDate.of(1977, 5, 26);
//        i=1;
//        while (!currentDate.isAfter(twoYearsDate))
//        {
//            if((currentDate.getDayOfWeek().equals(DayOfWeek.SUNDAY ) && (currentDate.getMonth()==Month.JANUARY && currentDate.getDayOfMonth()!=1)||currentDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)||(currentDate.getMonth()==Month.FEBRUARY && currentDate.getDayOfMonth()==29))
//            {
//                i++;
//            }
//            if(currentDate.equals(oneYearDate))
//            {
//                double d=i*120/60/24;
//                System.out.println("In first year film played:");
//                System.out.println((int) i*120+" minutes or");
//                System.out.println((int) i*120/60+" hours, or");
//                System.out.println(d+" days");
//            }
//            currentDate=currentDate.plusDays(1);
//        }
//        int s=(int) i;
//        System.out.println("In 2 year film played "+s+ " times");

    }
}
