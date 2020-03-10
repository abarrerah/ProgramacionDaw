package EjercicosPersonaMapas;

import java.io.Serializable;
import java.util.Objects;

public class Empleado extends Persona implements Serializable {
    private double mSaldo;
    public Empleado(String mDni, int mEdad, double mAltura) {
        super(mDni, mEdad, mAltura);
    }

    public double getmSaldo() {
        return mSaldo;
    }

    public void setmSaldo(double mSaldo) {
        this.mSaldo = mSaldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.getmSaldo(), getmSaldo()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getmSaldo());
    }

    @Override
    public String toString() {
        return super.toString()+" y el saldo "+getmSaldo();
    }
}
