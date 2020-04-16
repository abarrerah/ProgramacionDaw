package tema8.Entregable3;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.util.ArrayList;

public class MostrarSTAXX {
    public static void main(String[] args) {
        ArrayList <Coche> coches=new ArrayList<>();
        Coche cochesActual=null;
        String tagActual="";
        try{
            XMLInputFactory xif =XMLInputFactory.newInstance();
            XMLEventReader xer=xif.createXMLEventReader(new FileInputStream("concesionario.xml"));
            while(xer.hasNext()){
                XMLEvent xe=xer.nextEvent();
                if (xe.isStartElement()){
                    StartElement se=xe.asStartElement();
                    System.out.println("<"+se.getName().getLocalPart());
                    String tagName=se.getName().getLocalPart();
                    switch (tagName){
                        case "coche":
                            cochesActual=new Coche();
                            tagActual="coche";
                            Attribute id =se.getAttributeByName(new QName("id"));
                            cochesActual.setId(Integer.valueOf(id.getValue()));
                            System.out.print(" "+id.getName()+"=\""+id.getValue()+"\"");
                            break;
                        case "matricula" :
                            tagActual = "matricula";
                            break;
                        case "modelo" :
                            tagActual = "modelo";
                            break;
                        case "motor" :
                            tagActual = "motor";
                            break;
                    }
                    System.out.print(">");
                }else if (xe.isEndElement()){
                    EndElement et=xe.asEndElement();
                    System.out.println("<\\"+et.getName().getLocalPart()+">");
                    if (et.getName().getLocalPart().equals("coche")){
                        coches.add(cochesActual);
                    }
                    tagActual="";
                }else if (xe.isStartElement()){
                    System.out.println("Comienzo del parseado del documento");
                }else if (xe.isEndElement()){
                    System.out.println("Fin del parseado del documento");
                }else if (xe.isCharacters()){
                    Characters texto=xe.asCharacters();
                    if (!texto.getData().contains("\n")){
                        System.out.println(texto.getData());
                    }
                    if (!tagActual.equals("")){
                        switch (tagActual){
                            case "matricula" :
                                cochesActual.setMatricula(texto.getData());
                                break;
                            case "modelo" :
                                cochesActual.setModelo(texto.getData());
                                break;
                            case "motor" :
                                cochesActual.setMotor(texto.getData());
                                break;

                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(coches);
    }
}
