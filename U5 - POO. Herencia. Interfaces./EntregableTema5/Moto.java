package EntregableTema5;

public class Moto extends Terrestre implements Comparable {

    /**
     * Inicialización de los atributos propios y los heredados de la clase abstracta padre
     *
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mMatricula
     * @param mYear
     * @param c
     */
    public Moto(String mNombre, int mNumeroPasajeros, String mMatricula, int mYear, Color color) {
        super(mNombre, mNumeroPasajeros, mMatricula, mYear,color);
    }

    @Override
    public String toString() {
        return super.toString()+""+getClass();
    }

    @Override
    public int compareTo(Object o) {
        Moto m= (Moto) o;
        return m.getmMatricula().compareTo(((m.getmMatricula())));
    }
}
