package com.company;

import java.sql.Timestamp;
import java.time.DayOfWeek;

public class ArrayOfAirlines {

    Airline[] mas;

    ArrayOfAirlines(Airline[] mas){
        this.mas = mas;
    }

    void printByDestination(String destination){
        System.out.println("print by destination");
        for(int i=0; i<mas.length; i++){
            if(mas[i].getDestination().equals(destination)){
                System.out.println(mas[i]);
            }
        }
    }

    void printByDay(DayOfWeek day){
        System.out.println("print by day");
        for(int i=0; i<mas.length; i++){
            if(mas[i].checkOnDay(day)){
                System.out.println(mas[i]);
            }
        }
    }

    void printByDayAndTime(DayOfWeek day, int hour, int minute){
        System.out.println("print by day and time");
        Timestamp time = new Timestamp(0,0,0,hour,minute,0,0);
        for(int i=0; i<mas.length; i++){
            if(mas[i].checkOnDay(day)){
                if(mas[i].getTime().after(time)){
                    System.out.println(mas[i]);
                }
            }
        }
    }

}
