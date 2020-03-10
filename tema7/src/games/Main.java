package games;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Juego> m=new HashMap<>();
        String juego;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("juegos.bin"));


            while (true){
                Juego j=(Juego) ois.readObject();
                m.put(j.getCodigo(),j);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Introduce el juego que quieras añadir");

        while (!(juego=sc.next()).contains("salir")){
            if (m.containsKey(juego)) {
                System.out.println("el juego se llama "+m.containsValue(juego));
                System.out.println("El juego tiene un código "+m.containsKey(juego));

            }else {
                System.out.println("No conozco ese juego.Vamos a añadirlo.");
                System.out.println("dime el nombre");
                String nom=sc.next();
                System.out.println("dime la tematica");

                String tema=sc.next();
                System.out.println("dime la cantidad de armas que existen dentro del juego");
                int armas=sc.nextInt();
                System.out.println("Dime su código");
                String cod=sc.next();
                System.out.println("repetimos");
                m.put(cod,new Juego(nom,tema,armas,cod));
                System.out.println();
            }
        }
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("juegos.bin"));
            Collection<Juego> game=m.values();
            for (Juego j: game) {
                oos.writeObject(j);
            }
            oos.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
