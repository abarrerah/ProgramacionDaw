package NuevoEntregable;

import java.util.ArrayList;
import java.util.Objects;

public class Futbolista {
    private  int dorsal;
    private String nombre;
    private ArrayList <String> position;
    private String equipo;

    public Futbolista(int dorsal, String nombre, ArrayList<String> position, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.position = position;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<String> position) {
        this.position = position;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return getDorsal() == that.getDorsal() &&
                Objects.equals(getNombre(), that.getNombre()) &&
                Objects.equals(getPosition(), that.getPosition()) &&
                Objects.equals(getEquipo(), that.getEquipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDorsal(), getNombre(), getPosition(), getEquipo());
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", position=" + position +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
