package by.papkou.task1.report;

import by.papkou.task1.vegetables.Vegetable;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteToXml 
{
    public void createXml(ArrayList<Vegetable> vegetables)
    {
        try
        {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            Document doc = docBuilder.newDocument();
            //add elements to Document
            Element rootElement = doc.createElement("Salad");
            //append root element to document
            doc.appendChild(rootElement);
            
            int i = vegetables.size();            
            for(int j = 0; j < i; j++)
            {
                Element vegetable = doc.createElement("Vegetable");
                rootElement.appendChild(vegetable);
                
                Element weight = doc.createElement("weight");
                weight.appendChild(doc.createTextNode(String.valueOf(vegetables.get(j).getWeight())));
                vegetable.appendChild(weight);
                
                Element caloricity = doc.createElement("caloricity");                
                caloricity.appendChild(doc.createTextNode(String.valueOf(vegetables.get(j).getCaloricity())));
                vegetable.appendChild(caloricity);
            }
            TransformerFactory transformerFactory =
                    TransformerFactory.newInstance();
                
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            StreamResult result =  new StreamResult(new File("salad.xml"));
            transformer.transform(source, result);
        }
        catch (Exception e) 
        {
            System.out.println("Error in xml writing");
        }   
    }

}
