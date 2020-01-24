import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce dos vectores");
        String v1[]=new String[5];
        String v2[]=new String[5];
        System.out.println("Rellene el primer vector");
        for (int i=0;i<v1.length;i++){

            v1[i]=sc.nextLine();
        }
        System.out.println("Rellene el segundo vector");
        for (int i=0;i<v2.length;i++){

            v2[i]=sc.nextLine();
        }
        System.out.println("Indique cuantas posiciones quieres rotar");
        int num=sc.nextInt();

        for(int i=0;i<v1.length+v2.length;i++){
            System.out.print(libreriavectores.unir(v1,v2)[i]);
            System.out.println(libreriavectores.rotar(v1,v2,num)[i]);
        }
    }
}
