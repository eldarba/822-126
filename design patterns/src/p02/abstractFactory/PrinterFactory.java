package p02.abstractFactory;

public class PrinterFactory {

	public static Printer creatrPrinter(PrinterAbstractFactory factory) {
		return factory.createPrinter();
	}
}
