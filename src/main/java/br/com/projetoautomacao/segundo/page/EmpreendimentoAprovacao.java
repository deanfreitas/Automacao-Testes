package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpreendimentoAprovacao {

	final WebDriver driver;

	@FindBy(id = "radioProposta")
	private WebElement radioProposta;

	@FindBy(id = "numeroProposta")
	private WebElement numeroProposta;

	@FindBy(css = "table.botaoRodapeBordaRight.bt_situacao > tbody > tr > td > div.botaoRodape")
	private WebElement situacaoProposta;

	public EmpreendimentoAprovacao(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRadioProposta() {
		radioProposta.click();
	}

	public void entrarNumeroProposta(String numeroProposta) {
		this.numeroProposta.clear();
		this.numeroProposta.sendKeys(numeroProposta);
	}

	public SituacaoProposta clickSituacaoProposta() {
		situacaoProposta.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}
}
