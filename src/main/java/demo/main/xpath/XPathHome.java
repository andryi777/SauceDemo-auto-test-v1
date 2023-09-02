package demo.main.xpath;

public class XPathHome {
	
	// singleton
	private static XPathHome obj = null;

	private XPathHome() {
	}

	public static XPathHome getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XPathHome();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public final String lblTitulo = "//*[@class='app_logo']";
	
	public String lblItem(String label) {
		String pathObject = "//*[@class='inventory_item_name' and contains(text(),'"+label+"')]";
		return pathObject;
	}
	
	public String lblCosto(String label) {
		String pathObject = "//*[contains(text(),'"+label+"')]/ancestor::div[1]//../div[@class='pricebar']/div[@class='inventory_item_price']";
		return pathObject;
	}

}
