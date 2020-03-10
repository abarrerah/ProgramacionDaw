package Actividad20;

import java.io.Serializable;
import java.util.Objects;

public class Anfibio implements Serializable {
    private String nombre;
    private String habitat;
    private String alimentacion;

    public Anfibio(String animal, String lugar, String comida) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Anfibio{" +
                "nombre='" + nombre + '\'' +
                ", habitat='" + habitat + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anfibio anfibio = (Anfibio) o;
        return Objects.equals(getNombre(), anfibio.getNombre()) &&
                Objects.equals(getHabitat(), anfibio.getHabitat()) &&
                Objects.equals(getAlimentacion(), anfibio.getAlimentacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getHabitat(), getAlimentacion());
    }
}
