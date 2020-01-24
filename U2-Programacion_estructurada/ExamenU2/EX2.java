import java.util.Scanner;
//Escribe un programa que permita partir un número introducido por teclado en dos
//partes. Las posiciones se cuentan de izquierda a derecha empezando por
//el 1. Suponemos que el usuario introduce correctamente los datos, es decir, el número
//introducido tiene dos dígitos como mínimo y la posición en la que
//se parte el número está entre 2 y la longitud del número. No se permite en este
//ejercicio el uso de funciones de manejo de String
public class EX2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor, introduce un número para sacar su posición. Recuerda que debe ser mayor o igual a dos dígitos ");
        long num=sc.nextLong();
        System.out.println("posición que quieres");
        int pos=sc.nextInt();
        long aux=num;
        int cont=0;
        while (aux!=0){
            aux=aux/10;

            cont++;
        }
        aux=num;
        if(pos<2|| pos>cont){
            System.out.println("no es posible con ese numero");
        }else if(pos==cont){
            System.out.println(num);
        }else {
            for(int i=0;i<cont-pos;i++){
                aux=aux/10;

            }
            System.out.println("Primera parte del número introducido es... "+aux);
            for(int i=0;i<cont-pos;i++){
                aux=aux*10;
            }
        }
        System.out.println("Segunda parte del número introducido es..."+(num-aux));
    }}

