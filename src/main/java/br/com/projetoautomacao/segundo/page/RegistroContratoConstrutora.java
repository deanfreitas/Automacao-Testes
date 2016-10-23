package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroContratoConstrutora {

	final WebDriver driver;

	@FindBy(name = "dataASSINATURA")
	private WebElement dataAssinatura;

	@FindBy(name = "dataREGISTRO")
	private WebElement dataRegistro;

	@FindBy(name = "dataESTORNO")
	private WebElement dataPrevistaEstorno;

	@FindBy(id = "radioAprovado")
	private WebElement radioAcao;

	@FindBy(css = "#btConfirmar > div.botaoAzul")
	private WebElement confirmarRegistroContratoConstrutora;

	public RegistroContratoConstrutora(WebDriver driver) {
		this.driver = driver;
	}

	public void entrarDataAssinatura(String dataAssinatura) {
		this.dataAssinatura.clear();
		this.dataAssinatura.sendKeys(dataAssinatura);
		this.dataAssinatura.sendKeys(Keys.TAB);
	}

	public void entrarDataRegistro(String dataRegistro) {
		this.dataRegistro.clear();
		this.dataRegistro.sendKeys(dataRegistro);
	}

	public void entrarDataPrevistaEstorno(String dataPrevistaEstorno) {
		this.dataPrevistaEstorno.clear();
		this.dataPrevistaEstorno.sendKeys(dataPrevistaEstorno);
	}

	public void clickRadioAcao() {
		radioAcao.click();
	}

	public SituacaoProposta clickConfirmarRegistroContratoConstrutora() {
		confirmarRegistroContratoConstrutora.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}
}
