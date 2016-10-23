package br.com.projetoautomacao.segundo.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.projetoautomacao.utils.Utils;

public class AdicionarNovoBloco {

	final WebDriver driver;

	@FindBy(id = "numeroEdificio")
	private WebElement numeroEdificio;

	@FindBy(id = "nomeEdificio")
	private WebElement nomeEdificio;

	@FindBy(id = "tipoEmpreendimento")
	private WebElement tipoEmpreendimentoNovobloco;

	@FindBy(id = "qt_pavimentos")
	private WebElement qtdPavimentos;

	@FindBy(id = "quantidadeElevadores")
	private WebElement quantidadeElevadores;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement qtdAndares;

	@FindBy(css = "table.botaoRodapeBordaLeft.bt_ad_nv_caracteristica > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarNovaCaracteristica;

	@FindBy(name = "quantidadeUnidades")
	private WebElement quantidadeUnidades;

	@FindBy(name = "vl_venda")
	private WebElement valorConstrutor;

	@FindBy(name = "nr_area_total")
	private WebElement areaTotal;

	@FindBy(name = "nr_area_util")
	private WebElement areaPrivativa;

	@FindBy(name = "qt_dormitorio")
	private WebElement qtdormitorio;

	@FindBy(name = "nr_vagas_cobertas")
	private WebElement numeroVagas;

	@FindBy(name = "id_util_imovel")
	private WebElement usoUnidade;

	@FindBy(name = "tp_unidade")
	private WebElement tipoUnid;

	@FindBy(css = "#btDescricaoUnidade > img.button")
	private WebElement botaoDescricao;

	@FindBy(id = "ta_descricao_unidade")
	private WebElement descricaoUnidade;

	@FindBy(css = "#btConfirmarUnidades > div.botaoRodape")
	private WebElement confirmarUnidades;

	@FindAll(value = { @FindBy(id = "numeroUnidade") })
	private List<WebElement> numeroUnidade;

	@FindBy(css = "#botaoConfirmar > table.botaoRodapeBordaRight.bt_confirmar > tbody > tr > td > div.botaoRodape")
	private WebElement confirmar;

	@FindBy(css = "#botaoRetornar > table.botaoRodapeBordaLeft.bt_voltar > tbody > tr > td > div.botaoRodape")
	private WebElement retornar;

	public AdicionarNovoBloco(WebDriver driver) {
		this.driver = driver;
	}

	public void entrarNumeroEdificio(String numeroEdificio) {
		this.numeroEdificio.clear();
		this.numeroEdificio.sendKeys(numeroEdificio);
	}

	public void entrarNomeEdificio(String nomeEdificio) {
		this.nomeEdificio.clear();
		this.nomeEdificio.sendKeys(nomeEdificio);
	}

	public void selecionarTipoEmpreendimentoNovobloco(
			String tipoEmpreendimentoNovobloco) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.tipoEmpreendimentoNovobloco, tipoEmpreendimentoNovobloco);
	}

	public void entrarQtdPavimentos(String qtdPavimentos) {
		this.qtdPavimentos.clear();
		this.qtdPavimentos.sendKeys(qtdPavimentos);
	}

	public void entrarQuantidadeElevadores(String quantidadeElevadores) {
		this.quantidadeElevadores.clear();
		this.quantidadeElevadores.sendKeys(quantidadeElevadores);
	}

	public void entrarQtdAndares(String qtdAndares) {
		this.qtdAndares.clear();
		this.qtdAndares.sendKeys(qtdAndares);
	}

	public void clickAdicionarNovaCaracteristica() {
		adicionarNovaCaracteristica.click();
	}

	public void entrarQuantidadeUnidades(String quantidadeUnidades) {
		this.quantidadeUnidades.clear();
		this.quantidadeUnidades.sendKeys(quantidadeUnidades);
	}

	public void entrarValorConstrutor(String valorConstrutor) {
		this.valorConstrutor.clear();
		this.valorConstrutor.sendKeys(valorConstrutor);
	}

	public void entrarAreaTotal(String areaTotal) {
		this.areaTotal.clear();
		this.areaTotal.sendKeys(areaTotal);
	}

	public void entrarAreaPrivativa(String areaPrivativa) {
		this.areaPrivativa.clear();
		this.areaPrivativa.sendKeys(areaPrivativa);
	}

	public void entrarQtdormitorio(String qtdormitorio) {
		this.qtdormitorio.clear();
		this.qtdormitorio.sendKeys(qtdormitorio);
	}

	public void entrarNumeroVagas(String numeroVagas) {
		this.numeroVagas.clear();
		this.numeroVagas.sendKeys(numeroVagas);
	}

	public void selecionarUsoUnidade(String usoUnidade) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.usoUnidade,
				usoUnidade);
	}

	public void selecionarTipoUnid(String tipoUnid) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.tipoUnid, tipoUnid);
	}

	public void clickBotaoDescricao() {
		botaoDescricao.click();
	}

	public void entrarDescricaoUnidade(String descricaoUnidade) {
		this.descricaoUnidade.clear();
		this.descricaoUnidade.sendKeys(descricaoUnidade);
	}

	public void clickConfirmarUnidades() {
		confirmarUnidades.click();
	}

	public void entrarNumeroUnidade() {
		int quantidadeUnidades1 = Integer
				.parseInt(quantidadeUnidades.getAttribute("value"));
		
		for (int i = 1; i <= quantidadeUnidades1; i++) {
			String num = Integer.toString(i);
			this.numeroUnidade.get(i - 1).clear();
			this.numeroUnidade.get(i - 1).sendKeys(num);

		}
	}

	public Bloco clickConfirmar() {
		confirmar.click();
		return PageFactory.initElements(driver, Bloco.class);
	}
}
