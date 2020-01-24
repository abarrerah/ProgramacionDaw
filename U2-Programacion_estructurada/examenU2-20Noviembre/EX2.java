import java.util.Scanner;

public class EX2 {
   public static void main(String[] args) {

        /*Realiza un programa que dado un numero que se solicita el usuario por consola, eliminará de ese numero
        * todos los ceros y todos los 8, indicando adicionalmente cuántos números ha eliminado. Deberá solicitar el número
        * mientras que el número introducido no sea positivo*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero para eliminar los 0 y los 8");
        int numero=sc.nextInt();
        int aux=0;
        int resto;
        int cont=0;
       if (numero>0){
          while (numero>0){
             aux=numero;
             numero=numero/10;
             resto=aux-(numero*10);
             if (resto==0 || resto==8){
                cont++;
             }
          }
       }else{
          System.out.println("No es positivo");
       }
      System.out.println("Los eliminados son "+cont);

}}



