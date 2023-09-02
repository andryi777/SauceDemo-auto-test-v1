package demo.main.page;

import demo.main.util.PageObjectUtil;
import demo.main.xpath.XpathItemDetalle;
import net.serenitybdd.core.pages.PageObject;

public class AppItemDetallePage extends PageObject {

	private long wdwTimeOut = 300L;
		
	// xpath
	protected XpathItemDetalle xpathItemDetalle = XpathItemDetalle.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	public String getPrecio() {
		pageObjectUtil.seleniumClick(getDriver(), xpathItemDetalle.lblPrecioDetalle, 0);
		return pageObjectUtil.seleniumGetTexto(getDriver(), xpathItemDetalle.lblPrecioDetalle, 0);
	}

}
