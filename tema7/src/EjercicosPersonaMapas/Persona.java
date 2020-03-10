package EjercicosPersonaMapas;

import java.io.Serializable;
import java.util.Objects;

abstract class Persona implements Serializable {
    private String mDni;
    private int mEdad;
    private double mAltura;

    public Persona(String mDni, int mEdad, double mAltura) {
        this.mDni = mDni;
        this.mEdad = mEdad;
        this.mAltura = mAltura;
    }

    public void setmDni(String mDni) {
        this.mDni = mDni;
    }

    public void setmEdad(int mEdad) {
        this.mEdad = mEdad;
    }

    public void setmAltura(double mAltura) {
        this.mAltura = mAltura;
    }

    public String getmDni() {
        return mDni;
    }

    public int getmEdad() {
        return mEdad;
    }

    public double getmAltura() {
        return mAltura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "mDni='" + mDni + '\'' +
                ", mEdad=" + mEdad +
                ", mAltura=" + mAltura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return getmEdad() == persona.getmEdad() &&
                Double.compare(persona.getmAltura(), getmAltura()) == 0 &&
                getmDni().equals(persona.getmDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getmDni(), getmEdad(), getmAltura());
    }
}
