package tema8.entregable2;

import com.sun.management.UnixOperatingSystemMXBean;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {
  public static void main(String[] args) {
    ArrayList<Pajaro> pajaros= new ArrayList<>();
    Pajaro p1=new Pajaro("Albatros",3,7, "Nadador");
    Pajaro p2=new Pajaro("Cordorniz",1,1.2, "Terrestre");
    Pajaro p3=new Pajaro("Pingüino",13,25, "Nadador");
    Pajaro p4=new Pajaro("Avetruz",14,50, "Terrestre");
    Pajaro p5=new Pajaro("Cigüena",8,30, "Volador");
    Pajaro p6=new Pajaro("Gallineta",3,2.3, "Nadador");
    Pajaro p7=new Pajaro("Loro africano",70,15.4, "Volador");
    Pajaro p8=new Pajaro("Kiwi",4,0.7, "Terrestre");
    Pajaro p9=new Pajaro("Pajaro Carpintero",2,0.5, "volador");
    Pajaro p10=new Pajaro("Cormorán",10,8.5, "Nadador");

    pajaros.add(p1);
    pajaros.add(p2);
    pajaros.add(p3);
    pajaros.add(p4);
    pajaros.add(p5);
    pajaros.add(p6);
    pajaros.add(p7);
    pajaros.add(p8);
    pajaros.add(p9);
    pajaros.add(p10);

    try{
      DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
      DocumentBuilder builder=factory.newDocumentBuilder();
      Document doc=builder.newDocument();
      Element root=doc.createElement("Aves");
      doc.appendChild(root);


      for (int i = 0; i <pajaros.size() ; i++) {
        Element son=doc.createElement("ave");
        root.appendChild(son);
        for (int j = 0; j< 1; j++) {
          Element nombre=doc.createElement("nombre");
          nombre.setAttribute("edad",Integer.toString(pajaros.get(i).getEdad()));
          nombre.setTextContent(pajaros.get(i).getNombre());
          Element peso=doc.createElement("peso");
          peso.setTextContent(String.valueOf(pajaros.get(i).getPeso()));
          Element tipo=doc.createElement("tipo");
          tipo.setTextContent(pajaros.get(i).getTipo());
          son.appendChild(nombre);
          son.appendChild(peso);
          son.appendChild(tipo);
        }
      }
     ;
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
      transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      DOMSource origenDOM = new DOMSource(root);
      File nuevoPersonas = new File("Aves.xml");
      StreamResult destino = new StreamResult(nuevoPersonas);

      transformer.transform(origenDOM,destino);
    }catch (Exception e){
      System.out.println(e.getMessage());
    }

  }
}
