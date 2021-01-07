package a.demos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import a.Person;

public class Demo2UnMarshal {

	public static void main(String[] args) {

		try {
			JAXBContext ctx = JAXBContext.newInstance("a");
			// unmarshal - convert xml object
			Unmarshaller unmarshaller = ctx.createUnmarshaller();
			Person person = (Person) unmarshaller.unmarshal(new File("files/person.xml"));
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAge());

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
