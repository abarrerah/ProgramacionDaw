package tema8.Entregable;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;


public class CreateXML {
    public void createXML(String path,String root){
        Scanner sc= new Scanner(System.in);
        DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
        System.out.println("El nombre del documento es "+path+".xml");
        try {
            DocumentBuilder builder= factory.newDocumentBuilder();
            DOMImplementation implementation=builder.getDOMImplementation();
            System.out.println("El nombre de la etiqueta padre es "+root);
            Document doc= implementation.createDocument(null,root,null);
            doc.setXmlVersion("1.0");

            for (int i = 0; i <5 ; i++) {
                System.out.println("¿Como se llama la etiqueta hija?");
                String f=sc.next();
                Element father=doc.createElement(f);
                for (int j = 1; j <4 ; j++) {


                    System.out.println("Dime el nombre de la etiqueta nieta numero "+j);
                    String fgc=sc.next();
                    Element fchild=doc.createElement(fgc);
                    System.out.println("¿Y su atributo?");
                    String fgca=sc.next();
                    Attr attr1=doc.createAttribute(fgca);
                    System.out.println("¿Con que valor?");
                    String fgcav=sc.next();
                    attr1.setValue(fgcav);
                    fchild.setAttributeNode(attr1);
                    System.out.println("Dime el texto que quieres añadirle");
                    String tfc=sc.next();
                    Text textFChild=doc.createTextNode(tfc);
                    fchild.appendChild(textFChild);
                    father.appendChild(fchild);
                    System.out.println();
                }
                doc.getDocumentElement().appendChild(father);
            }
            Source source = new DOMSource(doc);
            Result result= new StreamResult(new File(path+".xml"));

            Transformer transformer= TransformerFactory.newInstance().newTransformer();
            transformer.transform(source,result);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }


}
