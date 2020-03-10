package Actividad18;

import java.io.Serializable;
import java.util.Objects;

public class Elemento implements Serializable {
    private String Nombre;
    private float Precio;
    private int Cantidad;

    public Elemento(String nombre, float precio, int cantidad) {
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                ", Cantidad=" + Cantidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elemento elemento = (Elemento) o;
        return Float.compare(elemento.getPrecio(), getPrecio()) == 0 &&
                getCantidad() == elemento.getCantidad() &&
                Objects.equals(getNombre(), elemento.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getPrecio(), getCantidad());
    }
}
