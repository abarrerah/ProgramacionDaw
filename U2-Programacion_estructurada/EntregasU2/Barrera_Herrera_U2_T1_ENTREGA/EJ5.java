import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        sc = new Scanner(System.in);
        boolean numeroCorrecto = false;

        do {
            System.out.print("Introduce el número de filas : ");
             String cad = sc.nextLine();
            if(cad.length()>0 && cad.length()%2!=0){
                numeroCorrecto = true;
            }
        } while (!numeroCorrecto);

        System.out.println("");

        int numFil = 4/2 + 1;// no es 4, lo he puesto para que no me de fallo JAVA, pero en realidad tendría que ir un método para convertir la cadena en numeros

        for(int altura=1;altura<=numFil;altura++){

            for(int blancos=1;blancos<=numFil-altura;blancos++){
                System.out.print(" ");
            }

            for(int asteriscos=1;asteriscos<=(2*altura)-1;asteriscos++){
                System.out.print("*");
            }
            System.out.println("");
        }

        numFil--;

        for(int altura=1;altura<=numFil;altura++){

            for(int blancos=1;blancos<=altura;blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1;asteriscos<=(numFil-altura)*2 +1;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}