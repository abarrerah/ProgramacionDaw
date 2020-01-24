import java.util.Scanner;

public class ej2 {
    public static int[] insertaValor(int[]x ,int a,int b){
        int resultado []=new  int[x.length+1];

        for (int i=0;i<resultado.length;i++){
            if (i==b){
                resultado[i]=resultado[i+1];
                resultado[i]=a;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la longitud del vector");
        int lon= sc.nextInt();
        int v[]=new int[lon];
        for (int i=0;i<v.length;i++){
            System.out.println("Introduce el numero del vector");
            v[i]=sc.nextInt();
        }
        System.out.println("Indique la posición y el número que se va a introducir");
        int pos=sc.nextInt();
        int num=sc.nextInt();
        for (int i=0;i<v.length;i++){
            System.out.print("{"+v[i]+"}");
        }
        System.out.println(insertaValor(v,pos,num));

    }
}
