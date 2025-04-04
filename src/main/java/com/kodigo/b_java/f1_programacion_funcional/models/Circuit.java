package com.kodigo.b_java.f1_programacion_funcional.models;

public class Circuit {
    private String circuitId;
    private String circuitName;
    private String country;
    private String city;
    private String circuitLength;
    private String lapRecord;
    private int firstParticipationYear;
    private int corners;
    private String fastestLapDriverId;
    private String fastestLapTeamId;
    private int fastestLapYear;
    private String url;

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCircuitLength() {
        return circuitLength;
    }

    public void setCircuitLength(String circuitLength) {
        this.circuitLength = circuitLength;
    }

    public String getLapRecord() {
        return lapRecord;
    }

    public void setLapRecord(String lapRecord) {
        this.lapRecord = lapRecord;
    }

    public int getFirstParticipationYear() {
        return firstParticipationYear;
    }

    public void setFirstParticipationYear(int firstParticipationYear) {
        this.firstParticipationYear = firstParticipationYear;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    public String getFastestLapDriverId() {
        return fastestLapDriverId;
    }

    public void setFastestLapDriverId(String fastestLapDriverId) {
        this.fastestLapDriverId = fastestLapDriverId;
    }

    public String getFastestLapTeamId() {
        return fastestLapTeamId;
    }

    public void setFastestLapTeamId(String fastestLapTeamId) {
        this.fastestLapTeamId = fastestLapTeamId;
    }

    public int getFastestLapYear() {
        return fastestLapYear;
    }

    public void setFastestLapYear(int fastestLapYear) {
        this.fastestLapYear = fastestLapYear;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
