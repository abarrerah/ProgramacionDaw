import java.util.Scanner;
//Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han encargado
//realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario
//la altura, que debe ser un número entero impar mayor o igual que 5. Si el número
//introducido no es correcto, el programa deberá mostrar un mensaje de error. A
//continuación, se muestran algunos ejemplos. La anchura de la figura siempre será de 6
//caracteres
public class EX1 {
    public static void main(String[] args) {
        int tam;
        int alt;
        int ancho;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero mayor o igual que 5 e impar");
        tam=sc.nextInt();
        if(tam<5 || tam%2==0){
            System.out.println("la altura introducida no es correcta");
        }else{
            for( ancho=1; ancho<=tam; ancho++){
                for( alt=1; alt<=6; alt++){
                    if(ancho==1 || ancho==tam || alt==1 || alt==6||ancho==(tam/2)+1){
                        System.out.print("M");
                    }
                    else{
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }
    }
}
