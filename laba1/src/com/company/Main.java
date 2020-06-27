package com.company;

import java.sql.Timestamp;
import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Airline[] mas = new Airline[n];
        DayOfWeek[] days = {DayOfWeek.MONDAY, DayOfWeek.FRIDAY};
        Airline air = new Airline("minsk", 5, 7, 4,5, days);
        mas[0] = air;
        DayOfWeek[] days1 = {DayOfWeek.THURSDAY, DayOfWeek.WEDNESDAY};
        Airline air1 = new Airline("minsk", 9, 4, 11,24, days1);
        mas[1] = air1;
        DayOfWeek[] days2 = {DayOfWeek.MONDAY, DayOfWeek.FRIDAY};
        Airline air2 = new Airline("unknown", 5, 3, 3,5, days2);
        mas[2] = air2;
        DayOfWeek[] days3 = {DayOfWeek.SUNDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY};
        Airline air3 = new Airline("dubai", 2, 7, 17,34, days3);
        mas[3] = air3;
        DayOfWeek[] days4 = {DayOfWeek.THURSDAY, DayOfWeek.SUNDAY};
        Airline air4 = new Airline("spacex", 8, 3, 11,48, days4);
        mas[4] = air4;
        ArrayOfAirlines arrayOfAirlines = new ArrayOfAirlines(mas);
        arrayOfAirlines.printByDestination("minsk");
        arrayOfAirlines.printByDay(DayOfWeek.MONDAY);
        arrayOfAirlines.printByDayAndTime(DayOfWeek.MONDAY,4, 0);
    }
}
