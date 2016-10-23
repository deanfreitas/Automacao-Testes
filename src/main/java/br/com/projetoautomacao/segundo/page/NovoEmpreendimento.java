package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.projetoautomacao.utils.Utils;

public class NovoEmpreendimento {

	final WebDriver driver;

	@FindBy(id = "selCanal")
	private WebElement canal;

	@FindBy(id = "btBtPsqFornecPorNome")
	private WebElement pesquisar;

	@FindBy(id = "nomeFornecedor")
	private WebElement nome;

	@FindBy(id = "btAplicar")
	private WebElement aplicar;

	@FindBy(css = "#btConfirmarPesquisa > tbody > tr > td > div.botaoRodape")
	private WebElement confirmar;

	@FindBy(id = "rbSelFornecedor")
	private WebElement radioFornecedor;

	@FindBy(id = "selRegiao")
	private WebElement regiao;

	@FindBy(id = "selRegional")
	private WebElement regional;

	@FindBy(id = "selPontoVenda")
	private WebElement pontoVenda;

	@FindBy(css = "table.botaoRodapeBordaRight.bt_continuar > tbody > tr > td > div.botaoRodape")
	private WebElement continuar;

	@FindBy(id = "fbCloseButton")
	private WebElement cancelar;

	@FindBy(id = "selProduto")
	private WebElement produto;

	public NovoEmpreendimento(WebDriver driver) {
		this.driver = driver;
	}

	public void selecionarCanal(String canal) {
		new Select(this.canal).selectByVisibleText(canal);
	}

	public void selecionarRegiao(String regiao) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.regiao, regiao);
	}

	public void selecionarRegional(String regional) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.regional, regional);
	}

	public void selecionarPontoVenda(String pontoVenda) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.pontoVenda,
				pontoVenda);
	}

	public void selecionarProduto(String produto) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.produto, produto);
	}

	public void clicarPesquisar() {
		pesquisar.click();
	}

	public void entrarNome(String nome) {
		this.nome.clear();
		this.nome.sendKeys(nome);
	}

	public void clicarAplicar() {
		aplicar.click();
	}

	public void clicarConfimar() {
		confirmar.click();
	}

	public CriarEmpreendimento clicarContinuar() {
		continuar.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);
	}

	public void clicarRadio() {
		radioFornecedor.click();
	}

}
