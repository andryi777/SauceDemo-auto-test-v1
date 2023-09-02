package demo.main.xpath;

public class XpathItemDetalle {

	// singleton
	private static XpathItemDetalle obj = null;

	private XpathItemDetalle() {
	}

	public static XpathItemDetalle getInstancia() {
		instanciar();
		return obj;
	}

	private synchronized static void instanciar() {
		if (obj == null) {
			obj = new XpathItemDetalle();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public final String lblItemDetalle="//*[@class='inventory_details_name large_size']";
	public final String lblPrecioDetalle="//*[@class='inventory_details_price']";
}
