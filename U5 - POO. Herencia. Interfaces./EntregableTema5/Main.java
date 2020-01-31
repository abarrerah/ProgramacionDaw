package EntregableTema5;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Coche c1= new Coche("Seat",5,"34923",2005, Terrestre.Color.Azul);
        Coche c2= new Coche("Fiat",2,"34956",2006, Terrestre.Color.Rojo);
        Coche c3= new Coche("Alpha",3,"34978",2008,Terrestre.Color.Azul);

        Coche c[]=new Coche[3];
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;

        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
        Moto m1=new Moto("BMW",2,"2349234",2010,Terrestre.Color.Rojo);
        Moto m2=new Moto("Triumph",2,"2349444",2012,Terrestre.Color.Azul);
        Moto m3=new Moto("Toyota",2,"2349777",2015, Terrestre.Color.Verde);

        Moto m[]=new Moto[3];
        m[0]=m1;
        m[1]=m2;
        m[2]=m3;
        System.out.println();
        for (int i = 0; i <m.length ; i++) {
            System.out.println(m[i]);
        }
        System.out.println("¿Cuantos pasajeros llevas?");
        int i=sc.nextInt();
        System.out.println("La respuesta es "+c1.transporta(i));

        System.out.println("Ordenación por matricula de las coches");
        Arrays.sort(c);
        System.out.println(Arrays.deepToString(c));

        System.out.println();
        System.out.println("Ordenación de los coches");
        Arrays.sort(c, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche, Coche t1) {
                return coche.getmYear()-t1.getmYear();
            }
        });
        System.out.println(Arrays.deepToString(c));

        System.out.println("Ordenación por matricula de las motos");
        Arrays.sort(m);
        System.out.println(Arrays.deepToString(m));
        System.out.println();
        System.out.println("Ordenación de las motos");
        Arrays.sort(m, new Comparator<Moto>() {
            @Override
            public int compare(Moto moto, Moto t1) {
                return moto.getmYear()-t1.getmYear();
            }
        });
        System.out.println(Arrays.deepToString(m));
        System.out.println();

        Helicoptero h= new Helicoptero("Apache",12,0,"125 AOC");
        System.out.println(h);

        System.out.println("¿Quieres añadir altura? Por defecto está en 0. Pulsa 1 para si o 2 para no");
        int y=sc.nextInt();
        if (y==1){
            float j=sc.nextFloat();
            System.out.println("Se ha añadido "+h.getAltura(j)+" a la altura ");

        }else {
            System.out.println("No se añade entonces");
        }
        System.out.println("Vamos a añadir 9 personas al helicoptero");
        System.out.println(h.getAddPeople());
    }


}
