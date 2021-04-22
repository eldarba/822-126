package p02.abstractFactory;

public class Main {

	public static void main(String[] args) {
		Printer printer;

		printer = PrinterFactory.creatrPrinter(new PlainTextPrinterFactory());
		printer.print("hello");

		printer = PrinterFactory.creatrPrinter(new HtmlPrinterFactory());
		printer.print("hello");

		printer = PrinterFactory.creatrPrinter(new XmlPrinterFactory());
		printer.print("hello");

	}

}
