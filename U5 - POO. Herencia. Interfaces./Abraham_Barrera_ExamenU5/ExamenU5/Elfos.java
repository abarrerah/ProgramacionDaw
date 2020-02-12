package ExamenU5;

import java.util.Objects;

public class Elfos extends Personaje implements Atacar{
    /**
     * Atributos propios de elfos
     */
    protected enum Enum{Bosque,Costa}
    protected Enum mType;
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Elfos(String mName, float mEnergy, float mAttack, float mDefense, Personaje.Enum mEnchant, Enum mType) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
        this.mType=mType;
    }
    /**
     * Getter y Setter
     */
    public Enum getmType() {
        return mType;
    }

    public void setmType(Enum mType) {
        this.mType = mType;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return super.toString()+" es del tipo "+mType;
    }

    /**
     * Método Equals
     * @param o
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Elfos elfos = (Elfos) o;
        return getmType() == elfos.getmType();
    }
    /**
     * Implementación del método atacar
     * @param e
     */
    @Override
    public void atacarPersonaje(Elfos e) {
        System.out.println("No se pueden atacar a miembros de la misma especie");
    }
    @Override
    public void atacarPersonaje(Enanos e) {

        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()== Personaje.Enum.Encantado){
                resultado=e.getmEnergy()-((getmAttack()*2)-e.getmDefense());
                e.setmEnergy(resultado);
                System.out.println(getmName()+" Estoy atacando. Legolas, ¿Cuantos llevas? ¡Este era mi noveno! "+getmAttack()*2);
            }
            else {
                e.setmEnergy(resultado);
                System.out.println("Estoy atacando "+getmAttack());
            }
        }
    }

    @Override
    public void atacarPersonaje(Guerreros e) {
        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()== Personaje.Enum.Encantado){
                resultado=e.getmEnergy()-((getmAttack()*2)-e.getmDefense());
                e.setmEnergy(resultado);
                System.out.println(getmName()+" Estoy atacando. Legolas, ¿Cuantos llevas? ¡Este era mi noveno! "+getmAttack()*2);
            }
            else {
                e.setmEnergy(resultado);
                System.out.println("Estoy atacando "+getmAttack());
            }

        }
    }
    @Override
    public void atacarPersonaje(Magos e) {
        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()== Personaje.Enum.Encantado){
                resultado=e.getmEnergy()-((getmAttack()*2)-e.getmDefense());
                e.setmEnergy(resultado);
                System.out.println(getmName()+" Estoy atacando."+getmAttack()*2);
            }
            else {
                e.setmEnergy(resultado);
                System.out.println("Estoy atacando "+getmAttack());
            }

        }

    }

    @Override
    public void atacarPersonaje(Orcos e) {
        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()== Personaje.Enum.Encantado){
                resultado=e.getmEnergy()-((getmAttack()*2)-e.getmDefense());
                e.setmEnergy(resultado);
                System.out.println(getmName()+" Estoy atacando. Legolas, ¿Cuantos llevas? ¡Este era mi noveno! "+getmAttack()*2);
            }
            else {
                e.setmEnergy(resultado);
                System.out.println("Estoy atacando "+getmAttack());
            }

        }
    }
}
