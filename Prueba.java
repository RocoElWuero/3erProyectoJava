import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class Prueba
{
	public static void main(String[] args)
	{
		try
		{
			File archivo = new File("C:\\Users\\WUERO\\Desktop\\PROTECO\\Java\\3erProyecto\\Clientes.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			System.out.println("\nElemento raiz: "+document.getDocumentElement().getNodeName());
			NodeList listaClientes = document.getElementsByTagName("cliente");
			for(int i=0; i<listaClientes.getLength(); i++)
			{
				Node nodo = listaClientes.item(i);
				System.out.println("\n\tElemento: "+nodo.getNodeName());
				if(nodo.getNodeType() == Node.ELEMENT_NODE)
				{
					Element element = (Element) nodo;
//					System.out.println("\n Id:  "+element.getAttribute("id"));
					System.out.println("\n Nombre: "+element.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("\n Direccion: "+element.getElementsByTagName("direccion").item(0).getTextContent());
//					System.out.println("\n Username: "+element.getElementsByTagName("username").item(0).getTextContent());
//					System.out.println("\n Password: "+element.getElementsByTagName("password").item(0).getTextContent());
				}
			}
		} catch(Exception e) {e.printStackTrace();}
	}
}