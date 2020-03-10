import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;


public class Actividad8 {
    public static List eliminarRepetidos(List c){
        Set<String> st=new HashSet<>();
        st.addAll(c);
        List<String>nl=new ArrayList<>();
        nl.addAll(st);
        return nl;
    }
    public static void main(String[] args) {
        ArrayList <String> l=new ArrayList<>();
        String text[]={"Pedro","Juan","Pepe","Pepe","Ana","Ana","Ana","Rosa"};
        l.addAll(Arrays.asList(text));
        System.out.println(eliminarRepetidos(l));
        List<String> listaSinRepes= eliminarRepetidos(l);
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("nombres.bin"));
            for (String s:listaSinRepes) {
                oos.writeObject(s);
            }
            oos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
