package p03.builder;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer.Builder("plain", "color", "1500SE").build();
		Printer printer2 = new Printer.Builder("html", "color", "1500SE").setFaxEnabled(true).build();
		Printer printer3 = new Printer.Builder("plain", "black", "1500SE").setScannerEnabled(true).build();
		Printer printer4 = new Printer.Builder("xml", "color", "1800SE").build();
	}
}
