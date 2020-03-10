package Ejercicio17;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Paises,String > m= new HashMap<>();
        String Pais;
        try{
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream("paises.bin"));

            while (true){
                Paises p= (Paises) ois.readObject();
                m.put(p,p.getCapital());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Introduce el nombre de un país y te dire su capital");
        while (!(Pais=sc.nextLine()).contains("salir")){

        }
       /*Collections <Paises> paises= m.values();
        for (Paises g:paises) {

        }*/

    }
}
