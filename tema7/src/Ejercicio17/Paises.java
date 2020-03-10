package Ejercicio17;

import java.io.Serializable;
import java.util.Objects;

public class Paises implements Serializable {
    private String nombre;
    private String capital;

    public Paises(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paises paises = (Paises) o;
        return Objects.equals(getNombre(), paises.getNombre()) &&
                Objects.equals(getCapital(), paises.getCapital());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCapital());
    }
}
