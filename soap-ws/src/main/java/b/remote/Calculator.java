package b.remote;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import a.Person;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public String greet(Person person) {
		return "Hello " + person.getName();
	}

}
