package ExamenU5;

abstract class Humanos extends Personaje {
    /**
     * Constructor
     *
     * @param mName
     * @param mEnergy
     * @param mAttack
     * @param mDefense
     * @param mEnchant
     */
    public Humanos(String mName, float mEnergy, float mAttack, float mDefense, Enum mEnchant) {
        super(mName, mEnergy, mAttack, mDefense, mEnchant);
    }
}
