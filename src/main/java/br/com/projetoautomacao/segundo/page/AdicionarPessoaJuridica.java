package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdicionarPessoaJuridica {
	
	final WebDriver driver;
	
	@FindBy(id = "btBtPesquisaPJ")
	private WebElement pesquisarPessoaJuridica;
	
	@FindBy(id = "nomeFornecedor")
	private WebElement pesquisarNomePessoaJuridica;
	
	@FindBy(id = "btAplicar")
	private WebElement aplicarPesquisaPessoaJuridica;
	
	@FindBy(id = "rbSelPJ")
	private WebElement radioPessoaJuridica;
	
	@FindBy(css = "#btConfirmarPesquisa > tbody > tr > td > div.botaoRodape")
	private WebElement confirmarPessoaJuridica;
	
	@FindBy(name = "rbAtividadeEconomica")
	private WebElement atividadeEconomica;
	
	@FindBy(id = "construtor")
	private WebElement construtor;
	
	@FindBy(css = "#btContinuar > table.botaoRodapeBordaRight.bt_confirmar > tbody > tr > td > div.botaoRodape")
	private WebElement confimarAdicionarPessoaJuridica;
	
	public AdicionarPessoaJuridica(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickPesquisarPessoaJuridica() {
		pesquisarPessoaJuridica.click();
	}
	
	public void entrarPesquisarNomePessoaJuridica(String pesquisarNomePessoaJuridica) {
		this.pesquisarNomePessoaJuridica.clear();
		this.pesquisarNomePessoaJuridica.sendKeys(pesquisarNomePessoaJuridica);
	}
	
	public void clickAplicarPesquisaPessoaJuridica() {
		aplicarPesquisaPessoaJuridica.click();
	}
	
	public void clickRadioPessoaJuridica() {
		radioPessoaJuridica.click();
	}
	
	public void clickConfirmarPessoaJuridica() {
		confirmarPessoaJuridica.click();
	}
	
	public void clickAtividadeEconomica() {
		atividadeEconomica.click();
	}
	
	public void clickConstrutor() {
		construtor.click();
	}
	
	public CriarEmpreendimento clickConfimarAdicionarPessoaJuridica() {
		confimarAdicionarPessoaJuridica.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);
	}
}
