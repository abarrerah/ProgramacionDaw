import java.util.*;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String texto=sc.nextLine();
        String palabras[];
        Set<String> listasin=new LinkedHashSet<>();
        List<String> listarepetidos= new ArrayList<>();
        palabras=texto.split(" ");
        LinkedList ll= new LinkedList();
        for (String p:palabras){
            ll.add(p);
        }
        Iterator it=ll.iterator();

        while (it.hasNext()){
            String c= (String) it.next();
            if (Collections.frequency(ll , c)==1){
                System.out.println("El elemento "+c+" no está repetido");
            }
        }
        listasin.addAll(ll);
        System.out.println(ll);

        ll.removeAll(listasin);
        System.out.println(listasin);

    }
}
