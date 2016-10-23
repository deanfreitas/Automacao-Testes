package br.com.projetoautomacao.segundo.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrcamentoCronograma {

	final WebDriver driver;

	@FindBy(name = "checkROW")
	private WebElement radioMovimentoTerra;

	@FindBy(css = "#innerTable > table.fd_tb_orc_sub > tbody > tr > #tdFROZEN > #border > #tableBody > tbody[name='firstBODY'] > tr[name='hoverCLASS'] > td.frontGridContent > div > input")
	private WebElement quantidadeEscavacaoManual;

	@FindBy(xpath = "//table[@id='tableBody']/tbody/tr/td[6]/div/input")
	private WebElement valorEscavacaoManual;

	@FindAll(value = { @FindBy(name = "percentualITEM") })
	private List<WebElement> escavacaoManual;

	@FindBy(css = "#botaoConfirmar > table.botaoRodapeBordaRight.bt_confirmar > tbody > tr > td > div.botaoRodape")
	private WebElement confirmarOrcamentoCronograma;

	public OrcamentoCronograma(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRadioMovimentoTerra() {
		radioMovimentoTerra.click();
	}

	public void entrarQuantidadeEscavacaoManual(String quantidadeEscavacaoManual) {
		this.quantidadeEscavacaoManual.clear();
		this.quantidadeEscavacaoManual.sendKeys(quantidadeEscavacaoManual);
	}

	public void entrarValorEscavacaoManual(String valorEscavacaoManual) {
		this.valorEscavacaoManual.clear();
		this.valorEscavacaoManual.sendKeys(valorEscavacaoManual);
	}

	public void entrarEscavacaoManual(List<String> escavacaoManual) {
		int i = 0;
		for (String escavacaoManual1 : escavacaoManual) {
			this.escavacaoManual.get(i).clear();
			this.escavacaoManual.get(i).sendKeys(escavacaoManual1);
			i++;
		}
	}

	public Cronograma clickConfirmarOrcamentoCronograma() {
		confirmarOrcamentoCronograma.click();
		return PageFactory.initElements(driver, Cronograma.class);
	}
}
