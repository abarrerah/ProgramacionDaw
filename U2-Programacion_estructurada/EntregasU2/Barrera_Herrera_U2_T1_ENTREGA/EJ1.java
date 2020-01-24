import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce sus notas del trimeste para hacer la media ");
        int ex1= sc.nextInt();
        System.out.println("Introduzca su segunda nota");
        int ex2= sc.nextInt();
        System.out.println("Introduzca su tercera nota");
        int ex3=sc.nextInt();
        int media=(ex1+ex2+ex3)/3;
        if(media<5){
            System.out.println("Usted está suspenso "+media);
            System.out.println("¿Cuál ha sido el resultado de la recuperación?(apto/no apto)");

            String r=sc.next();
            if(r.equals("apto")  ){


                System.out.println("apto. Tu nota de Programación es 5- Suficiente");
            }else{
                System.out.println("Usted no es apto");
            }

        }
        else if(media==5){
            System.out.println("Usted está aprobado "+ media);
        }else if(media <6 && media>=5){
            System.out.println("Usted tiene un suficiente" +media);
        }else if(media<7 && media>=6){
            System.out.println("Usted tiene un bien "+media);
        }else if(media<9 && media >=7){
            System.out.println("Usted tiene un Notable "+media);
        }else if(media>=9){
            System.out.println("Usted tiene un sobresaliente "+media);
        }
    }
}
