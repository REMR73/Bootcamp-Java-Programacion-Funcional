package com.kodigo.b_java.f1_programacion_funcional.models;

public class FP1Result {
    private int fp1Id;
    private String driverId;
    private String teamId;
    private String time;
    private Driver driver;
    private Team team;

    public int getFp1Id() {
        return fp1Id;
    }

    public void setFp1Id(int fp1Id) {
        this.fp1Id = fp1Id;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
