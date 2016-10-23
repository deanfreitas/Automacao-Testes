package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bloco {

	final WebDriver driver;

	@FindBy(css = "#btAdicionarEdificio > table.botaoRodapeBordaLeft.bt_ad_novo_bloco > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarNovoBloco;

	@FindBy(css = "html body#fullSCREEN form div.Section_800 table.MainFrame_800 tbody tr td div div table tbody tr td a#btRetornar table.botaoRodapeBordaLeft.bt_ad_novo_bloco tbody tr td div.botaoRodape")
	private WebElement retornar;

	public Bloco(WebDriver driver) {
		this.driver = driver;
	}

	public AdicionarNovoBloco clickAdicionarNovoBloco() {
		adicionarNovoBloco.click();
		return PageFactory.initElements(driver, AdicionarNovoBloco.class);
	}

	public CriarEmpreendimento clickRetornar() {
		retornar.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);
	}
}
