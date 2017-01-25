package calculette;

import javax.jws.WebMethod; 
import javax.jws.WebService; 
import javax.jws.soap.SOAPBinding;

@WebService 
@SOAPBinding(style = SOAPBinding.Style.RPC) 
public interface Calculette {
	@WebMethod double add(double a, double b);
	@WebMethod double sub (double a, double b);
	
}
