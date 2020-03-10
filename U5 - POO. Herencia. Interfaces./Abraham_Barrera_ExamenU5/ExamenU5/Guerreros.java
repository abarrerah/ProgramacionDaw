package ExamenU5;

import java.util.Objects;

public class Guerreros extends Humanos implements Atacar {
    /**
     * Atributos de la clase Guerrero
     */
    private int mAge;
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Guerreros(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant,int mAge) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
        this.mAge=mAge;
    }
    /**
     * Getters y Setters
     */
    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return super.toString()+" y con una edad de "+mAge;
    }
    /**
     * Método equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guerreros guerreros = (Guerreros) o;
        return getmAge() == guerreros.getmAge();
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
        System.out.println("No se pueden atacar a miembros de la misma especie");
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
