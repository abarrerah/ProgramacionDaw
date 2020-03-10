package ExamenU5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        RPG rpg[]=new RPG[10];

        Magos m= new Magos("Merlín",25,20,1, Personaje.Enum.Encantado,1);
        Guerreros g= new Guerreros("Haland",470,65,40, Personaje.Enum.Desencantado,30);
        Enanos en= new Enanos("Milgord",650,50,50, Personaje.Enum.Encantado,(float) 1.4);
        Elfos e= new Elfos("Legolas",250,66,33, Personaje.Enum.Desencantado, Elfos.Enum.Costa);
        Orcos o= new Orcos("Borg",800,29,70, Personaje.Enum.Encantado,110);


        m.encantar(g);
        System.out.println(g);
        m.encantar(e);
        System.out.println(e);
        m.desencantar(m);
        System.out.println(m);
        m.desencantar(o);
        System.out.println(o);

        g.atacarPersonaje(m);
        en.atacarPersonaje(m);
        e.atacarPersonaje(m);
        o.atacarPersonaje(m);

    }
}
