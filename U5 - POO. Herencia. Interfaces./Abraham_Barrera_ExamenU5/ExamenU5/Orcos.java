package ExamenU5;

import java.util.Objects;

public class Orcos extends Personaje implements Atacar {
    /**
     * Atributo propio de Orco
     */
    private float mWeight;
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Orcos(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant, float mWeight) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
        this.mWeight=mWeight;
    }
    /**
     * Getter y Setter
     */
    public float getmWeight() {
        return mWeight;
    }

    public void setmWeight(float mWeight) {
        this.mWeight = mWeight;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return super.toString()+" y tiene un peso de "+mWeight;
    }
    /**
     * Método equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orcos orcos = (Orcos) o;
        return Float.compare(orcos.getmWeight(), getmWeight()) == 0;
    }
    /**
     * Implementación del método atacar
     * @param e
     */
    @Override
    public void atacarPersonaje(Elfos e) {

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
            if (getmEnchant()==Enum.Encantado){
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
        System.out.println("No se pueden atacar a miembros de la misma especie");

    }
}
