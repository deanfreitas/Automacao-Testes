package br.com.projetoautomacao.primeiro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Backoffice {
	
	final WebDriver driver;
	
	@FindBy(css = "div.botoesMenuImagemParametrosGerais")
	private WebElement parametrosGerais;
	
	public Backoffice(WebDriver driver) {
		this.driver = driver;
	}

	public ParametrosGerais clicarParametrosGerais() {
		parametrosGerais.click();
		return PageFactory.initElements(driver, ParametrosGerais.class);
	}
}
