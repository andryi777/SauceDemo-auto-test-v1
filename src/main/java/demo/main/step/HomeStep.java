package demo.main.step;

import demo.main.page.AppHomepage;
import demo.main.page.AppItemDetallePage;

public class HomeStep {

	private AppHomepage appHomePage;
	private AppItemDetallePage appItemDetallePage;
	
	public void seleccionoItem(String item) {
		appHomePage.seleccionarItem(item);
	}

	public String getPrecio() {
		String precio = appItemDetallePage.getPrecio();
		return precio;
	}

}
