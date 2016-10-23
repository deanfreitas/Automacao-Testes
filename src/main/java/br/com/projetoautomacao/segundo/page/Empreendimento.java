package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Empreendimento {

	final WebDriver driver;

	@FindBy(css = "div.botoesMenuImagemNovoEmpreendimento")
	private WebElement botaoNovoEmpreendimeto;
	
	@FindBy(css = "#btEmpreendimentoAprovacao > div > div.botoesMenu > div.botoesMenuBordaInterna > div.botoesMenuBoxDegrade")
	private WebElement botaoEmpreendimentoAprovacao;

	public Empreendimento(WebDriver driver) {
		this.driver = driver;
	}

	public NovoEmpreendimento clicarNovoEmpreendimento() {
		botaoNovoEmpreendimeto.click();
		return PageFactory.initElements(driver, NovoEmpreendimento.class);
	}
	
	public EmpreendimentoAprovacao clicarEmpreendimentoAprovacao() {
		botaoEmpreendimentoAprovacao.click();
		return PageFactory.initElements(driver, EmpreendimentoAprovacao.class);
	}
}
