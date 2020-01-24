import java.util.Scanner;

public class ej4 {
    public static int convierteArrayEnString(int []a){
      String cad="";
    for (int i=0;i<a.length;i++){
      cad= cad+a[i];
    }
      int b=Integer.parseInt( cad);
      return b;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Introduce la longitud del array");
      int num=sc.nextInt();
    int v[]=new int[num];
    for (int i=0; i<v.length;i++){
      System.out.println("Introduce el valor de la posición del Array "+i);
      v[i]=sc.nextInt();
    }
      System.out.println(convierteArrayEnString(v));
    }
}
