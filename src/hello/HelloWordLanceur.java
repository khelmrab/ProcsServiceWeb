package hello;

import javax.xml.ws.Endpoint;

import calculette.CalculetteImpl;


public class HelloWordLanceur {
	public static void main(String[] args) { 
		Endpoint.publish("http://localhost:9904/ws/calc", new CalculetteImpl());
	}

}
