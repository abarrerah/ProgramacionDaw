import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ej3 {
    public static int[] filtraCon7(int x[]){
        int cont=0;
      for (int i=0;i<x.length;i++){
          cont++;
      }
           String v[]=new String[cont];
          String num="7";

    for (int i=0;i<x.length;i++){
           v[i]=v[i]+x[i];
        if (v[i].contains(num)){
            System.out.println(x[i]+" "+x[i]+" "+x[i]);
            }
        }
    return x;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la longitud del Array");
        int num=sc.nextInt();
        int v[]=new int[num];
        for (int i=0;i<v.length;i++){
            System.out.println("Introduce un numero");
            v[i]=sc.nextInt();
        }

        System.out.println(filtraCon7(v));
    }}


