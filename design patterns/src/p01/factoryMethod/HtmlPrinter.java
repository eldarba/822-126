package p01.factoryMethod;

public class HtmlPrinter implements Printer {

	// fields
	private String printerType;
	private String ink;

	// CTOR
	public HtmlPrinter(String printerType, String ink) {
		super();
		this.printerType = printerType;
		this.ink = ink;
	}

	// methods
	@Override
	public void print(String text) {
		System.out.println("===================");
		System.out.println("<html>");
		System.out.println(text);
		System.out.println("</html>");
		System.out.println("===================");

	}

	@Override
	public String getPrinterType() {
		return this.printerType;
	}

	@Override
	public String getInk() {
		return this.ink;
	}

	@Override
	public String toString() {
		return "PlainTextPrinter [printerType=" + printerType + ", ink=" + ink + "]";
	}

}
