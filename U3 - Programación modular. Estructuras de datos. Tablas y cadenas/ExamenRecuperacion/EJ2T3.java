import java.util.Scanner;

public class EJ2T3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tablero[][]= new int[8][8];
        System.out.println("introduce la posición en el tablero");
        int pos=sc.nextInt();
        for (int i=0;i<tablero.length;i++){
            for(int j=0; j<tablero[i].length;i++){
                tablero[i][j]='-';
            }
        }
        for (int i=0; i<tablero.length;i++){
            for (int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }


    }
}
