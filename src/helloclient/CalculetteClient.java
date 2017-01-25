package helloclient;
import javax.xml.namespace.QName; 
import javax.xml.ws.Service;

import calculette.Calculette;

import java.net.URL;
public class CalculetteClient {
	public static void main(String[] args) throws Exception {
	    URL url = new URL("http://localhost:9904/ws/calc?wsdl");
	    QName qname = new QName("http://calculette/", "CalculetteImplService");
	    Service service = Service.create(url, qname);
	    Calculette cal = service.getPort(Calculette.class);
	    System.out.println(cal.add(1,2));
	}
}
