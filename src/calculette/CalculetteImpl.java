package calculette;
import javax.jws.WebService;

@WebService(endpointInterface = "calculette.Calculette")

public class CalculetteImpl implements Calculette {
	private double a;
	private double b;
	
	
	public CalculetteImpl() {
		
	}
	
	public CalculetteImpl(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double add(double a, double b){
		return a+b;
		
	}
	public double sub(double a, double b){
		return a-b;
	}
	
}


