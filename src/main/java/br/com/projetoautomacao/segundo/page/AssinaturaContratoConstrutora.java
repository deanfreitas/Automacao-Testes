package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssinaturaContratoConstrutora {
	
	final WebDriver driver;
	
	@FindBy(id = "radioAprovado")
	private WebElement radioAcao;
	
	@FindBy(id = "btFinalizar")
	private WebElement confirmarAssinaturaContratoConstrutora;
	
	public AssinaturaContratoConstrutora(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRadioAcao() {
		radioAcao.click();
	}

	public SituacaoProposta clickConfirmarAssinaturaContratoConstrutora() {
		confirmarAssinaturaContratoConstrutora.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}
	
}
