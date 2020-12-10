package a.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "coupon_id")
	private List<Review> reviews;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "customers_vs_coupons", joinColumns = { @JoinColumn(name = "coupon_id") }, inverseJoinColumns = {
			@JoinColumn(name = "customer_id") })
	private List<Customer> customers;

	public Coupon() {
	}

	public Coupon(String title) {
		super();
		this.title = title;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
