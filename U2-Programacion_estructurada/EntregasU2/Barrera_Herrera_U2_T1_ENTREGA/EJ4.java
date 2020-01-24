import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        int num, ast, esp,cont;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la flecha: ");
        num = sc.nextInt();
        System.out.println();
        for(cont=0;cont<=(num/2);cont++){
                for(esp=0;esp<=(num/2)-cont;esp++){
                    System.out.print(" ");
                }
            System.out.println("*     *");
        }

        for(cont=0;cont<=(num/2)-1;cont++){
            for(esp=0;esp<=(((num/2)-2)+cont);esp++){
                System.out.print(" ");
            }
            System.out.println("*     *");
        }
        System.out.println();

                }

            }





