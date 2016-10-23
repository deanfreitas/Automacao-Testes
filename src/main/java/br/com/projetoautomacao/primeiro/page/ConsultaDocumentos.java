package br.com.projetoautomacao.primeiro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultaDocumentos {

	final WebDriver driver;

	@FindBy(id = "radioProposta")
	private WebElement radioProposta;

	@FindBy(id = "numeroProposta")
	private WebElement numeroProposta;

	@FindBy(css = "#btAplicar > div.botaoAzul")
	private WebElement aplicar;

	@FindBy(css = "div.botao_acao_conteudo_verde")
	private WebElement continuar;

	public ConsultaDocumentos(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarRadioProposta() {
		radioProposta.click();
	}

	public void entrarNumeroProposta(String numeroProposta) {
		this.numeroProposta.clear();
		this.numeroProposta.sendKeys(numeroProposta);
	}

	public void clicarAplicarProposta() {
		aplicar.click();
	}

	public CentralDocumentos clicarContinuar() {
		continuar.click();
		return PageFactory.initElements(driver, CentralDocumentos.class);
	}
}
