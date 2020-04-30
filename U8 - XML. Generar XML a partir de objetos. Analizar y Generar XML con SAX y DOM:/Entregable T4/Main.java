package NuevoEntregable;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
  public static void main(String[] args) {
    //
      ArrayList<Futbolista> players=new ArrayList<>();
      Futbolista p1 = new Futbolista(1, "Casillas", new ArrayList<>(Arrays.asList("Portero")), "Real Madrid");
      players.add(p1);

      Futbolista p2= new Futbolista(15,"Ramos",new ArrayList<>(Arrays.asList("central", "Lateral derecho")),"Real Madrid");
      players.add(p2);

      Futbolista p3= new Futbolista(3,"Piqué",new ArrayList<>(Arrays.asList("central")),"FC Barcelona");
      players.add(p3);
      Futbolista p4= new Futbolista(5,"Puyol",new ArrayList<>(Arrays.asList("central")),"FC Barcelona");
      players.add(p4);
      Futbolista p5= new Futbolista(11,"Capdevila",new ArrayList<>(Arrays.asList("Lateral izquierdo")),"Villareal FC");
      players.add(p5);
      Futbolista p6= new Futbolista(14,"Xabi Alonso",new ArrayList<>(Arrays.asList("mediocentro defensivo")),"Real Madrid");
      players.add(p6);
      Futbolista p7= new Futbolista(16,"Xavi Hernandez",new ArrayList<>(Arrays.asList("mediocentro")),"FC Barcelona");
      players.add(p7);
      Futbolista p8= new Futbolista(18,"Pedro",new ArrayList<>(Arrays.asList("Extremo Izquierdo","falso extremo")),"FC Barcelona");
      players.add(p8);
      Futbolista p9= new Futbolista(6,"Iniesta",new ArrayList<>(Arrays.asList("Extremo Derecho", "Mediocampo")),"FC Barcelona");
      players.add(p9);
      Futbolista p10= new Futbolista(6,"Villa",new ArrayList<>(Arrays.asList("Delantero centro")),"FC Barcelona");
      players.add(p10);
      Futbolista p11= new Futbolista(15,"Ramos",new ArrayList<>(Arrays.asList("central", "Lateral derecho")),"Real Madrid");
     players.add(p11);



    System.out.println(players);

    Gson gson=new Gson();
    String json="";

    for (int i = 0; i <players.size() ; i++) {
        json=json+'\n'+gson.toJson(players.get(i));
    }
    System.out.println(json);
  }
}
