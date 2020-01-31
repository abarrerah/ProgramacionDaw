package EntregableTema5;

import java.util.Objects;

abstract class Terrestre extends Vehiculo {
    /**
     * Atributos propios de la clase abstracta Terrestre
     */
    private int mNumPersonasTransporta;
    private String mMatricula;
    private int mYear;;
    protected enum  Color {Amarillo,Azul,Rojo,Verde};
    private Color mColor;

    /**
     * Inicialización de los atributos propios y los heredados de la clase abstracta padre
     * @param mNumPersonasTransporta;
     * @param mNombre
     * @param mNumeroPasajeros
     * @param mMatricula
     * @param mYear
     * @param mColor
     */
    public Terrestre(String mNombre, int mNumeroPasajeros,String mMatricula,int mYear,Color color) {
        super(mNombre, mNumeroPasajeros);
        this.mMatricula=mMatricula;
        this.mYear=mYear;
        this.mColor=color;
        mNumeroPasajeros=0;


    }

    /**
     * Getters y Setters de la clase abstracta
     * @return
     */
    public String getmMatricula() {
        return mMatricula;
    }

    public void setmMatricula(String mMatricula) {
        this.mMatricula = mMatricula;
    }

    public int getmYear() {
        return mYear;
    }

    public void setmYear(int mYear) {
        this.mYear = mYear;
    }

    public Color getmColor() {
        return mColor;
    }

    public void setmColor(Color mColor) {
        this.mColor = mColor;
    }

    public int getmNumPersonasTransporta() {
        return mNumPersonasTransporta;
    }

    public void setmNumPersonasTransporta(int mNumPersonasTransporta) {
        this.mNumPersonasTransporta = mNumPersonasTransporta;
    }

    public  boolean transporta(int pasajeros){
        this.mNumPersonasTransporta=pasajeros;
        if (getmNumeroPasajeros()-getmNumPersonasTransporta()>0){
            return true;
        }else {
            return false;
        }

    }
    /**
     * Método toString de la clase abstracta
     * @return
     */
    @Override
    public String toString() {
        return
                " la matricula es " + mMatricula + '\'' +
                " el año es " + mYear +
                ", y el color es " + mColor ;
    }

    /**
     * Método equals para igual en la clase abstracta
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestre terrestre = (Terrestre) o;
        return getmMatricula().equals(terrestre.getmMatricula());
    }

}
