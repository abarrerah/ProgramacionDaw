package EntregableTema5;


abstract class Aereo extends Vehiculo {
    /**
     * Atributos propios de la clase abstracta
     */
    private float mAltura;
    private String mOaci;

    /**
     * Inicialización de los atributos propios y los heredados de la clase abstracta
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mAltura
     * @param mOaci
     */
    public Aereo(String mNombre, int mNumeroPasajeros, float mAltura, String mOaci) {
        super(mNombre, mNumeroPasajeros);
        this.mAltura=mAltura;
        this.mOaci=mOaci;
    }

    /**
     * Getter y Setters
     * @return
     */
    public float getmAltura() {
        return mAltura;
    }

    public void setmAltura(float mAltura) {
        this.mAltura = mAltura;
    }

    public String getmOaci() {
        return mOaci;
    }

    public void setmOaci(String mOaci) {
        this.mOaci = mOaci;
    }

    /**
     * Método toString de la clase abstracta hija
     * @return
     */
    @Override
    public String toString() {
        return
                " esta volando a " + mAltura +" metros "+
                " codigo OACI" + mOaci + '\'' ;
    }

}
