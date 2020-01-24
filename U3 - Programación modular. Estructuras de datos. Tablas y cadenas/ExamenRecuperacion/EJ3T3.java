import java.util.Scanner;

public class EJ3T3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una cadena de letras");
        String cad=sc.next();

        System.out.println(libreriaEJ3T3.desplazarVocales(cad));
        System.out.println(libreriaEJ3T3.invertir(cad));
    }
}
