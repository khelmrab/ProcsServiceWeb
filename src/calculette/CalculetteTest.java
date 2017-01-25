package calculette;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import calculette.Calculette;
import org.testng.annotations.*;
import javax.xml.namespace.QName; 
import javax.xml.ws.Service;
import java.net.URL;
import static org.testng.Assert.*;

public class CalculetteTest {
	private Calculette calc;

	@BeforeClass
	public void setUp() throws Exception {
		 	URL url = new URL("http://localhost:9904/ws/calc?wsdl");
		    QName qname = new QName("http://calculette/", "CalculetteImplService");
		    Service service = Service.create(url, qname);
		     calc = service.getPort(Calculette.class);
	}

	@AfterClass
	public void tearDown() throws Exception {
	    calc = null;
	}

	@Test
	public void testAjouter() throws Exception {
	    assertEquals(calc.add(2.0,3.0),5.0);
	}

	@Test
	public void testSoustraire() throws Exception {
	    assertEquals(calc.sub(2.0,3.0),-1.0);
	}

}
