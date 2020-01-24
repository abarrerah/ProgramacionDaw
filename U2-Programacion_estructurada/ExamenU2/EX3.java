import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        //Realiza un programa que diga los dígitos que aparecen y los que no aparecen en un
        //número entero introducido por teclado. El orden es el que se muestra en
        //los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
        //largos.
        Scanner sc= new Scanner(System.in);
        long num;
        System.out.println("Introduce un número largo");
        num=sc.nextLong();
        String aparece="";
        String Noaparece="";
        String numOriginal=String.valueOf(num);

        for(int i =0;i<=9;i++){
            if (numOriginal.contains(String.valueOf(i))) {

                aparece=aparece+i;

            }else{
                Noaparece=Noaparece+i;

            }

        }
        System.out.println("Contiene los numeros..."+aparece);
        System.out.println("No contiene los números..."+Noaparece);
    }
}
