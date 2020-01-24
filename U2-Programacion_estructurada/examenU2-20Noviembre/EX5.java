import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        /*Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando
        cada vez la hora nueva.
        Se solicitará al usuario por teclado las horas , los minutos y los segundos y el número que se quiere aumentar las horas.
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora=sc.nextInt();
        System.out.println("Introduce los minutos");
        int minutos=sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos=sc.nextInt();
        System.out.println("Introduce el aumento de segundos");
        int aument=sc.nextInt();
        for (int i=0;i<aument;i++){
            segundos++;
            if (segundos==60){
                segundos=0;
                minutos++;
                if (minutos==60){
                    minutos=0;
                    hora++;
                    if (hora==24){
                        hora=0;

                    }
                }
            }
            System.out.println(hora+":"+minutos+":"+segundos);
        }
    }
}
