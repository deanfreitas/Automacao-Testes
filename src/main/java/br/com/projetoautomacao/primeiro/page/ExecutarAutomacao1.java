package br.com.projetoautomacao.primeiro.page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.projetoautomacao.utils.FirefoxUtils;

public class ExecutarAutomacao1 {

	// Login
	public static String user = "";
	public static String pass = "";
	public static String baseurl = "";

	// Numero Proposta
	public static String numeroProposta = "";

	@Test
	public void proposta() throws Exception {
		WebDriver driver = FirefoxUtils.setUp();
		Login login;
		Home home;
		Backoffice backoffice;
		ParametrosGerais parametrosGerais;

		driver.get(baseurl);
		login = PageFactory.initElements(driver, Login.class);
		home = login.loginHome(user, pass);
		backoffice = home.clicarBackoffice();
		parametrosGerais = backoffice.clicarParametrosGerais();
		parametrosGerais.clicarRegiaoDesconto();
		parametrosGerais.clicarControleUnidades();
	}
}
