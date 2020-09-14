package a.objectsIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import homework.io.Person;

public class Demo2ObjectFromFile {

	public static void main(String[] args) {

		// writing an object to file (serialization)
//		Person p1 = new Person(101, "Dan", 25);

		File file = new File("files/persons.obj");

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {
			Person person = (Person) in.readObject(); // deserialize the object from file
			System.out.println(person);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
