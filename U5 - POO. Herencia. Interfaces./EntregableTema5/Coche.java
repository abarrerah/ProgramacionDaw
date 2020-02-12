package EntregableTema5;

public class Coche extends Terrestre implements Comparable {
    /**
     * Inicialización de los atributos heredados de la clase abstracta padre
     *
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mMatricula
     * @param mYear
     * @param mColor
     */
    public Coche(String mNombre, int mNumeroPasajeros, String mMatricula, int mYear, Color mColor) {
        super(mNombre, mNumeroPasajeros, mMatricula, mYear, mColor);
    }

    @Override
    public String toString() {
        return super.toString()+""+getClass();
    }

    @Override
    public int compareTo(Object o) {
        Coche c= (Coche) o;
        return getmMatricula().compareTo(c.getmMatricula());
    }
}
