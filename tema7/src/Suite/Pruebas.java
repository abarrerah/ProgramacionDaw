package Suite;

import java.util.Date;
import java.util.Objects;

public class Pruebas {
  private String nombre;
  protected enum Enum{Oral,Escrita}
  protected Enum tipo;
  private Date fecha;

    public Pruebas(String nombre, Enum tipo, Date fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pruebas pruebas = (Pruebas) o;
        return Objects.equals(nombre, pruebas.nombre) &&
                tipo == pruebas.tipo &&
                Objects.equals(fecha, pruebas.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, fecha);
    }

    @Override
    public String toString() {
        return "Pruebas{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                '}';
    }
}
