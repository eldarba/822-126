package b.remote;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		String serviceAddress = "http://localhost:8080/calc";
		System.out.println("WSDL is published in: " + serviceAddress + "?wsdl");
		Endpoint.publish(serviceAddress, calculator);

	}

}
