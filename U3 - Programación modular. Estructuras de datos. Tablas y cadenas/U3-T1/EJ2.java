import java.util.Scanner;

public class EJ2 {
    public static int[][] media(int [][]v) {
   int [][] resultado=new int[v.length+1][v.length+1];
   int sumat=0;
   int suma=0;
   int media=0;
   for (int i=0;i<v.length;i++){
       for (int j=0;j<v.length;j++){
           resultado[i][j]=v[i][j];
           suma=suma+v[i][j];
       }
       resultado[i][v.length]=suma;
       sumat+=suma;
       media=sumat/4;
   }
   resultado[v.length][v.length]=media;
   return resultado;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int v[][]=new int[4][5];
        int [][]resultado;
        for (int i=0;i<v.length;i++){
            for (int j=0;j<v[i].length;j++){
                System.out.println("Introduce el numero de la posición "+i+" "+j);
                v[i][j]=sc.nextInt();
        }
        }
         resultado=media(v);
            for (int i=0;i<v.length;i++){
                for (int j=0;j<v[i].length;j++){
                    System.out.print(resultado[i][j]+" ");
}
                System.out.println();
        }
    }
}
