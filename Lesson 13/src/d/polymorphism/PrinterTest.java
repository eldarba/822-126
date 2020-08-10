package d.polymorphism;

public class PrinterTest {

	public static void main(String[] args) {

//		new PrinterC().printA();
//		new PrinterC().printB();
//		new PrinterC().printC();

		// the reference type determines what methods we can invoke
		// the object type determines how methods are running
		PrinterA p = new PrinterB();
		p.printA();
//		p.printB();
//		p.printC();

		PrinterA a = new PrinterA();
		PrinterB b = new PrinterB();
		PrinterC c = new PrinterC();

		System.out.println("===============");
		usePrinterToPrintA(a);
		usePrinterToPrintA(b);
		usePrinterToPrintA(c);
		System.out.println("===============");
//		usePrinterToPrintB(a);
		usePrinterToPrintB(b);
		usePrinterToPrintB(c);
	}

	// define a method that is using a printer
	public static void usePrinterToPrintA(PrinterA printer) {
		printer.printA();
	}
	
	public static void usePrinterToPrintB(PrinterB printer) {
		printer.printA();
		printer.printB();
	}

}
