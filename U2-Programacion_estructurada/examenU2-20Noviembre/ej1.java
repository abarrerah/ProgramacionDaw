import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño de los calcetines");
        int tam=sc.nextInt();
        int ancho1=3;
        int anchof=14;
        int ancho2=tam;
        if (tam<=3){
            System.out.println("No se puede");
        }else{
            for (int i=0;i<tam;i++){
                for(int j=0;j<ancho1;j++){
                    if (i==ancho2-2||i==ancho2-1){
                    System.out.print("**");

                }else {
                        System.out.print("*");
                    }

                }
                for (int k=ancho2-2;k<=anchof-(ancho2-2);k++){
                    if (k<anchof-(ancho2-2) || i<tam-2){
                    System.out.print(" ");

                }
                }
                for (int c=anchof-(ancho2-2);c<anchof-3;c++){
                    System.out.print("***");
                    if (i==tam-2||i==tam-1){
                        System.out.print("***");
                    }
                }
                System.out.println();
            }

        }

    }
}
