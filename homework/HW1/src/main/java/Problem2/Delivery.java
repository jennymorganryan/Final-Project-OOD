package org.example;

public class Delivery {
    private String startLocation;
    private String endLocation;
    private Time startTime;
    private Time endTime;


    public Delivery(String startLocation, String endLocation, Time startTime, Time endTime) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // used chat to assist
    public Time getDuration() {
        int startInSeconds = startTime.toSeconds();
        int endInSeconds = endTime.toSeconds();
        int durationInSeconds = endInSeconds - startInSeconds;
        return Time.fromSeconds(durationInSeconds);
    }
    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
