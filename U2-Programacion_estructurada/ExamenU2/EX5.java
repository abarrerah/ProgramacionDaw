import java.util.Scanner;

public class EX5 {
    //Dada una cadena mostrar por pantalla la cantidad de vocales que tiene.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase para sacar vocales ");
        String Cadena = sc.nextLine();
        Cadena=Cadena.toLowerCase();
        String vocap="";
        int cont=0;

        for(int i=0; i<Cadena.length(); i++)
        {
            if(Cadena.charAt(i) == 'a' || Cadena.charAt(i) == 'e' || Cadena.charAt(i) == 'i' || Cadena.charAt(i) == 'o' || Cadena.charAt(i) == 'u'){
                vocap=vocap+Cadena.charAt(i)+" ";
                cont++;
            }
        }System.out.println("Las vocales que aparecen son... "+vocap+" y la cantidad..."+cont );


    }
}
