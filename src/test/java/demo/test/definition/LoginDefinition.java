package demo.test.definition;

import static org.junit.Assert.assertEquals;

import demo.main.step.HomeStep;
import demo.main.step.LoginStep;
import demo.test.util.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
	
	@Steps
	private LoginStep loginStep;
	
	@Steps
	private HomeStep homeStep;
	
	@Given("accedo a la web de Saucelabs")
	public void accedo_a_la_web_de_saucelabs() {
		loginStep.ingresarWeb();
		loginStep.login(Constantes.userdemo, Constantes.password);
	}

	@Then("debe mostrarse el título {string}")
	public void debe_mostrarse_el_título(String valorEsperado) {
		String valorActual = loginStep.getTitulo();
		assertEquals(valorEsperado, valorActual);
	}

	@Given("selecciono el item {string}")
	public void selecciono_el_item(String item) {
		homeStep.seleccionoItem(item);
	}

	@Then("debe mostrarse el item {string} con su precio {string}")
	public void debe_mostrarse_el_item_con_su_precio(String item, String valorEsperado) {
		String valorActual = homeStep.getPrecio();
		assertEquals(valorEsperado, valorActual);
	}
}
