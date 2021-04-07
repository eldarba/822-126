package app.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import app.core.beans.simple.Person;

public class TypeSafety {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person());
		persons.add(new Person());
		persons.add(new Person());

		List x = persons;
		x.add("aaa");
		x.add(new Date());

		persons.add(new Person());
		persons.add(new Person());

		System.out.println(persons);

	}

}
