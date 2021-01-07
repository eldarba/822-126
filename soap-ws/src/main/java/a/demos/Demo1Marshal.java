package a.demos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import a.Person;

public class Demo1Marshal {

	public static void main(String[] args) {

		try {
			JAXBContext ctx = JAXBContext.newInstance("a");
			// marshal - convert object to xml
			Marshaller marshaller = ctx.createMarshaller();
			// create a person object
			Person person = new Person();
			person.setId(101);
			person.setName("David");
			person.setAge(33);
			// convert the person object to xml file
			marshaller.marshal(person, new File("files/person.xml"));
			System.out.println("done");
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
