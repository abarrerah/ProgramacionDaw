package tema8.entregable2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {

    public void modifyXMLDom(){
        try{
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc = builder.parse(new File("concesionario.xml"));

            Node root =doc.getDocumentElement();

            for (int i = 0; i <5 ; i++) {
                Comment comment=doc.createComment("Esto es un comentario con DOM");
                Element first=(Element)doc.getElementsByTagName("coche").item(i);
                root.insertBefore(comment,first);
            }

            Element car=doc.createElement("coche");
            car.setAttribute("id","6");
            Element enrollment=doc.createElement("matricula");
            enrollment.setTextContent("666EEE");
            Element model=doc.createElement("modelo");
            model.setTextContent("Ford Focus ST");
            Element motor=doc.createElement("motor");
            motor.setTextContent("1400 cc gasolina");
            car.appendChild(enrollment);
            car.appendChild(model);
            car.appendChild(motor);
            root.appendChild(car);

            Element carCloned=doc.createElement("coche");
            carCloned.setAttribute("id","7");
            Element enrollment1=doc.createElement("matricula");
            enrollment1.setTextContent("777HHH");
            Element model1=doc.createElement("modelo");
            model1.setTextContent("Hyundai I30N");
            Element motor1=doc.createElement("motor");
            motor1.setTextContent("2600 cc gasolina");
            carCloned.appendChild(enrollment1);
            carCloned.appendChild(model1);
            carCloned.appendChild(motor1);
            root.appendChild(carCloned);
            Element firstCar=(Element) doc.getElementsByTagName("coche").item(0);
            root.replaceChild(carCloned,firstCar);





            TransformerFactory tf=TransformerFactory.newInstance();
            Transformer transformer=tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File newFile = new File("nuevoConcesionario.xml");
            StreamResult destino = new StreamResult(newFile);
            transformer.transform(origenDOM,destino);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        ModificarDOM modificarDOM=new ModificarDOM();
        modificarDOM.modifyXMLDom();

    }
}
