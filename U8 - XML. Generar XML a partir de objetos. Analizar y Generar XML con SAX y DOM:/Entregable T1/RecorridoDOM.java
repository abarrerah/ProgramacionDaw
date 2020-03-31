package tema8.Entregable;


import org.w3c.dom.*;
import org.xml.sax.InputSource;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringReader;
import java.util.Scanner;

public class RecorridoDOM {
    /**
     * Deberían ser métodos vacios, pero como dejo al usuario que elija el archivo que quiera, le tengo que pasar los parámetros.
     * @param name
     */
    public void numNodosHijos(String name){
        int numhijos=0;
        int numhijost=0;
        int numhijosc=0;
    try{
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder= factory.newDocumentBuilder();
        Document doc=builder.parse(new File(name+".xml"));
        Element root=doc.getDocumentElement();
        NodeList nodeList=root.getChildNodes();
        for (int i = 0; i <nodeList.getLength() ; i++) {
            if (nodeList.item(i).getNodeType()== Node.ELEMENT_NODE){
                numhijos++;

            }else if (nodeList.item(i).getNodeType() == Node.TEXT_NODE) {
                numhijost++;

            }else if (nodeList.item(i).getNodeType() == Node.COMMENT_NODE) {
                numhijosc++;
            }

        }
        System.out.println("-----------------------------------------");
        System.out.println("| El numero de nodos  son: "+numhijos+"            |");
        System.out.println("| El número de nodos texto son: "+numhijost+"       |");
        System.out.println("| El número de nodos comentarios son: "+numhijosc+" |");
        System.out.println("-----------------------------------------");
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
    public void mostrarXMLDom(String Path){
    DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
    try{
        DocumentBuilder builder=factory.newDocumentBuilder();
        Document doc=builder.parse(new File(Path+".xml"));
        Element root=doc.getDocumentElement();
        NodeList nodelist=root.getChildNodes();
        for (int i = 0; i <nodelist.getLength() ; i++) {
            if (nodelist.item(i).getNodeType()==Node.ELEMENT_NODE){
                Element e=(Element) nodelist.item(i);
                System.out.println("Nodo raíz: "+e.getTagName());
                if (e.hasChildNodes()){
                    Element em= (Element) e.getChildNodes();
                    System.out.println("     Nodo hijo: "+em.getTagName()+". Contenido: "+em.getTextContent());
                }
            }
        }

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }

   public static String mostrarContenidoEtiqueta(Element em){
       Node child = em.getFirstChild();
       if (child instanceof CharacterData) {
           CharacterData cd = (CharacterData) child;
           return cd.getData();
       }
       return "?";
   }


    }

