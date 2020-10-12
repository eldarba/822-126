package b.systemBuild;

public class Calculator {

	private double currResult;

	public void add(double val) {
		currResult += val;
	}

	public void sub(double val) {
		currResult -= val;
	}

	public void mul(double val) {
		currResult *= val;
	}

	public void div(double val) {
		currResult /= val;
	}

	public double getCurrResult() {
		return currResult;
	}

	public void clear() {
		this.currResult = 0;
	}

	public void showMenu() {
		System.out.println("=======================");
		System.out.println("calculator menu");
		System.out.println("1 ....... add");
		System.out.println("2 ....... sub");
		System.out.println("3 ....... mul");
		System.out.println("4 ....... div");
		System.out.println("5 ....... show");
		System.out.println("6 ....... clear");
		System.out.println("q ....... exit");
		System.out.print("your choice: ");
	}

}
