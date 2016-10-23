package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.projetoautomacao.utils.Utils;

public class AdicionarContrapartida {

	final WebDriver driver;

	@FindBy(css = "#divBotaoRetornar > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarNovaContrapartida;

	@FindBy(name = "id_tipo_contrapar")
	private WebElement tipoContrapartida;

	@FindBy(name = "id_subtipo_contra")
	private WebElement subTipoContrapartida;

	@FindBy(name = "id_orig_contrapar")
	private WebElement origemContrapartida;

	@FindBy(css = "div.iconeVisualizar")
	private WebElement buscarIntervenienteContrapartida;

	@FindBy(id = "cnpjInterveniente")
	private WebElement cnpjIntervenienteContrapartida;

	@FindBy(id = "nomeInterveniente")
	private WebElement razaoSocialContrapartida;

	@FindBy(css = "#btAplicar > div.botaoRodape")
	private WebElement buscarContrapartida;

	@FindBy(name = "radioMci")
	private WebElement radioContrapartida;

	@FindBy(xpath = "//a[@id='btConsultarContas']/div")
	private WebElement consultarContaContrapartida;

	@FindBy(id = "rdCont")
	private WebElement radioContaContrapartida;

	@FindBy(id = "confirmarBuscaIntervientente")
	private WebElement confirmarBuscaContrapatida;

	@FindBy(name = "nm_identificador")
	private WebElement nomeIdentificadorContrapatida;

	@FindBy(name = "vl_contrapar")
	private WebElement valorContrapatida;

	@FindBy(name = "fg_exig_caucao")
	private WebElement exigCaucaoContrapatida;

	@FindBy(name = "vl_caucao")
	private WebElement caucaoContrapatida;

	@FindBy(name = "dt_inicio")
	private WebElement dataInicioContrapatida;

	@FindBy(name = "dt_fim")
	private WebElement dataFimContrapatida;

	@FindBy(css = "div[name='btDescContra']")
	private WebElement descricaoContrapatida;

	@FindBy(id = "descricao_contrapartida")
	private WebElement descricaoTextoContrapatida;

	@FindBy(id = "btConfirmarDescr")
	private WebElement confirmarDescricaoContrapatida;

	@FindBy(css = "table.botaoRodapeBordaRight.bt_confirmar > tbody > tr > td > div.botaoRodape")
	private WebElement confirmarContrapatida;

	public AdicionarContrapartida(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAdicionarNovaContrapartida() {
		adicionarNovaContrapartida.click();
	}

	public void selecionarTipoContrapartida(String tipoContrapartida) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.tipoContrapartida,
				tipoContrapartida);
	}

	public void selecionarSubTipoContrapartida(String subTipoContrapartida) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.subTipoContrapartida, subTipoContrapartida);
	}

	public void selecionarOrigemContrapartida(String origemContrapartida) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.origemContrapartida,
				origemContrapartida);
	}

	public void clickBuscarIntervenienteContrapartida() {
		buscarIntervenienteContrapartida.click();
	}

	public void entrarCnpjIntervenienteContrapartida(
			String cnpjIntervenienteContrapartida) {
		this.cnpjIntervenienteContrapartida.clear();
		this.cnpjIntervenienteContrapartida
				.sendKeys(cnpjIntervenienteContrapartida);
	}

	public void entrarRazaoSocialContrapartida(String razaoSocialContrapartida) {
		this.razaoSocialContrapartida.clear();
		this.razaoSocialContrapartida.sendKeys(razaoSocialContrapartida);
	}

	public void clickBuscarContrapartida() {
		buscarContrapartida.click();
	}

	public void clickRadioContrapartida() {
		radioContrapartida.click();
	}

	public void clickConsultarContaContrapartida() {
		consultarContaContrapartida.click();
	}

	public void clickRadioContaContrapartida() {
		radioContaContrapartida.click();
	}

	public void clickConfirmarBuscaContrapatida() {
		confirmarBuscaContrapatida.click();
	}

	public void entrarNomeIdentificadorContrapatida(
			String nomeIdentificadorContrapatida) {
		this.nomeIdentificadorContrapatida.clear();
		this.nomeIdentificadorContrapatida
				.sendKeys(nomeIdentificadorContrapatida);
	}

	public void entrarValorContrapatida(String valorContrapatida) {
		this.valorContrapatida.clear();
		this.valorContrapatida.sendKeys(valorContrapatida);
	}

	public void selecionarExigCaucaoContrapatida(String exigCaucaoContrapatida) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.exigCaucaoContrapatida, exigCaucaoContrapatida);
	}

	public void entrarCaucaoContrapatida(String caucaoContrapatida) {
		this.caucaoContrapatida.clear();
		this.caucaoContrapatida.sendKeys(caucaoContrapatida);
	}

	public void entrarDataInicioContrapatida(String dataInicioContrapatida) {
		this.dataInicioContrapatida.clear();
		this.dataInicioContrapatida.sendKeys(dataInicioContrapatida);
	}

	public void entrarDataFimContrapatida(String dataFimContrapatida) {
		this.dataFimContrapatida.clear();
		this.dataFimContrapatida.sendKeys(dataFimContrapatida);
	}

	public void clickDescricaoContrapatida() {
		descricaoContrapatida.click();
	}

	public void entrarDescricaoTextoContrapatida(
			String descricaoTextoContrapatida) {
		this.descricaoTextoContrapatida.clear();
		this.descricaoTextoContrapatida.sendKeys(descricaoTextoContrapatida);
	}

	public void clickConfirmarDescricaoContrapatida() {
		confirmarDescricaoContrapatida.click();
	}

	public CriarEmpreendimento clickConfirmarContrapatida() {
		confirmarContrapatida.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);
	}

}
