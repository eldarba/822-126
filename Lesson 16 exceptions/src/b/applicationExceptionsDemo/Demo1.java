package b.applicationExceptionsDemo;

public class Demo1 {

	public static void main(String[] args) {

		try {
			String className = "z.types.animals.Dog";
//			String className = "z.types.animals.dog"; // throws an exception
			Class.forName(className);
			System.out.println(className + " loaded successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
