import java.util.Scanner;

public class libreriavectores {
    public static String[] unir(String []v1, String []v2){
        int cont1=0;
        int cont2=0;
        for (int i=0;i<v1.length;i++){
            cont1++;
        }
        for (int j=0;j<v2.length;j++){
            cont2++;
        }String []v3=new String[cont1+cont2];
        for (int i=0;i<v1.length;i++){
            v3[i]=v1[i];
        }
        for (int i=0;i<v2.length;i++){
            v3[1+(v2.length-1)]=v3+v2[i];
        }
        return v3;
    }
    public static String [] rotar(String []v1, String []v2,int b){
        int cont1=0;
        int cont2=0;
        for (int i=0;i<v1.length;i++){
            cont1++;
        }
        for (int j=0;j<v2.length;j++){
            cont2++;
        }String []v3=new String[cont1+cont2];
        for (int i=0;i<v1.length;i++){
            v3[i]=v1[i];
        }
        for (int i=0;i<v2.length;i++){
            v3[1+(v2.length-1)]=v3+v2[i];
        }
        for (int i=0;i<v3.length;i++){
            if (v3[i]==Integer.toString(b)){
                v3[i]=v3[i+b];
                if (v3[i+b].length()>v3.length){
                    v3[i+b]=v3[0];
                }
            }
        }return v3;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce dos vectores");
        String v1[]=new String[5];
        String v2[]=new String[5];
        System.out.println("Rellene el primer vector");
        for (int i=0;i<v1.length;i++){

            v1[i]=sc.nextLine();
        }
        System.out.println("Rellene el segundo vector");
        for (int i=0;i<v2.length;i++){

            v2[i]=sc.nextLine();
        }


        for(int i=0;i<v1.length+v2.length;i++){
            System.out.print(unir (v1,v2)[i]);
        }
    }
}
