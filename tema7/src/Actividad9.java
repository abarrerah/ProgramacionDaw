import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class Actividad9 {
    public static Set conjuntoUnion(Set l1, Set l2){
        Set<String > st=new HashSet<>();
        st.addAll(l1);
        st.addAll(l2);
        return st;

    }
    public static Set conjuntoInterseccion(Set<String> c1,Set c2){
        Set<String> st=new HashSet<>();
        for (String c:c1) {
            if (c2.contains(c)){
                st.add(c);
            }
        }
        return st;
    }
    public static Set conjuntoDiferencia(Set<String>c1,Set c2){
        Set<String> st=new HashSet<>();
        for (String c:c1) {
            if (!c2.contains(c)){
                st.add(c);
            }
        }
        return st;
    }
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet();
        String text1[]={"hola","que","tal","estas","manuel"};
        hs1.addAll(Arrays.asList(text1));
        HashSet<String> hs2=new HashSet<>();
        String text2[]={"Pues","aqui","estamos","que","hola"};
        hs2.addAll(Arrays.asList(text2));
        System.out.println(conjuntoUnion(hs1,hs2));
        System.out.println(conjuntoInterseccion(hs1,hs2));
        System.out.println(conjuntoDiferencia(hs1,hs2));
    }
}
