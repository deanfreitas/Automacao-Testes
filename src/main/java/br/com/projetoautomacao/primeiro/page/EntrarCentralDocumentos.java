package br.com.projetoautomacao.primeiro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntrarCentralDocumentos {

	final WebDriver driver;

	@FindBy(css = "div.botoesMenuImagemConsultaDocumentos")
	private WebElement consultaDocumentos;

	public EntrarCentralDocumentos(WebDriver driver) {
		this.driver = driver;
	}

	public ConsultaDocumentos clicarConsultaDocumentos() {
		consultaDocumentos.click();
		return PageFactory.initElements(driver, ConsultaDocumentos.class);
	}
}
