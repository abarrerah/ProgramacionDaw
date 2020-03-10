package EjercicosPersonaMapas;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("¿Quieres insertar o cargar los datos de los empleados?");
        Scanner sc= new Scanner(System.in);
        Map<String,Empleado> m=new LinkedHashMap<>();
        Empleado em;
        Empleado e1= new Empleado("29506028h",21,1.91);
        Empleado e2= new Empleado("29506029c",22,1.90);
        Empleado e3=new Empleado("29506030t",23,1.92);

        int j=sc.nextInt();
        if (j==1){
            System.out.println("Pues vamos a cargar los datos");
            try{
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empleados.bin"));
              while (true){
                  em= (Empleado) ois.readObject();
                  String dni = em.getmDni();
                  m.put(dni,em);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }else if (j==2){
            System.out.println("Pues vamos a insertar datos");
            try{
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empleados.bin"));


            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("¿Que opción quieres?");
            int k=sc.nextInt();
            switch (k){
                case 1:
                    System.out.println("Quieres visualizar los empleados en orden de insercción");
                    System.out.println(m);
                    break;
                case 2:
                    System.out.println("Vamos a eliminar a un empleado.Introduce el dni");
                    String dni=sc.nextLine();
                    if(m.containsKey(dni)){
                        m.remove(dni);
                        System.out.println("Ha salido eliminado");
                    }else {
                        System.out.println("El empleado no existe");
                    }
                    break;
                case 3:
                    System.out.println("Quieres visualizar el empleado desde el dni.Introducelo");
                    dni=sc.nextLine();
                    if (m.containsKey(dni)){
                        Empleado e=m.get(dni);
                        System.out.println(e);
                    }else {
                        System.out.println("El empleado no existe");
                    }
                    break;
                case 4:
                    System.out.println("Quieres modificar la información de un empleado");
                    String d;
                    int edad;
                    double altura;
                    System.out.println("Introduce el dni");
                    d=sc.nextLine();
                    if (m.containsKey(d)){
                        edad=sc.nextInt();
                        altura=sc.nextDouble();
                        Empleado e=m.get(d);
                        e.setmEdad(edad);
                        e.setmAltura(altura);
                        m.put(d,e);
                    }else {
                        System.out.println("No existe");
                    }
                    break;
                case 5:
                    System.out.println("Quieres insertar un nuevo empleado");
                    d=sc.nextLine();
                    edad=sc.nextInt();
                    altura=sc.nextDouble();
                    Empleado e= new Empleado(d,edad,altura);
                    m.put(d,e);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }else {
            System.out.println("Eso no existe en el programa.");
        }
    }
}
