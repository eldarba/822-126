package p02.abstractFactory;

public class XmlPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new XmlPrinter("xml printer", "simple ink");
	}

}
