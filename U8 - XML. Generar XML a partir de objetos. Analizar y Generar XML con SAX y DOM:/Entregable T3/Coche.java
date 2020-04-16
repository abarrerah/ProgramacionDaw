package tema8.Entregable3;

import java.util.Objects;

public class Coche {
    private int id;
    private String matricula;
    private String modelo;
    private String motor;

    public Coche(){

    }

    public Coche(int id, String matricula, String modelo, String motor) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return getId() == coche.getId() &&
                Objects.equals(getMatricula(), coche.getMatricula()) &&
                Objects.equals(getModelo(), coche.getModelo()) &&
                Objects.equals(getMotor(), coche.getMotor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMatricula(), getModelo(), getMotor());
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
