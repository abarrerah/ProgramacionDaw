package Suite;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ejemploMapas {
    public static void main(String[] args) {
        Map<String ,Double> m=new TreeMap<>();
        m.put("Ana",1.65);
        m.put("Maria",1.55);
        m.put("Sara",1.60);
        System.out.println(m.get("Ana"));
        System.out.println(m);
        Set<String> claves=m.keySet();
        System.out.println(claves);
    }
}
