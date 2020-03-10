import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class
Actividad3 {
    public static void main(String[] args) {
        LinkedList <Integer> ll= new LinkedList<>();

        for (int i = 0; i <20 ; i++) {
            ll.add((int)(Math.random()*10+1));
            Collections.sort(ll);
            Collections.reverse(ll);
            System.out.println(ll);
        }
    }
}
