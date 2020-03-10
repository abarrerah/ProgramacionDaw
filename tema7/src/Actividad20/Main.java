package Actividad20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Anfibio,String > habitat= new HashMap<>();
        Map<Anfibio,String> alimentacion= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        String anfibio;
        try{
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream("anfibios.bin"));
            while (true){
                Anfibio h=(Anfibio) ois.readObject();
                habitat.put(h,h.getHabitat());
                alimentacion.put(h,h.getAlimentacion());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Introduce el anfibio para sacar su alimentación y su habitat ");

        while (!(anfibio=sc.nextLine()).contains("salir")){
            if (habitat.containsValue(anfibio) && alimentacion.containsValue(anfibio)){
                System.out.println("El tiempo de animal es "+habitat.containsKey(anfibio));
                System.out.println("su habitat es "+habitat.containsValue(anfibio));
                System.out.println("su alimentación es "+alimentacion.containsValue(anfibio));
            }else {
                System.out.println("No conozco que anfibio es.¿Me podrías decir información sobre "+anfibio+" ?");
                System.out.println("¿Como se llama?");
                String animal=sc.nextLine();
                System.out.println("¿Donde vive?");
                String lugar=sc.nextLine();
                System.out.println("¿Y que come?");
                String comida=sc.nextLine();
                habitat.put(new Anfibio(animal,lugar,comida),anfibio);
                System.out.println("di otro anfibio(o salir para terminar el proceso)");
            }

        }
        System.out.println("Introduce el anfibio para sacar su alimentación y su habitat ");

        try{
            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("anfibios.bin"));
            Set<String > targetset=new HashSet<>(habitat.values());
            Set<String> targetsetos=new HashSet<>(alimentacion.values());
            Set<Set<String>> conjuntototal=new HashSet<>();
            conjuntototal.add(targetset);
            conjuntototal.add(targetsetos);
            for (Set<String> a: conjuntototal) {
                oos.writeObject(a);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
