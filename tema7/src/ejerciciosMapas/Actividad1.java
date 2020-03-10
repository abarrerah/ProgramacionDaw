package ejerciciosMapas;

import java.util.*;

/**
 * Actividad 1.- Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
 * La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma de sus dígitos.
 *
 * 46221877D -> 4+6+2+2+1+8+7+7=37
 *
 * Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.
 */
public class Actividad1 {
    public static int getDni(String dni){

        int aux=0;
        for (int i = 0; i <dni.length()-1 ; i++) {
           aux+=Character.getNumericValue(dni.charAt(i));
    }
        return aux;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Integer,String> m=new HashMap<>();
        m.put(32,"Abraham");
        System.out.println("Introduce el dni");
        String text=sc.nextLine();
        System.out.println("Introduce el nombre");
        String nombre=sc.nextLine();
        for (int i = 0; i <10 ; i++) {
            m.put(getDni(text),nombre);
        }
        System.out.println(m);
        System.out.println("Introduce el dni");
        String nuevadni=sc.nextLine();
        int i=getDni(nuevadni);
        if (m.containsKey(i)){
            System.out.println("Pues lo tiene "+m);
        }
        else {
            System.out.println("No lo tiene");
        }
        Set<Map.Entry<Integer,String>>e1=m.entrySet();
        Iterator<Map.Entry<Integer,String>> it=e1.iterator();
        for (;it.hasNext();){
            Map.Entry<Integer,String> a=it.next();
            System.out.println("La clave es "+a.getKey()+" esta asociada al nombre "+a.getValue());
        }
        for (Map.Entry<Integer,String> a: e1) {
            System.out.println("La clave es "+a.getKey()+" y el nombre asociado es "+a.getValue());
        }

    }

}
