package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	final WebDriver driver;

	@FindBy(css = "#btEmpreendimento > div > div.botoesMenu > div.botoesMenuBordaInterna > div.botoesMenuBoxDegrade")
	private WebElement botaoEmpremdimento;

	public Home(WebDriver driver) {
		this.driver = driver;
		driver.switchTo().frame("appFrame");
	}

	public Empreendimento clicarEmpreendimento() {
		botaoEmpremdimento.click();
		return PageFactory.initElements(driver, Empreendimento.class);
	}

}
