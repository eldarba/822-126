package task3.api.orders;

import java.util.Calendar;
import java.util.Objects;

public class Order implements Comparable<Order> {

	private Calendar readyOn;
	private String text;
	private boolean important;
	private boolean popped;

	public Order(Calendar readyOn, String text, boolean important) {
		super();
		setReadyOn(readyOn);
		this.text = text;
		this.important = important;
	}

	public Calendar getReadyOn() {
		return readyOn;
	}

	public String getText() {
		return text;
	}

	public boolean isImportant() {
		return important;
	}

	public boolean isPopped() {
		return popped;
	}

	public void setReadyOn(Calendar readyOn) {
		if (readyOn.before(Calendar.getInstance())) {
			throw new RuntimeException("readyon must be in the future");
		} else {
			this.readyOn = readyOn;
		}
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setImportant(boolean important) {
		this.important = important;
	}

	public void setPopped(boolean popped) {
		this.popped = popped;
	}

	@Override
	public int compareTo(Order other) {
		return this.readyOn.compareTo(other.readyOn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(readyOn, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		Order other = (Order) obj;
		return Objects.equals(readyOn, other.readyOn) && Objects.equals(text, other.text);
	}

	@Override
	public String toString() {
		return "Order [readyOn=" + readyOn.getTime() + ", text=" + text + ", important=" + important + ", popped="
				+ popped + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((readyOn == null) ? 0 : readyOn.hashCode());
//		result = prime * result + ((text == null) ? 0 : text.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Order)) {
//			return false;
//		}
//		Order other = (Order) obj;
//		if (readyOn == null) {
//			if (other.readyOn != null) {
//				return false;
//			}
//		} else if (!readyOn.equals(other.readyOn)) {
//			return false;
//		}
//		if (text == null) {
//			if (other.text != null) {
//				return false;
//			}
//		} else if (!text.equals(other.text)) {
//			return false;
//		}
//		return true;
//	}

}
