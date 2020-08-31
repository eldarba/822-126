package z.homework;

public class Box<T> implements GenericBox<T> {

	private T content;

	public Box(T content) {
		super();
		this.content = content;
	}

	@Override
	public T getContent() {
		return content;
	}

	@Override
	public void setContent(T content) {
		this.content = content;
	}

}
