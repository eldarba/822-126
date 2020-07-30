import java.util.Arrays;

public class HelloApp {

	public static void main(String[] args) {

		System.out.println(args.length);
		System.out.println(Arrays.toString(args));

		String firstName = args.length > 0 ? args[0] : "Guest";
		String lastName = args.length > 1 ? args[1] : "no last name";
		System.out.println("Hello " + firstName + " " + lastName);

	}

}
