package br.com.projetoautomacao.primeiro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	final WebDriver driver;

	@FindBy(css = "div.botoesMenuImagemCentralDoc")
	private WebElement centralDocumentos;
	
	@FindBy(css = "div.botoesMenuImagemBackOffice")
	private WebElement backoffice;

	public Home(WebDriver driver) {
		this.driver = driver;
		driver.switchTo().frame("appFrame");
	}

	public EntrarCentralDocumentos clicarCentralDocumentos() {
		centralDocumentos.click();
		return PageFactory.initElements(driver, EntrarCentralDocumentos.class);
	}
	
	public Backoffice clicarBackoffice() {
		backoffice.click();
		return PageFactory.initElements(driver, Backoffice.class);
	}
}
