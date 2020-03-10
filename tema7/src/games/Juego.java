package games;

import java.io.Serializable;
import java.util.Objects;

public class Juego implements Serializable {
    private String nombre;
    private String tematica;
    private int numarmas;
    private String codigo;

    public Juego(String nombre, String tematica, int numarmas, String codigo) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.numarmas = numarmas;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumarmas() {
        return numarmas;
    }

    public void setNumarmas(int numarmas) {
        this.numarmas = numarmas;
    }

    public String getCodigo() {
        return String.valueOf(Integer.parseInt(codigo));
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return getNumarmas() == juego.getNumarmas() &&
                getCodigo() == juego.getCodigo() &&
                Objects.equals(getNombre(), juego.getNombre()) &&
                Objects.equals(getTematica(), juego.getTematica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getTematica(), getNumarmas(), getCodigo());
    }
}
