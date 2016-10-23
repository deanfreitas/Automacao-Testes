package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vistoria {

	final WebDriver driver;

	@FindBy(id = "dataVistoria")
	private WebElement dataVistoria;
	
	@FindBy(id = "nm_engenheiro")
	private WebElement engenheiroVistoria;
	
	@FindBy(id = "nr_crea")
	private WebElement numeroCrea;
	
	@FindBy(css = "#botaoMedicaoObra > div")
	private WebElement botaoMedicaoObra;
	
	@FindBy(css = "table.botaoRodapeBordaRight > tbody > tr > td > div.botaoRodape")
	private WebElement confirmarVistoria;

	public Vistoria(WebDriver driver) {
		this.driver = driver;
	}
	
	public void entrarDataVistoria(String dataVistoria) {
		this.dataVistoria.clear();
		this.dataVistoria.sendKeys(dataVistoria);
		this.dataVistoria.sendKeys(Keys.TAB);
	}
	
	public void entrarEngenheiroVistoria(String engenheiroVistoria) {
		this.engenheiroVistoria.clear();
		this.engenheiroVistoria.sendKeys(engenheiroVistoria);
	}
	
	public void entrarNumeroCrea(String numeroCrea) {
		this.numeroCrea.clear();
		this.numeroCrea.sendKeys(numeroCrea);
	}
	
	public MedicaoObra clickBotaoMedicaoObra() {
		botaoMedicaoObra.click();
		return PageFactory.initElements(driver, MedicaoObra.class);
	}
	
	public ValidacaoOrcamentoCronograma clickConfirmarVistoria() {
		confirmarVistoria.click();
		return PageFactory.initElements(driver, ValidacaoOrcamentoCronograma.class);
	}
}
