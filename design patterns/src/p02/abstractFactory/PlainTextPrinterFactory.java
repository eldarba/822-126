package p02.abstractFactory;

public class PlainTextPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new PlainTextPrinter("plain printer", "black ink");
	}

}
