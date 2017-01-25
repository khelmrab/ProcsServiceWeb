package hello;

import javax.xml.ws.Endpoint;

import fr.paris10.miage.procs.exercice1.HelloWorldImpl;

public class HelloWordLanceur {
	public static void main(String[] args) { 
		Endpoint.publish("http://localhost:9990/ws/bonjour", new HelloWorldImpl());
	}

}
