import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero para sacar su numero binario");
        num=sc.nextInt();
        String binario="";
    if(num>0){
        while(num>0){
            if(num%2==0){
                binario=0+binario;

            }else{
                binario=1+binario;
            }
            num=(int) num/2;
        }
    }else if(num==0){
        binario="0";
    } else{
        binario="No se pudo imprimir";
    }
        System.out.println("El numero convertido a binario es "+binario);
}}
