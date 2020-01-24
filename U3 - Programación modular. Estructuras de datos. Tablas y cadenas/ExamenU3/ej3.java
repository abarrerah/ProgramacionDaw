import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String tablero [][]=new String[10][10];
        String cad="abcdefgh";
        System.out.println("Introduce la posición del alfil");
        int fila=sc.nextInt();
        int columna=sc.nextInt();
        while (fila>0 || fila<8||columna>0||columna<8){
        for(int i=0;i<tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++){
                tablero[i][j]="-";
            if (tablero[i]==tablero[0]||tablero[i]==tablero[tablero.length-1]){
                tablero[i][j]="a";
            }
            if (tablero[j]==tablero[0]|| tablero[j]==tablero[tablero[i].length-1]){
                int k=0;
                k++;
                tablero[i][j]=Integer.toString(k);
            }
            if (tablero[i][j]==tablero[fila][columna]){
                tablero[i][j]="X";
                }
            }
            }
        for (int i=0;i<tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++) {
                System.out.print(" "+tablero[i][j]+" ");

            }
            System.out.println();
        }


        break;


    }
}}
