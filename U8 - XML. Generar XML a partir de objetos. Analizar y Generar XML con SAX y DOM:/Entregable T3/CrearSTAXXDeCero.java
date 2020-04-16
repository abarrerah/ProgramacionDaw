package tema8.Entregable3;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class CrearSTAXXDeCero {
    public static void main(String[] args) {
        ArrayList <Coche> coches=new ArrayList<>();
        Coche c1=new Coche(1,"666FFF","Ford Focus","1600cc diesel");
        Coche c2=new Coche(2,"777GGG","Mitsubishi EVO","2600cc gasolina");
        Coche c3=new Coche(3,"888HHH","KIA Rio ","1100cc gasolina");
        Coche c4=new Coche(4,"999III","Panzerkampfwagen VI Ausf. H","9500CC diesel");
        Coche c5=new Coche(5,"102JJJ","IS-2","7600c diesel");
        Coche c6=new Coche(6,"112KKK","Sherman","8000cc diesel");
        Coche c7=new Coche(7,"122LLL","Ford Fiesta","1300cc gasolina");
        Coche c8=new Coche(8,"132MMM","Hyundai i30","1600cc gasolina");
        Coche c9=new Coche(9,"142NNN","Fiat Punto","1400cc diesel");
        Coche c10=new Coche(10,"152PPP","Nissan Cube","1100cc gasolina");

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        coches.add(c5);
        coches.add(c6);
        coches.add(c7);
        coches.add(c8);
        coches.add(c9);
        coches.add(c10);
        try {
            XMLOutputFactory factory=XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = factory.createXMLEventWriter(new FileOutputStream("concesionario_nuevos.xml"));
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            StartElement cochesStartElement=eventFactory.createStartElement("","","concesionario");
            xmlWriter.add(cochesStartElement);
            xmlWriter.add(saltoDeLineaTab);
                int lenght=0;
            for (Coche c:coches) {
                StartElement cochesStart=eventFactory.createStartElement("","","coche");
                StartElement matriculaStart=eventFactory.createStartElement("","","matricula");
                StartElement modeloStart=eventFactory.createStartElement("","","modelo");
                StartElement motorStart=eventFactory.createStartElement("","","motor");

                Attribute id=eventFactory.createAttribute("id",Integer.toString(c.getId()));

                EndElement cocheEnd=eventFactory.createEndElement("","","coche");
                EndElement matriculaEnd=eventFactory.createEndElement("","","matricula");
                EndElement modeloEnd=eventFactory.createEndElement("","","modelo");
                EndElement motorEnd=eventFactory.createEndElement("","","motor");

                Characters matricula=eventFactory.createCharacters(c.getMatricula());
                Characters modelo=eventFactory.createCharacters(c.getModelo());
                Characters motor=eventFactory.createCharacters(c.getMotor());

                xmlWriter.add(cochesStart);
                xmlWriter.add(id);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(matriculaStart);
                xmlWriter.add(matricula);
                xmlWriter.add(matriculaEnd);
                xmlWriter.add(modeloStart);
                xmlWriter.add(modelo);
                xmlWriter.add(modeloEnd);
                xmlWriter.add(motorStart);
                xmlWriter.add(motor);
                xmlWriter.add(motorEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(cocheEnd);

                if (lenght==coches.size()-1){
                    xmlWriter.add(saltoDeLinea);
                }else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                lenght++;
            }
            EndElement concesinarioEnd=eventFactory.createEndElement("","","Concesionario");
            xmlWriter.add(concesinarioEnd);
            xmlWriter.add(saltoDeLinea);
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
