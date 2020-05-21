package Entregable3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DataConnection dc=new DataConnection();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("1-Insertar cliente.");
            System.out.println("2-Asignar empleado a cliente.");
            System.out.println("3-Añadir producto a pedido.");
            System.out.println("4-Mostrar con detalle un pedido.");
            System.out.println("5-Salir de la aplicación.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    DataBaseMethods.addCliente();
                    break;
                case 2:
                    DataBaseMethods.asignEmployee();
                    break;
                case 3:
                    DataBaseMethods.addProduct();
                    break;
                case 4:
                    DataBaseMethods.showDetails();
                    break;
                case 5:
                    System.out.println("Ha salido de la aplicación.");
                    if (dc.getCon() != null){
                        dc.close();
                    }
                    break;
                default:
                    System.out.println("Es un número invalido");
                    break;
            }
        }


    }


}