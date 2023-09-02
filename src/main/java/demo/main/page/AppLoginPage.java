package demo.main.page;

import java.util.concurrent.TimeUnit;

import demo.main.util.PageObjectUtil;
import demo.main.xpath.XpathLogin;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class AppLoginPage extends PageObject {

	private long wdwTimeOut = 300L;

	// xpath
	protected XpathLogin xpathLoginPage = XpathLogin.getInstancia();


	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public long getWdwTimeOut() {
		return wdwTimeOut;
	}

	public void inicializar(String url) {
		getDriver().navigate().to(url);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);

	}

	public void login(String userdemo, String password) {
		pageObjectUtil.seleniumClick(getDriver(), xpathLoginPage.txtuser, 0);
		pageObjectUtil.seleniumEscribir(getDriver(), xpathLoginPage.txtuser, 0, userdemo, null);
		pageObjectUtil.seleniumEscribir(getDriver(), xpathLoginPage.txtpassword, 0, password, null);
		Serenity.takeScreenshot();
		pageObjectUtil.seleniumClick(getDriver(), xpathLoginPage.btnLogin, 0);

	}
	
}
