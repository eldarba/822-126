package b.generics.box;

import java.util.ArrayList;
import java.util.List;

public class TestBox {

	public static void main(String[] args) {

		Box<String> box = new Box<>("aaa");
		String content = box.getContent();
		box.setContent("bbb");

		Box<Character> box2 = new Box<>('A');

		List<?> list1 = new ArrayList<String>();

		List<? extends Object> list2 = new ArrayList<String>();

		List<? super String> list3 = new ArrayList<Object>();

	}

	public static void m1(Box<String> box) {
		// method will accept only box of object
		// code is not limited
		// return types are Object
	}

	public static void m2(Box<?> box) {
		// method will accept any box of any type
		// code is blocked from setting the content of the box
		// return types are accurate
	}

	public static void m3(Box<? extends Object> box) {

	}

	public static void m4(Box<? super String> box) {

	}

}
