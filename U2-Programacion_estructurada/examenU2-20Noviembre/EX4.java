import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero para sacar sus 5 numeros consecutivos y si es primo o no. Tiene que ser positivo");
        int num=sc.nextInt();
        boolean EsPrimo=false;
        if (num<0){
            System.out.println("Repito. Debe ser positivo.");
        }else{
            for (int i=0;i<5;i++){
                int aux=num;
                num++;
                if (aux%1==aux || aux%aux==1 || aux%2!=0 || aux%3!=0){
                   EsPrimo=true;

                }
                if (EsPrimo=false){
                    System.out.println(num+" "+"No Es Primo");
                }
                else {
                    System.out.println(num+" "+"Es Primo");
                }


            }
        }

    }
}
