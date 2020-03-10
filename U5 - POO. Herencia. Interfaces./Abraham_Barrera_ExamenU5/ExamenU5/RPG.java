package ExamenU5;

import java.util.Arrays;


public class RPG {
    /**
     * Atributo de la lista de los personajes
     */
    private RPG rpg[];

    /**
     * Constructor
     * @param rpg
     */
    public RPG(RPG[] rpg) {
        this.rpg = rpg;
        rpg= new RPG[10];
    }

    public RPG[] getRpg() {
        return rpg;
    }

    public void setRpg(RPG[] rpg) {
        this.rpg = rpg;
    }

    /**
     * Método para añadir personajes a la lista
     */
    public void addCharacter(Object o){
        for (int i = 0; i <getRpg().length; i++) {
            if (rpg[i]==null){
                rpg[i]= (RPG) o;
            }else if (rpg[i]!=null){
                System.out.println("No se puede añadir más personajes");
            }
        }
    }

    /**
     * Método para borrar muertos
     * @param o
     */
    public void borrarMuerto(Object o){
        Personaje p= (Personaje) o;
        for (int i = getRpg().length; i >0 ; i++) {
            if (rpg[i]!=null && p.getmEnergy()<=0){
                rpg[i]=null;
                rpg[i]=rpg[i-1];
            }
        }
    }

    /**
     * Método para mostrar el estado
     * @param r
     */
    public void mostrarEstado(RPG[] r){
        RPG copia[]=new RPG[rpg.length];
        for (int i = rpg.length; i >0; i++) {
            if (r[i]!=null){

            }
        }
    }

    /**
     * Método que muestra la ordenación por ataque
     */
    public void mostrarxAtaque(){

    }

    /**
     * Método que muestra la ordenación por defensa
     */
    public void mostrarxDefensa(){

    }

    /**
     * Método que muestra el ganador
     */
    public void hayGanador(){
        int saberPersonajes=0;
        for (int i = getRpg().length; i >0 ; i++) {
            if (rpg[i]==null){
                saberPersonajes++;
            }
            if (saberPersonajes==1){
                System.out.println(Arrays.toString(rpg)+" es el ganador");
            }
        }
    }
}
