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
    // Metodo para convertir el tiempo en formato mm:ss.SSS a segundos (double)
    public double getTiempoEnSegundos() {
        String[] parts = time.split(":");
        double minutes = Double.parseDouble(parts[0]);
        double seconds = Double.parseDouble(parts[1].split("\\.")[0]);
        double milliseconds = Double.parseDouble(parts[1].split("\\.")[1]);

        // Convertimos todo a segundos
        return minutes * 60 + seconds + milliseconds / 1000;
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
