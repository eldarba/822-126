package app.core.dao.coupon;

public class Coupon {

	private Long id;
	private String name;

	public Coupon(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", name=" + name + "]";
	}

}
