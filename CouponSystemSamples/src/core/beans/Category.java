package core.beans;

public enum Category {

	FOOD(1), VACATION(2), SPORTS(3), ELECTRICITY(4);

	private Category(int id) {
		this.id = id;
	}

	private int id;

	public static Category getCategory(int id) {
		for (Category c : Category.values()) {
			if (c.id == id) {
				return c;
			}
		}
		return null;
	}

	public int getId() {
		return id;
	}

}
