import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1T3 {
    public static float[] mediaVectores(int v1[],int v2[]){

            float resultado []=new float[v2.length];
            float media=0;

            if (v1.length>v2.length){
                for (int i=0;i< v2.length;i++){
                    media=(v1[i]+v2[i])/2;
                    resultado[i]=media;
                }
                for (int j=v2.length;j<v1.length;j++){
                    resultado[j]=v1[j];
                }
            }
            if (v2.length>v1.length){
                for (int i=0;i<v1.length;i++){
                    media=(v1[i]+v2[i])/2;
                    resultado[i]=media;
                }
                for (int j=v1.length;j<v2.length;j++){
                    resultado[j]=v2[j];
                }
            }
            return resultado;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del primer vector");
        int lon1=sc.nextInt();
        int v1[]=new int[lon1];
        System.out.println("Introduce la longitud del segundo vector");
        int lon2=sc.nextInt();
        int v2[]=new int[lon2];
        int v3[]=new int[(v1.length+v2.length)-1];
        for (int i=0;i<v1.length;i++){
            System.out.println("Rellene el numero de la posición "+i+" del vector primero");
            v1[i]=sc.nextInt();
        }
        for (int i=0;i<v2.length;i++){
            System.out.println("Rellene el numero de la posición "+i+" del vector segundo");
            v2[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(mediaVectores(v1,v2)));
    }
}
