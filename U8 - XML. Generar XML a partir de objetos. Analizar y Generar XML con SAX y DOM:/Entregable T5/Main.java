package EntregableT4;
import com.google.gson.Gson;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    //
      Players p1= new Players("Casillas",1,"Real Madrid");
      Players p2= new Players("Ramos",15,"Real Madrid");
      Players p3= new Players("Piqué",3,"FC Barcelona");
      Players p4= new Players("Puyol",5,"FC Barcelona");
      Players p5= new Players("Capdevilla",11,"Villareal FC");
      Players p6= new Players("Xabi Alonso",14,"Real Madrid");
      Players p7= new Players("Busquets",14,"FC Barcelona");
      Players p8= new Players("Xavi Hernandez",8,"FC Barcelona");
      Players p9= new Players("Pedro",18,"FC Barcelona");
      Players p10= new Players("Iniesta",6,"FC Barcelona");
      Players p11= new Players("Villa",7,"Valencia FC");

      ArrayList<Position> ps1=new ArrayList<>();
      Position pss1=new Position("Portero");
      ps1.add(pss1);
      p1.setPosition(ps1);
      ArrayList<Position>ps2=new ArrayList<>();
      Position pss2=new Position("Lateral Derecho","Medio Centro");
      ps2.add(pss2);
      p2.setPosition(ps2);
      ArrayList<Position>ps3=new ArrayList<>();
      Position pss3=new Position("Central");
      ps3.add(pss3);
      p3.setPosition(ps3);
      p4.setPosition(ps3);
      ArrayList<Position>ps5=new ArrayList<>();
      Position pss5=new Position("Lateral Izquierdo");
      ps5.add(pss5);
      p5.setPosition(ps5);
      ArrayList<Position>ps6=new ArrayList<>();
      Position pss6=new Position("Defensa mediocampo","Mediocampo");
      ps6.add(pss6);
      p6.setPosition(ps6);
      ArrayList<Position>ps7=new ArrayList<>();
      Position pss7=new Position("Defensa mediocampo");
      ps7.add(pss7);
      p7.setPosition(ps7);
      ArrayList<Position>ps8=new ArrayList<>();
      Position pss8=new Position(" mediocampo");
      ps8.add(pss8);
      p8.setPosition(ps8);
      ArrayList<Position>ps9=new ArrayList<>();
      Position pss9=new Position("Extremo Izquierdo","Falso Extremo");
      ps9.add(pss9);
      p9.setPosition(ps9);
      ArrayList<Position>ps10=new ArrayList<>();
      Position pss10=new Position("Extremo Derecho","Mediocentro");
      ps10.add(pss10);
      p10.setPosition(ps10);
      ArrayList<Position>ps11=new ArrayList<>();
      Position pss11=new Position("Delantero Centro");
      ps11.add(pss11);
      p11.setPosition(ps11);
      ArrayList<Players>jugadores=new ArrayList<>();
      jugadores.add(p1);
      jugadores.add(p2);
      jugadores.add(p3);
      jugadores.add(p4);
      jugadores.add(p5);
      jugadores.add(p6);
      jugadores.add(p7);
      jugadores.add(p8);
      jugadores.add(p9);
      jugadores.add(p10);
      jugadores.add(p11);
    System.out.println("De Java a Json"+'\n');
      Gson gson=new Gson();
    System.out.println(gson.toJson(jugadores)+'\n');

    System.out.println("Pasar de Json a objeto Java"+'\n');
    for (int i = 0; i <jugadores.size(); i++) {
        String jsonCompleto=gson.toJson(jugadores.get(i));
        Players nPlayer=gson.fromJson(jsonCompleto, Players.class);
        System.out.println(nPlayer);
    }

    ArrayList<ArrayList<Position>> todasPos=new ArrayList<>();
    todasPos.add(ps1);
    todasPos.add(ps2);
    todasPos.add(ps3);
    todasPos.add(ps5);
    todasPos.add(ps6);
    todasPos.add(ps7);
    todasPos.add(ps8);
    todasPos.add(ps9);
    todasPos.add(ps10);
    todasPos.add(ps11);

    System.out.println('\n'+"Vamos a sacar las posiciones del jugador Ramos"+'\n');
    for (int i = 0; i <todasPos.size() ; i++) {
      if (jugadores.get(i).getPosition()==todasPos.get(i) ){
          if (jugadores.get(i).getNombre()=="Ramos"){
          System.out.println("El jugador "+jugadores.get(i).getNombre()+" tiene las posiciones "+todasPos.get(i));
          }
      }
    }
  }
}
