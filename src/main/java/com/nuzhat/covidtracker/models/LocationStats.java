package com.nuzhat.covidtracker.models;

public class LocationStats {

    private String state;
    private String county;
    private int newTotalCases;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    private int diffFromPrevDay;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }
    public void setCounty(String county) {
        this.county = county;
    }

    public int getNewTotalCases() {
        return newTotalCases;
    }
    public void setNewTotalCases(int newTotalCases) {
        this.newTotalCases = newTotalCases;
    }

    @Override
    public String toString() {
        return getCounty() + " " + getState() + " " + getNewTotalCases();
    }
}
