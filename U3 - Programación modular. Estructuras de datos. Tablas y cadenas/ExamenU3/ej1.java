import java.util.Scanner;

public class ej1 {
    public static int[][] maxMatrix (int [][] x){
        int contf=0;
        int contc=0;
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;i++){
                contc++;
            }
        }
        for (int i=0;i<x.length;i++){
            contf++;
        }
        int resultado[][]=new int[contf][contc];
       for (int i=0;i<resultado.length;i++){
           for (int j=0;j<resultado[i].length;j++){
                if (resultado[i][j]>resultado[i][j-1]){
                    int mayor=resultado[i][j];
                    System.out.println(mayor);
                }
           }
       }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero de filas de la matriz");
        int filas =sc.nextInt();
        System.out.println("Introduce el numero de columnas de la matriz");
        int colum=sc.nextInt();

        int v[][]=new int[filas][colum];

        for (int i=0; i<v.length;i++){
            for (int j=0; j<v[i].length;j++){
                v[i][j]=(int) Math.floor(Math.random()*1000);
            }
        }
        System.out.println(maxMatrix(v));
    }
}
