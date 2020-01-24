import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class EJ4 {
    public static int[] filtraPrimos(int []x){
        boolean EsPrimo=false;
        int cont=0;
        for (int i=0;i<x.length;i++){
            EsPrimo=false;
        while(x[i]%2==0){
            EsPrimo=true;
            cont++;
            break;
        }while(x[i]%3==1){
                EsPrimo=true;
                cont++;
                break;
            }
        }
        int [] resultado= new int[x.length-cont];
        for (int i=0; i<x.length;i++){
            EsPrimo=false;
            while(x[i]%2==0){
                EsPrimo=true;
                cont++;
                break;
            }while(x[i]%3==0){
                EsPrimo=true;
                cont++;
                break;
            }
            if (x[i]%2!=0){
                if (x[i]%3!=0){
                    resultado[i]=x[i];
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] v= new int[5];
        System.out.println("Introduce los numeros del array");
        for (int i=0;i<v.length;i++){
            v[i]=sc.nextInt();

        }
        for (int i=0;i<v.length;i++){
            System.out.println(filtraPrimos(v)[i]);
        }

    }
}
