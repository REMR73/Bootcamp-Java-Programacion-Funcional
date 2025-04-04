package com.kodigo.b_java.f1_programacion_funcional.models;

public class Team {
    private String teamId;
    private String teamName;
    private String nationality;
    private int firstAppareance;
    private Integer constructorsChampionships;
    private Integer driversChampionships;
    private String url;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getFirstAppareance() {
        return firstAppareance;
    }

    public void setFirstAppareance(int firstAppareance) {
        this.firstAppareance = firstAppareance;
    }

    public Integer getConstructorsChampionships() {
        return constructorsChampionships;
    }

    public void setConstructorsChampionships(Integer constructorsChampionships) {
        this.constructorsChampionships = constructorsChampionships;
    }

    public Integer getDriversChampionships() {
        return driversChampionships;
    }

    public void setDriversChampionships(Integer driversChampionships) {
        this.driversChampionships = driversChampionships;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
