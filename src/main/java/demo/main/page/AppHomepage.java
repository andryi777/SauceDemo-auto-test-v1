package demo.main.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import demo.main.util.PageObjectUtil;
import demo.main.xpath.XPathHome;

public class AppHomepage extends PageObject {

	private long wdwTimeOut = 300L;
		
	// xpath
	protected XPathHome xpathHomePage = XPathHome.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}
	
	public String getTitulo() {
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.lblTitulo, 0);
		Serenity.takeScreenshot();
		return pageObjectUtil.seleniumGetTexto(getDriver(), xpathHomePage.lblTitulo, 0);
	}
	
	public void seleccionarItem(String item) {
		Serenity.takeScreenshot();
		pageObjectUtil.seleniumClick(getDriver(), xpathHomePage.lblItem(item), 0);

	}
}
