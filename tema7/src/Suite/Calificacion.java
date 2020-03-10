package Suite;

import java.util.Objects;
import java.util.Set;

public class Calificacion implements Comparable{
    private Set<Pruebas> pruebas;
    private double nota;

    public Calificacion(Pruebas p,double nota) {
        this.nota = nota;
        this.pruebas= (Set<Pruebas>) p;
    }

    public Set<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(Set<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calificacion that = (Calificacion) o;
        return Double.compare(that.getNota(), getNota()) == 0 &&
                Objects.equals(getPruebas(), that.getPruebas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPruebas(), getNota());
    }

    @Override
    public int compareTo(Object o) {
        return (int) (getNota()-((Calificacion)o).getNota());
    }
}
