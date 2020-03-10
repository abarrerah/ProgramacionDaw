package ExamenU5;

import java.util.Objects;

abstract class Personaje {
    /**
     * Atributos de la clase abstracta personaje
     */
    private String mName;
    private float mEnergy;
    private float mAttack;
    private float mDefense;
    protected enum Enum{Encantado,Desencantado}
    protected Enum mEnchant;
    /**
     * Constructor
     */
    public Personaje(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant) {
        this.mName = mName;
        if (mEnergy>0 && mEnergy<1000){
            this.mEnergy = mEnergy;
        }else {
            System.out.println("Eso no se puede ");
        }
        if (mAttack>0 && mAttack<100){
            this.mAttack = mAttack;
        }else {
            System.out.println("Nivel de ataque invalido.");
        }
        if (mDefense>0 && mDefense<100){
            this.mDefense = mDefense;
        }else {
            System.out.println("El nivel de defensa es incorrecto");
        }


        this.mEnchant = mEnchant;
    }
    /**
     * Getters y Setters
     */
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public float getmEnergy() {
        return mEnergy;
    }

    public void setmEnergy(float mEnergy) {
        this.mEnergy = mEnergy;
    }

    public float getmAttack() {
        return mAttack;
    }

    public void setmAttack(float mAttack) {
        this.mAttack = mAttack;
    }

    public float getmDefense() {
        return mDefense;
    }

    public void setmDefense(float mDefense) {
        this.mDefense = mDefense;
    }

    public Enum getmEnchant() {
        return mEnchant;
    }

    public void setmEnchant(Enum mEnchant) {
        this.mEnchant = mEnchant;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return " Nombre " + mName + '\'' +
                " energía " + mEnergy +
                " ataque " + mAttack +
                " defensa " + mDefense +
                " ¿Está encantado? " + mEnchant ;
    }
    /**
     * Método equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Float.compare(personaje.getmEnergy(), getmEnergy()) == 0 &&
                Float.compare(personaje.getmAttack(), getmAttack()) == 0 &&
                Float.compare(personaje.getmDefense(), getmDefense()) == 0 &&
                getmName().equals(personaje.getmName()) &&
                getmEnchant() == personaje.getmEnchant();
    }

}
