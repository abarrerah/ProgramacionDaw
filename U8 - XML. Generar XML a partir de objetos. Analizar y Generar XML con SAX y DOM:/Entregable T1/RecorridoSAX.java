package tema8.Entregable;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.Scanner;

public class RecorridoSAX extends DefaultHandler {
    public RecorridoSAX(){
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Vamos a empezar a parsear con SAX");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("El parseado con SAX ,se ha acabado");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.print("<"+qName);
        if (attributes!=null){
            for (int i = 0; i <attributes.getLength() ; i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }
        System.out.print(">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("</"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String contenido=new String(ch,start,length);
        System.out.print(contenido);
    }

    public  void parseradorSAX() {
        Scanner sc=new Scanner(System.in);
            try{
                SAXParserFactory factory=SAXParserFactory.newInstance();
                SAXParser parser=factory.newSAXParser();
                DefaultHandler dh= new RecorridoSAX();
                System.out.println("Dime el nombre del fichero XML");
                String name=sc.next();
                parser.parse(name+".xml",dh);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

}
