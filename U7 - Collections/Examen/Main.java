package Examen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.invoke.SwitchPoint;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Owner o1=new Owner("Juan","Fernandez Oliva",123,"España");
        Owner o2=new Owner("Pedro","Jimenez Smith",124,"Argentina");
        Owner o3=new Owner("Susana","López Gutierrez",125,"España");
        ArrayList<Owner> o=new ArrayList<>();

        o.add(o1);
        o.add(o2);
        o.add(o3);
        ArrayList<Dog> d=new ArrayList<>();
        Dog d1= new Dog("Neo",6,27, Dog.race.PastorAleman,o1);
        d.add(d1);
        Dog d2= new Dog("Sasha",5,17, Dog.race.Boxer,o2);
        d.add(d2);
        Dog d3= new Dog("Yako",4,25, Dog.race.PastorAleman,o3);
        d.add(d3);
        Dog d4= new Dog("Linda",2,30, Dog.race.PastorAleman,o3);
        d.add(d4);
        Dog d5= new Dog("Thot",2,12, Dog.race.Collie,o1);
        d.add(d5);
        Dog d6= new Dog("Ra",7,15, Dog.race.Boxer,o1);
        d.add(d6);
        Dog d7= new Dog("Sekt",7,12, Dog.race.Collie,o2);
        d.add(d7);
        Dog d8= new Dog("Zeus",6,11, Dog.race.Collie,o1);
        d.add(d8);
        Dog d9= new Dog("Perico",5,17, Dog.race.Boxer,o1);
        d.add(d9);
        Dog d10= new Dog("Jupiter",4,27, Dog.race.PastorAleman,o1);
        d.add(d10);

        System.out.println("1-Cargar lista"+'\n'+"2-guardar información"+'\n'
                +"3-Añadir perro a la competición"+'\n'+"4-Desclasificar un perro"+'\n'+
                "5-Perros por socio"+'\n'+"6-Ordenar por peso"+'\n'+"7-Ordenar por edad");
        int k=sc.nextInt();
        switch (k){
            case 1:
                System.out.println("Has elegido cargar la lista de perros por raza");
                try {
                    Set<ArrayList<Dog>> pastoraleman =new HashSet<>();
                    Set<ArrayList<Dog>> boxer =new HashSet<>();
                    Set<ArrayList<Dog>> collie =new HashSet<>();
                    ObjectInputStream ois=new ObjectInputStream(new FileInputStream("perros.dat"));
                    while (true){
                        Dog doge=(Dog) ois.readObject();
                        if (d.equals(doge.getRace()) && doge.getWeight()>20){
                            pastoraleman.add(d);
                        }
                        if (d.equals(Dog.race= doge.race.Boxer)){
                            boxer.add(d);
                        }else {
                            collie.add(d);
                        }
                        System.out.println(pastoraleman);
                        System.out.println(boxer);
                        System.out.println(collie);
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Has elegido guardar la información de los perros ");
                try{
                    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("perros.dat"));
                    for (Dog g:d) {
                        oos.writeObject(g);
                    }
                    oos.close();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.println("quieres añadir perros dime la información sobre ello");
                int edad=sc.nextInt();
                String nombre=sc.next();
                Float peso=sc.nextFloat();
                Dog nd=new Dog(nombre,edad,peso, Dog.race.PastorAleman,o2);
                d.add(nd);
                try{
                    ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("perros.dat"));
                    for (Dog doge: d) {
                        oos.writeObject(doge);
                    }
                    oos.close();

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                System.out.println("Quieres desclasificar un perro. Dime que perro es");
                System.out.println("Pulse el numero para ello");
                int g=sc.nextInt();
                switch (g){
                    case 1:
                        d.remove(d1);
                    case 2:
                        d.remove(d2);
                    case 3:
                        d.remove(d3);
                    case 4:
                        d.remove(d4);
                    case 5:
                        d.remove(d5);
                    case 6:
                        d.remove(d6);
                    case 7:
                        d.remove(d7);
                        case 8:
                        d.remove(d8);
                    case 9:
                        d.remove(d9);
                    case 10:
                        d.remove(d10);

                }
                break;
            case 5:
                System.out.println("dime el codigo del socio");
                int cod=sc.nextInt();
                if (cod==o1.getSocietyCode()){
                    for (Dog h:d) {
                        if (h.getOwner()==o1){
                            System.out.println(h);
                    }
                    }
                }
                if (cod==o2.getSocietyCode()){
                    for (Dog h:d) {
                        if (h.getOwner()==o2){
                            System.out.println(h);
                        }
                    }
                }
                if (cod==o3.getSocietyCode()){
                    for (Dog h:d) {
                        if (h.getOwner()==o3){
                            System.out.println(h);
                        }
                    }
                }
                break;
            case 6:
                System.out.println("Quieres ordenar por peso");
                d.sort(new Comparator<Dog>() {
                    @Override
                    public int compare(Dog dog, Dog t1) {

                        return (int) ( dog.getWeight()-t1.getWeight());
                    }
                });
                System.out.println(d);
            break;
            case 7:
                System.out.println("Quieres ordenarlo por edad");
                d.sort(new Comparator<Dog>() {
                    @Override
                    public int compare(Dog dog, Dog t1) {
                        return dog.getAge()-t1.getAge();
                    }
                });
                System.out.println(d);
                break;
        }
    }
}
