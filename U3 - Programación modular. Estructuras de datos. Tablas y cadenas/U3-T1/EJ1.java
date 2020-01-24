import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        /*Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se pueden sentar de 0(mesa vacía)
        * a 4 comensales. Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupo
        * mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el programa dará "LO SIENTO, NO ADMITIMOS GRUPOS DE 6
        * ,HAGA GRUPOS DE 4 PERSONAS COMO MÁXIMO E INTENTE DE NUEVO". Para el grupo que llega, se busva siempre la primera mesa libre (con 0 personas)
        * Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá colocar
        *donde haya una o dos personas. Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan nuevos clientes
        * se debe mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del programa
        * se ilustra a continuación:*/
        Scanner sc= new Scanner(System.in);
        int v[]= new int [10] ;
        boolean Espacio=false;
        for ( int k=0; k<v.length;k++){
        System.out.println("Introduce el grupo que deseas introducir");
            for (int i =0; i<v.length;i++){
            v[i]=sc.nextInt();
                if (v[i]>4){
            System.out.println("Lo siento, no admitimos grupos mayor de 4.");
            break;
        }       else if (v[i]==6 || v[i]>6){
            System.out.println("no se admiten grupos de 6.");
            break;
        }
           }
}
       for (int i=0;i<v.length;i++){
           for (int j=0; j<v.length;j++){

        }
        }
}}
