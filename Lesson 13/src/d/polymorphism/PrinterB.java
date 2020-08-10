package d.polymorphism;

public class PrinterB extends PrinterA{
	
	public void printB() {
		System.out.println("BB");
	}
	
	@Override
	public void printA() {
		System.out.println("AA");
	}
}
