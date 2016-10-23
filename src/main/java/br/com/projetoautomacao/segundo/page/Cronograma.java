package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cronograma {

	final WebDriver driver;

	@FindBy(css = "table.botaoRodapeBordaLeft.bt_orcamento_cronograma > tbody > tr > td > div.botaoRodape")
	private WebElement orcamentoCronograma;

	@FindBy(css = "#btConfirmar > table.botaoRodapeBordaRight.bt_confirmar > tbody > tr > td > div.botaoRodape")
	private WebElement confirmarCronograma;

	public Cronograma(WebDriver driver) {
		this.driver = driver;
	}

	public OrcamentoCronograma clickOrcamentoCronograma() {
		orcamentoCronograma.click();
		return PageFactory.initElements(driver, OrcamentoCronograma.class);
	}

	public CriarEmpreendimento clickConfirmarCronograma() {
		confirmarCronograma.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);
	}
}
