package tema8.Entregable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreateXML cxml=new CreateXML();
        RecorridoSAX rsax=new RecorridoSAX();
        RecorridoDOM rdom=new RecorridoDOM();
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Crear fichero XML"+'\n'+"2-Recorrer con Sax"+'\n'+"3-Número de nodos"+'\n'+"4-Ver archivo XML"+'\n'+"5-Ver contenido archivo XML");
        int k=sc.nextInt();
        switch (k){
            case 1:
                System.out.println("Quieres crear un archivo XML");
                System.out.println("Dime el nombre del fichero(Sin extensión) y el nodo raíz");
                String Path=sc.next();
                String root=sc.next();
                cxml.createXML(Path,root);
            case 2:
                System.out.println("Quieres recorrer un archivo XML con SAX");
                rsax.parseradorSAX();
            case 3:
                System.out.println("Quieres saber el número de nodos hijos con DOM");
                System.out.println("Dime el nombre del fichero (sin extensión)");
                String name=sc.next();
                rdom.numNodosHijos(name);
            case 4:
                System.out.println("Quieres ver el archivo XML con DOM. Dime el nombre del fichero(Sin extensión)");
                String named=sc.next();
                rdom.mostrarXMLDom(named);
            case 5:
                System.out.println("Quieres ver el contenido del archivo XML con DOM , desde una etiqueta");
                System.out.println("dime el fichero(Sin extensión) y la etiqueta por donde quieres empezar a ver el contenido ");
                String namdr=sc.next();
                String element=sc.next();
                try{
                    DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder=factory.newDocumentBuilder();
                    Document doc=builder.parse(new File(namdr+".xml"));
                    Element e= (Element) doc.getElementsByTagName(element);
                    rdom.mostrarContenidoEtiqueta(e);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
        }
    }
}
