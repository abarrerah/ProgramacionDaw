import java.util.*;

public class Actividad1 {
    public static void main(String[] args) {
        LinkedList <Integer> l= new LinkedList<>();
        for (int i = 0; i <19 ; i++) {
            l.add((int)(Math.random()*99+1));
        }
        System.out.println(l);

        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer-t1;
            }
        });
        System.out.println(l);
    }


}
