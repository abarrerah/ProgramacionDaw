package ExamenU5;

import java.util.Objects;

public class Magos extends Humanos implements Magia {
    /**
     * Atributo propio de mago
     */
    private float mlenghtBeard;
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Magos(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant,float mlenghtBeard) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
        this.mlenghtBeard=mlenghtBeard;
    }
    /**
     * Getters y Setters
     */
    public float getMlenghtBeard() {
        return mlenghtBeard;
    }

    public void setMlenghtBeard(float mlenghtBeard) {
        this.mlenghtBeard = mlenghtBeard;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return super.toString()+" y la longitud de la barba es "+mlenghtBeard;
    }
    /**
     * Equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magos magos = (Magos) o;
        return Float.compare(magos.getMlenghtBeard(), getMlenghtBeard()) == 0;
    }

    /**
     * Métodos implementados
     * @param o
     */
    @Override
    public void encantar(Object o) {
        Personaje p = (Personaje) o;
    if (p.mEnchant==Enum.Desencantado){
        p.setmEnchant(Enum.Encantado);
    }
    }

    @Override
    public void desencantar(Object o) {
        Personaje p = (Personaje) o;
    if (p.getmEnchant()==Enum.Encantado){
        p.setmEnchant(Enum.Desencantado);
    }
    }
}
