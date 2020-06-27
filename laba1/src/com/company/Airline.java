package com.company;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.util.Arrays;


public class Airline {
    String destination;
    int flightNumber;
    int planeType;
    Timestamp time;
    DayOfWeek[] days;
    public Airline(String destination, int flightNumber, int planeType, int hour, int minute, DayOfWeek[] days){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.time = new Timestamp(0,0,0,hour,minute,0,0);
        this.days = days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPlaneType(int planeType) {
        this.planeType = planeType;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getPlaneType() {
        return planeType;
    }

    public String getDestination() {
        return destination;
    }

    public Timestamp getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", planeType=" + planeType +
                ", time=" + time.getHours() + ":" + time.getMinutes() +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    public boolean checkOnDay(DayOfWeek day){
        for(int i=0;i<days.length;i++){
            if(days[i] == day){
                return true;
            }
        }
        return false;
    }
}
