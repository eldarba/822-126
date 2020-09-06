package c.inner;

import c.inner.State.Citiezen;
import c.inner.State.Shop;

public class Test {

	public static void main(String[] args) {
		Shop shop = new Shop();

		State isr = new State("Israel");
		State fr = new State("France");

		Citiezen c1 = isr.new Citiezen("Dan");
		Citiezen c2 = fr.new Citiezen("pier");

		System.out.println(c1.getName() + " from " + c1.getStateName());
		System.out.println(c2.getName() + " from " + c2.getStateName());

	}

}
