package EntregableTema5;

public class Helicoptero extends Aereo {
    /**
     * Inicialización de los atributos propios y los heredados de la clase abstracta
     *
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mAltura
     * @param mOaci
     */
    public Helicoptero(String mNombre, int mNumeroPasajeros, float mAltura, String mOaci) {
        super(mNombre, mNumeroPasajeros, mAltura, mOaci);

    }


    /**
     * Inicialización de los los heredados de la clase abstracta
     *
     * @param mNombre
     * @param mNumeroPasajeros
     *
     * @param mOaci
     */


    /**
     * Método añadir personas y obtener altura
     * @return
     */
    public boolean getAddPeople(){
        if (getmNumeroPasajeros()-9>0) {
            return true;
        }
        else {
            return false;
        }
    }
    public float getAltura(float mAltura){
        if (getmAltura()==0){
            return mAltura;
        }else {
            return getmAltura();
        }
    }

    /**
     * Método toString de helicoptero
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+""+getClass();
    }
}
