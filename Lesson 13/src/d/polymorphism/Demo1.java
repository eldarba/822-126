package d.polymorphism;

import c.finalDemo.Employee;
import c.finalDemo.Person;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// reference type and instance type are the same
		Person p = new Person(101);
		
		// reference type and instance type are the same
		Employee e = new Employee(102);
		
		// reference type and instance type are not the same
		// only when the instance is a subclass of the reference
		// this is called polymorphism
		Person p2 = new Employee(103);
		
	}

}
