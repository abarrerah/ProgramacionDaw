package EntregableTema5;

abstract class Vehiculo {
    /**
     * Atributos de la clase abstracta principal
     */
    private String mNombre;
    private int mNumeroPasajeros;

    /**
     * Constructor de la clase abstracta
     * @param mNombre
     * @param mNumeroPasajeros
     */
    public Vehiculo(String mNombre, int mNumeroPasajeros) {
        this.mNombre = mNombre;
        this.mNumeroPasajeros = mNumeroPasajeros;

    }

    /**
     * Getter y Setters de la clase abstracta principal
     * @return
     */
    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public int getmNumeroPasajeros() {
        return mNumeroPasajeros;
    }

    public void setmNumeroPasajeros(int mNumeroPasajeros) {
        this.mNumeroPasajeros = mNumeroPasajeros;
    }


    /**
     * Método toString de la clase abstracta principal
     * @return
     */
    @Override
    public String toString() {
        return
                "El nombre es " + mNombre + '\'' +
                " numero de pasajeros " + mNumeroPasajeros ;
    }
}
