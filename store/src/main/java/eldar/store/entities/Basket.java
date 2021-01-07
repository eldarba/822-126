package eldar.store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Basket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String clientName;
	@OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
	private List<Item> items;

	public Basket() {
	}

	public Basket(String clientName) {
		super();
		this.clientName = clientName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		if (this.items == null) {
			this.items = new ArrayList<Item>();
		}
		this.items.add(item);
		item.setBasket(this);
	}

	@Override
	public String toString() {
		return "Basket [id=" + id + ", clientName=" + clientName + "]";
	}

}
