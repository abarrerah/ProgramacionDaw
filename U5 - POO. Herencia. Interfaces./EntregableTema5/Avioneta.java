package EntregableTema5;

public class Avioneta extends Aereo {
    /**
     * Inicialización de los atributos heredados de la clase abstracta
     *
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mAltura
     * @param mOaci
     */
    public Avioneta(String mNombre, int mNumeroPasajeros, float mAltura, String mOaci) {
        super(mNombre, mNumeroPasajeros, mAltura, mOaci);
    }

    /**
     * Método toString para la clase Avioneta
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+""+getClass()+""+getmOaci()+" Esta volando a una altitud de "+getmAltura();
    }
}
