import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
//Realiza un programa que calcule el máximo, el mínimo y la media de una serie de
//números enteros positivos introducidos por teclado. El programa terminará
//cuando el usuario introduzca un número primo. Este último número no se tendrá en
//cuenta en los cálculos.El programa debe indicar también cuántos
//números ha introducido el usuario(sin contar el primo que sirve para salir).
        Scanner sc= new Scanner(System.in);

        boolean esPrimo=false;
        int cont=0;
        int mayor=0;
        int menor=0;
        double aux=0;
        String numero="";
        while(!esPrimo){
            System.out.println("Introduce un numero entero");
            Integer n=sc.nextInt(); //Sustituir el Int por Integer para que se pueda utilizar el .toString()
            for (int i=2;i<n;i++){
                if(n%i==0){
                    esPrimo=false;
                    aux=aux+n;
                    String s=n.toString();
                    numero=numero+s+"";
                    if(cont==0){
                        mayor=n;
                        menor=n;
                    }else {
                        if(n>=mayor){
                            mayor=n;
                        }if(n<=menor){
                            menor=n;
                        }
                    }
                    cont++;
                    break;
                }else{
                    esPrimo=true;
                }
            }
        }
        System.out.println("La cantidad de numero no primos es..."+cont);
        System.out.println("El menor es..."+menor);
        System.out.println("El mayor es..."+mayor);
        System.out.println("la media es...."+aux/cont);
    }
}
