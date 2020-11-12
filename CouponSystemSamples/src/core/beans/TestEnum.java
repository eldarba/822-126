package core.beans;

public class TestEnum {

	public static void main(String[] args) {

		int ordinal = 2;

		Category c = Category.values()[ordinal];

		System.out.println(c);

		// =================================

		int categoryId = 3;

		Category c2 = Category.getCategory(categoryId);

		System.out.println(c2);

	}

}
