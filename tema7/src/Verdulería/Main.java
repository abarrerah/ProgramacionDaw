package Verdulería;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String textob="";
        String textoc="";
        Map<String,Producto> m= new LinkedHashMap<>();
        ArrayList<LineaPedido> lp= new ArrayList<>();
        Producto p1= new Producto("Avena",2.21);
        m.put("Avena",p1);
        Producto p2= new Producto("Garbanzos",2.39);
        m.put("Garbanzos",p2);
        Producto p3=new Producto("Tomate",1.59);
        m.put("Tomate",p3);
        Producto p4=new Producto("Jengibre",3.13);
        m.put("Jengibre",p4);
        Producto p5=new Producto("Quinoa",4.50);
        m.put("Quinoa",p5);
        Producto p6=new Producto("Guisante",1.60);
        m.put("Guisante",p6);
        Set<Map.Entry<String, Producto>> e1=m.entrySet();
        for (Map.Entry<String, Producto> a: e1) {

            textob=textob+" "+a.getKey();
            textoc=textoc+" "+a.getValue();
        }
        System.out.println(textob);
        for (int i = 0; i <textob.length()+1 ; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println(textoc);
        String text="";
        while (!(text=sc.nextLine()).contains("fin")){
            System.out.println("Cantidad del producto");

            System.out.println("1-Avena"+'\n'+"2-Garbanzos"+'\n'+"3-Tomate"+'\n'
                    +"4-Jengibre"+'\n'+"5-Quinoa"+'\n'+"6-Guisante");
            System.out.println("Indica que producto quieres");
            int k=sc.nextInt();
            switch (k){
                case 1:
                    LineaPedido l1=new LineaPedido(5,p1);
                    lp.add(l1);
                case 2:
                    LineaPedido l2=new LineaPedido(5,p2);
                    lp.add(l2);
                case 3:
                    LineaPedido l3=new LineaPedido(5,p3);
                    lp.add(l3);
                case 4:
                    LineaPedido l4=new LineaPedido(5,p4);
                    lp.add(l4);
                case 5:
                    LineaPedido l5=new LineaPedido(5,p5);
                    lp.add(l5);
                case 6:
                    LineaPedido l6=new LineaPedido(5,p6);
                    lp.add(l6);
                    text=sc.nextLine();
            }
            if (text.contains("fin")){
                break;
            }
        }
        System.out.println(lp);

        System.out.println("Aqui tienes la factura");
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println(textoc);

    }
}
