package org.example;

public class Time {
    private int minute;
    private int second;
    private int hour;

    private Time(int hour, int minute, int second) {
        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    //Returns a new Time object given total seconds.

    public static Time fromSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;
        return new Time(hours, minutes, seconds);
    }

}
