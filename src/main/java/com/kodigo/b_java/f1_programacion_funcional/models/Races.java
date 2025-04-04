package com.kodigo.b_java.f1_programacion_funcional.models;

import java.util.List;

public class Races {
    private String round;
    private String fp1Date;
    private String fp1Time;
    private String url;
    private String raceId;
    private String raceName;
    private Circuit circuit;
    private List<FP1Result> fp1Results;

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getFp1Date() {
        return fp1Date;
    }

    public void setFp1Date(String fp1Date) {
        this.fp1Date = fp1Date;
    }

    public String getFp1Time() {
        return fp1Time;
    }

    public void setFp1Time(String fp1Time) {
        this.fp1Time = fp1Time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRaceId() {
        return raceId;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public List<FP1Result> getFp1Results() {
        return fp1Results;
    }

    public void setFp1Results(List<FP1Result> fp1Results) {
        this.fp1Results = fp1Results;
    }
}
