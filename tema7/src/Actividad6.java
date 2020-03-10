import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedHashSet<String> ts=new LinkedHashSet<>();
        String text=sc.nextLine();


    do {
        ts.add(text);
        text=sc.nextLine();
        if (text=="fin"){
            break;
        }
    }while (!text.equals("fin"));
        System.out.println(ts);

        try{
            BufferedWriter bw= new BufferedWriter(
                    new FileWriter(new File("lista.txt")));
            Iterator it=ts.iterator();
            while(it.hasNext()){
                bw.write(it.next().toString());
                bw.newLine();

            }
            bw.close();
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

}
