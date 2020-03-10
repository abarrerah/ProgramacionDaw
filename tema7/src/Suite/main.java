package Suite;

import com.sun.source.tree.Tree;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args){
        Aspirante a1= new Aspirante("Pedro","29507080j",5967345);
        Aspirante a2= new Aspirante("Sandra","29507084m",5967346);
        Aspirante a3= new Aspirante("Roberto","2950705f",5967347);
        Aspirante a4= new Aspirante("Sara","29507087u",5967388);
        Aspirante a5= new Aspirante("Mateo","29507089k",5967349);
        TreeSet<Aspirante> aspirantes= new TreeSet<>();
        Date D= new Date(2020,12,5/12/2020);
        Pruebas p1= new Pruebas("hola", Pruebas.Enum.Oral,D);
        Pruebas p2=new Pruebas("Adios", Pruebas.Enum.Escrita,D);
        Calificacion c1= new Calificacion(p1, 5);
        Calificacion c2= new Calificacion(p2,8);
        Calificacion c3= new Calificacion(p1,9.9);
        Calificacion c4= new Calificacion(p2,4.2);
        Calificacion c5= new Calificacion(p1,2.95);
        Calificacion c6= new Calificacion(p2,5.01);
        Calificacion c7= new Calificacion(p1,7.71);
        Calificacion c8= new Calificacion(p2,6.93);
        Calificacion c9= new Calificacion(p1,5.73);
        Calificacion c10= new Calificacion(p2,3.75);

       a1.addCal(c1);
       a1.addCal(c2);

       a2.addCal(c3);
       a2.addCal(c4);

       a3.addCal(c5);
       a3.addCal(c6);

       a4.addCal(c7);
       a4.addCal(c8);

       a5.addCal(c9);
       a5.addCal(c10);

       aspirantes.add(a1);
       aspirantes.add(a2);
       aspirantes.add(a3);
       aspirantes.add(a4);
       aspirantes.add(a5);

        System.out.println(aspirantes);

    }
}
