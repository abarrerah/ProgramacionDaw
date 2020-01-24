import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una cadena de tres numeros ");
        String numero=sc.nextLine();
        System.out.println("Introduce el numero de la lotería");
        String loteria=sc.nextLine();
        int cont=0;
        for (int i =0; i<numero.length();i++){
            for (int j=0; j<numero.length();j++){
                if (numero.contains(Character.toString(loteria.charAt(i)))){
                    cont++;
                }
            }
        }if (cont>4){
            System.out.println("Ese numero le va a dar suerte");
        }else{
            System.out.println("Ese numero no le va a dar suerte");
        }
    }
}
