package Ejercicio17;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Capitales {
    public static void main(String[] args) {
        Map<String,Paises> capitales = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String pais;

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("paises.bin"));

            while (true) {
                Paises p = (Paises) ois.readObject();
                capitales.put(p.getNombre(),p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Introduce el nombre de un país y te diré su capital");

        while (!(pais = sc.nextLine()).equals("salir")) {

            if (capitales.containsKey(pais)) {
                System.out.println(capitales.get(pais).getCapital());
            } else {
                System.out.println("No conozco la respuesta ¿cuál es la capital de "+pais+"?:");
                String capital = sc.nextLine();
                capitales.put(pais,new Paises(pais,capital));
            }

            System.out.println("Introduce el nombre de un país y te diré su capital");

        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("paises.bin"));
            Collection<Paises> paises = capitales.values();

            for (Paises p : paises  ) {
                oos.writeObject(p);
            }

            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
