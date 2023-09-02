package demo.main.step;

import demo.main.page.AppHomepage;
import demo.main.page.AppLoginPage;

public class LoginStep {

	private AppLoginPage appLoginPage;
	private AppHomepage appHomePage;
	
	public void ingresarWeb() {
		appLoginPage.inicializar("https://www.saucedemo.com/");
	}
	
	public void login(String userdemo, String password) {
		appLoginPage.login(userdemo, password);
	}

	public String getTitulo() {
		String titulo = appHomePage.getTitulo();
		return titulo;
	}

}
