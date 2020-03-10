package Actividad18;

import java.io.Serializable;
import java.util.Objects;

public class Carrito implements Serializable {
    private Elemento elemento;

    public Carrito(Elemento elemento) {
        this.elemento = elemento;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrito carrito = (Carrito) o;
        return Objects.equals(getElemento(), carrito.getElemento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElemento());
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "elemento=" + elemento +
                '}';
    }
}
