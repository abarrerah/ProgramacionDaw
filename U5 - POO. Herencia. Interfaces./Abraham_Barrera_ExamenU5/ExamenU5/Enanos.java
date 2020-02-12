package ExamenU5;

import java.util.Objects;

public class Enanos extends Personaje implements Atacar {
    /**
     * Atributos propios
     */
    private float mHeight;
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Enanos(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant, float mHeight) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
        this.mHeight=mHeight;
    }
    /**
     * Getters y Setters
     */
    public float getmHeight() {
        return mHeight;
    }

    public void setmHeight(float mHeight) {
        this.mHeight = mHeight;
    }
    /**
     * Método toString
     */
    @Override
    public String toString() {
        return super.toString()+" con una altura de "+mHeight;
    }
    /**
     * Método equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Enanos enanos = (Enanos) o;
        return Float.compare(enanos.getmHeight(), getmHeight()) == 0;
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
            if (getmEnchant()==Enum.Encantado){
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
        System.out.println("No se pueden atacar a miembros de la misma especie");
    }

    @Override
    public void atacarPersonaje(Guerreros e) {
        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()==Enum.Encantado){
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
    public void atacarPersonaje(Orcos e) {
        float resultado=0;
        if (e.getmEnergy()>0 && e.getmDefense()>=0){
            resultado=e.getmEnergy()-(getmAttack()-e.getmDefense());
            if (getmEnchant()==Enum.Encantado){
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
