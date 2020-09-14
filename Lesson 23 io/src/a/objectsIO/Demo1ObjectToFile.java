package a.objectsIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import homework.io.Person;

public class Demo1ObjectToFile {

	public static void main(String[] args) {

//		 writing an object to file (serialization)
		Person p1 = new Person(101, "Dan", 25);
		System.out.println(p1);

		File file = new File("files/persons.obj");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));) {
			out.writeObject(p1); // serialize to file
			System.out.println(p1 + " was wrrite to " + file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
