package ej1;

public class Ingrediente {
    /**
     * Atributos de Ingrediente
     */
    private String mNombre;
    private Double mCalorias;

    /**
     * Constructores de Ingrediente
     * @param nombre
     * @param mCalorias
     */
    public Ingrediente (String nombre,Double mCalorias){
        this.mNombre=nombre;
        this.mCalorias=mCalorias;
    }
    public Ingrediente(){
        this.mNombre="Queso";
        this.mCalorias=(double)250;
    }

    public String getmNombre() {
        return mNombre;
    }
}