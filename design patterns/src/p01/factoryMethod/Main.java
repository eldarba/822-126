package p01.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Printer printer;

		printer = PrinterFactory.creatrPrinter(PrinterType.PLAIN_TEXT);
		printer.print("hello");

		printer = PrinterFactory.creatrPrinter(PrinterType.HTML);
		printer.print("hello");

	}

}
