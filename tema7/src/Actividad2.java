import java.util.ArrayList;
import java.util.Collections;

public class Actividad2 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i = 0; i <19 ; i++) {
            l.add((int)(Math.random()*100+1));
        }
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }

}

