package com.kodigo.b_java.f1_programacion_funcional.models;

public class F1Response {
    private String api;
    private String url;
    private int limit;
    private int offset;
    private int total;
    private String season;
    private Races races;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Races getRaces() {
        return races;
    }

    public void setRaces(Races races) {
        this.races = races;
    }
}
