package d.polymorphism;

public class PrinterC extends PrinterB{
	
	public void printC() {
		System.out.println("CCC");
	}
	
	@Override
	public void printA() {
		System.out.println("AAA");
	}

	@Override
	public void printB() {
		System.out.println("BBB");
	}
}
