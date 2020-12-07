package a.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Coupon {

	private Long id;
	private String title;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Review> reviews;

	public Coupon() {
	}

	public Coupon(String title, List<Review> reviews) {
		super();
		this.title = title;
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + "]";
	}

	public void addReview(Review review) {
		if (this.reviews == null) {
			this.reviews = new ArrayList<Review>();
		}
		reviews.add(review);

	}

}
