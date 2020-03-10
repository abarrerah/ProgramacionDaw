package Examen;

import java.io.Serializable;
import java.util.*;

public class Concurso implements Serializable {
    private String championshipName;
    private String place;
    private Map<String,Dog> dogMap=new HashMap<>();

    public Concurso(String championshipName, String place, Map<String, Dog> dogMap) {
        this.championshipName = championshipName;
        this.place = place;
        this.dogMap = dogMap;
    }

    public String getChampionshipName() {
        return championshipName;
    }

    public void setChampionshipName(String championshipName) {
        this.championshipName = championshipName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Map<String, Dog> getDogMap() {
        return dogMap;
    }

    public void setDogMap(Map<String, Dog> dogMap) {
        this.dogMap = dogMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concurso concurso = (Concurso) o;
        return Objects.equals(getChampionshipName(), concurso.getChampionshipName()) &&
                Objects.equals(getPlace(), concurso.getPlace()) &&
                Objects.equals(getDogMap(), concurso.getDogMap());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChampionshipName(), getPlace(), getDogMap());
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "championshipName='" + championshipName + '\'' +
                ", place='" + place + '\'' +
                ", dogMap=" + dogMap +
                '}';
    }
}
