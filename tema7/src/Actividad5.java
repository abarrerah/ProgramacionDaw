import java.util.*;

public class Actividad5 {
    public static void main(String[] args) {
        TreeSet <Integer> ts= new TreeSet<>();
        while(ts.size()<20){
            ts.add((int)(Math.random()*100));
        }
        List<Integer> targetlist=new ArrayList<>(ts);
        Collections.sort(targetlist);
        Collections.reverse(targetlist);
        System.out.println(targetlist);

    }
}
