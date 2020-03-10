package Suite;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Aspirante implements Comparable{
    private String nombre;
    private String dni;
    private int telefono;
    private static int num=0;
    private int id;
    private Set<Calificacion> Calificacion;

    public Aspirante(String nombre, String dni, int telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.id=++num;
        Calificacion = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }
    public boolean addCal(Calificacion c){
        return Calificacion.add(c);
    }
    public Double mediaCal(Double d1,double d2){
        return d1;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Aspirante.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Suite.Calificacion> getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Set<Suite.Calificacion> calificacion) {
        Calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aspirante aspirante = (Aspirante) o;
        return getTelefono() == aspirante.getTelefono() &&
                Objects.equals(getNombre(), aspirante.getNombre()) &&
                Objects.equals(getDni(), aspirante.getDni()) &&
                Objects.equals(getCalificacion(), aspirante.getCalificacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDni(), getTelefono(), getCalificacion());
    }

    @Override
    public int compareTo(Object a) {
        return getDni().compareTo(((Aspirante)a).getDni());
    }
}
