package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicaoObra {

	final WebDriver driver;

	@FindBy(css = "td.frontGridContent")
	private WebElement radioItensMedicaoObra;

	@FindBy(css = "td[name='percentual'] > div > input")
	private WebElement medicaoAtual;

	@FindBy(css = "#botaoConfirmar > table.botaoRodapeBordaRight > tbody > tr > td > div.botaoRodape")
	private WebElement botaoConfirmarMedicaoObra;

	public MedicaoObra(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRadioItensMedicaoObra() {
		radioItensMedicaoObra.click();
	}

	public void entrarMedicaoAtual(String medicaoAtual) {
		this.medicaoAtual.clear();
		this.medicaoAtual.sendKeys(medicaoAtual);
		this.medicaoAtual.sendKeys(Keys.TAB);
	}

	public Vistoria clickBotaoConfirmarMedicaoObra() {
		botaoConfirmarMedicaoObra.click();
		return PageFactory.initElements(driver, Vistoria.class);
	}
}
