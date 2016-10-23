package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidacaoOrcamentoCronograma {

	final WebDriver driver;

	@FindBy(css = "#botaoVistoria > div.btVerdeResumo")
	private WebElement vistoria;

	@FindBy(name = "conclusao")
	private WebElement conclusaoTecnica;

	@FindBy(id = "radioAprovado")
	private WebElement acaoValidacaoOrcamentoCronograma;

	@FindBy(css = "#btConfirmar > table.botaoRodapeBordaRight")
	private WebElement confimarValidacaoOrcamentoCronograma;

	public ValidacaoOrcamentoCronograma(WebDriver driver) {
		this.driver = driver;
	}

	public Vistoria clickVistoria() {
		vistoria.click();
		return PageFactory.initElements(driver, Vistoria.class);
	}

	public void clickConclusaoTecnica() {
		conclusaoTecnica.click();
	}

	public void clickAcaoValidacaoOrcamentoCronograma() {
		acaoValidacaoOrcamentoCronograma.click();
	}

	public SituacaoProposta clickConfimarValidacaoOrcamentoCronograma() {
		confimarValidacaoOrcamentoCronograma.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}

}
