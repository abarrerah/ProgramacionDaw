package EntregableT4;

import java.util.ArrayList;
import java.util.Objects;

public class Players {
    private String nombre;
    private int dorsal;
    private String team;
    private ArrayList<Position> position;

    public Players(String nombre, int dorsal,String team) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.team=team;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public ArrayList<Position> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<Position> position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return getDorsal() == players.getDorsal() &&
                Objects.equals(getNombre(), players.getNombre()) &&
                Objects.equals(getTeam(), players.getTeam()) &&
                Objects.equals(getPosition(), players.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDorsal(), getTeam(), getPosition());
    }

    @Override
    public String toString() {
        return "Players{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", team='" + team + '\'' +
                ", position=" + position +
                '}';
    }
}
