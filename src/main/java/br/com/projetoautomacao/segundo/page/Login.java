package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	final WebDriver driver;

	@FindBy(id = "codigoLogin")
	private WebElement operador;

	@FindBy(id = "codigoSenha")
	private WebElement senha;

	@FindBy(css = "table.botaoRodapeBordaRight.bt_acessar_login")
	private WebElement acessar;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void entrarOperador(String operador) {
		this.operador.clear();
		this.operador.sendKeys(operador);
	}

	public void entrarSenha(String senha) {
		this.senha.clear();
		this.senha.sendKeys(senha);
	}

	public void clicarAcessar() {
		acessar.click();
	}

	public Home loginHome(String operador, String senha) {
		entrarOperador(operador);
		entrarSenha(senha);
		clicarAcessar();
		return PageFactory.initElements(driver, Home.class);
	}
}
