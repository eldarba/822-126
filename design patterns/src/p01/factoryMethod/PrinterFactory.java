package p01.factoryMethod;

public class PrinterFactory {

	public static Printer creatrPrinter(PrinterType type) {
		Printer printer = null;

		switch (type) {
		case PLAIN_TEXT:
			printer = new PlainTextPrinter("plain printer", "black");
			break;
		case HTML:
			printer = new HtmlPrinter("html printer", "color");
			break;
		}
		return printer;
	}
}
