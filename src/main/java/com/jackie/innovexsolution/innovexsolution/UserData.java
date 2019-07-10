package com.jackie.innovexsolution.innovexsolution;

public class UserData {
    private String principal;
    private String rate;
    private int months;
    private String lowerLimit;
    private String highestLimit;


    public UserData(String principal, String rate, int months, String lowerLimit, String highestLimit) {
        this.principal = principal;
        this.months = months;
        this.rate = rate;
        this.lowerLimit = lowerLimit;
        this.highestLimit = highestLimit;
    }

    public UserData(){}

    public String getPrincipal() {
        return principal;
    }

    public int getMonths() {
        return months;
    }

    public String getRate() {
        return rate;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public String getHighestLimit() {
        return highestLimit;
    }

}