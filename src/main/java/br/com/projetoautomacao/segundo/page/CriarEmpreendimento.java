package br.com.projetoautomacao.segundo.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.projetoautomacao.utils.Utils;

public class CriarEmpreendimento {

	final WebDriver driver;

	@FindBy(name = "id_proposta")
	private WebElement proposta;

	@FindBy(id = "nomeEmpreendimento")
	private WebElement nomeEmpreendimento;

	@FindBy(id = "id_tipo_empreend")
	private WebElement tipoEmpreendimento;

	@FindBy(id = "usoImovel")
	private WebElement usoImovel;

	@FindBy(id = "tp_uso_pred_imovel")
	private WebElement usoPredominanteImóvel;

	@FindBy(id = "id_tp_parc_solo")
	private WebElement tipoParcelamentoSolo;

	@FindBy(id = "dataInicioObra")
	private WebElement dataInicioObra;

	@FindBy(id = "dataTerminoObra")
	private WebElement dataTerminoObra;

	@FindBy(id = "diaLiberacao")
	private WebElement diaLiberacao;

	@FindBy(css = "#btBuscarTerreno > div.botaoRodape")
	private WebElement buscarTerreno;

	@FindBy(id = "txtCodigoBem")
	private WebElement codigoBem;

	@FindBy(xpath = "//td[10]/table/tbody/tr/td/a/div")
	private WebElement buscarTerr;

	@FindBy(name = "radioTerreno")
	private WebElement radioTerreno;

	@FindBy(css = "#btConfirmarPopupBuscarTerreno > div.botaoRodape")
	private WebElement confirmarTerreno;

	@FindBy(id = "tipoSituacaoTerreno")
	private WebElement situacaoTerreno;

	@FindBy(id = "idSitEmerPubl")
	private WebElement naturezaEmpreendimento;

	@FindBy(id = "tp_ins_municipio")
	private WebElement tipoInserçãoMunicípio;

	@FindBy(id = "latitude")
	private WebElement latitude;

	@FindBy(id = "longitude")
	private WebElement longitude;

	@FindBy(id = "numeroIptu")
	private WebElement numeroIptu;

	@FindBy(id = "cartorioComboID")
	private WebElement codigo;

	@FindBy(id = "ds_enq_plano_empr")
	private WebElement enquadPlanoEmpresário;

	@FindBy(css = "#btTipificacaoBloco > table.botaoRodapeBordaLeft.bt_ad_novo_bloco > tbody > tr > td > div.botaoRodape")
	private WebElement bloco;

	@FindBy(id = "tipoSistemaConstrutivo")
	private WebElement sistemaConstrutivo;

	@FindBy(id = "pc_bdi_solicitado")
	private WebElement bDIConstrutor;

	@FindBy(css = "table.botaoRodapeBordaLeft.bt_credito > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarContrapartida;

	@FindBy(css = "#btAdicionarDespesa > table.botaoRodapeBordaLeft.bt_credito > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarDespesasDiversas;

	@FindBy(css = "td.tds > input[type='text']")
	private List<WebElement> itemDespesasDiversas;

	@FindBy(css = "input[name='vl_desp']")
	private List<WebElement> valorDespesasDiversas;

	@FindBy(css = "table.botaoRodapeBordaLeft.bt_empreendimento > tbody > tr > td > div.botaoRodape")
	private WebElement cronograma;

	@FindBy(id = "idTributario")
	private WebElement regimeTributario;

	@FindBy(id = "idSegregacao")
	private WebElement tipoSegregacao;

	@FindBy(css = "table.botaoRodapeBordaLeft.bt_ad_pessoa_juridica > tbody > tr > td > div.botaoRodape")
	private WebElement adicionarPessoaJuridica;

	@FindBy(css = "table.botaoRodapeBordaRight.bt_enviar_proposta > tbody > tr > td > div.botaoRodape")
	private WebElement enviarProposta;

	@FindBy(css = "input.alinhaDireita")
	private WebElement numeroCim;
	
	@FindBy(css = "table.botaoRodapeBordaRight.bt_guardar > tbody > tr > td > div.botaoRodape")
	private WebElement guardarProposta;

	public CriarEmpreendimento(WebDriver driver) {
		this.driver = driver;
	}

	public String getProposta() {
		return proposta.getText();
	}

	public void entrarNomeEmpreendimento(String nomeEmpreendimento) {
		this.nomeEmpreendimento.clear();
		this.nomeEmpreendimento.sendKeys(nomeEmpreendimento);
	}

	public void selecionarTipoEmpreendimento(String tipoEmpreendimento) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.tipoEmpreendimento,
				tipoEmpreendimento);
	}

	public void selecionarUsoImovel(String usoImovel) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.usoImovel, usoImovel);
	}

	public void selecionarUsoPredominanteImóvel(String usoPredominanteImóvel) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.usoPredominanteImóvel, usoPredominanteImóvel);
	}

	public void selecionarTipoParcelamentoSolo(String tipoParcelamentoSolo) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.tipoParcelamentoSolo, tipoParcelamentoSolo);
	}

	public void entrarDataInicioObra(String dataInicioObra) {
		this.dataInicioObra.clear();
		this.dataInicioObra.sendKeys(dataInicioObra);
	}

	public void entrarDataTerminoObra(String dataTerminoObra) {
		this.dataTerminoObra.clear();
		this.dataTerminoObra.sendKeys(dataTerminoObra);
	}

	public void entrarDiaLiberacao(String diaLiberacao) {
		this.diaLiberacao.clear();
		this.diaLiberacao.sendKeys(diaLiberacao);
	}

	public void clickBuscarTerreno() {
		buscarTerreno.click();
	}

	public void entrarCodigoBem(String codigoBem) {
		this.codigoBem.clear();
		this.codigoBem.sendKeys(codigoBem);
	}

	public void clickBuscarTerr() {
		buscarTerr.click();
	}

	public void clickRadioTerreno() {
		radioTerreno.click();
	}

	public void clickConfirmarTerreno() {
		confirmarTerreno.click();
	}

	public void selecionarSituacaoTerreno(String situacaoTerreno) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.situacaoTerreno,
				situacaoTerreno);
	}

	public void selecionarNaturezaEmpreendimento(String naturezaEmpreendimento) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.naturezaEmpreendimento, naturezaEmpreendimento);

	}

	public void selecionarTipoInserçãoMunicípio(String tipoInserçãoMunicípio) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.tipoInserçãoMunicípio, tipoInserçãoMunicípio);
	}

	public void entrarLatitude(String latitude) {
		this.latitude.clear();
		this.latitude.sendKeys(latitude);
	}

	public void entrarLongitude(String longitude) {
		this.longitude.clear();
		this.longitude.sendKeys(longitude);
	}

	public void entrarNumeroIptu(String numeroIptu) {
		this.numeroIptu.clear();
		this.numeroIptu.sendKeys(numeroIptu);
	}

	public void entrarCodigo(String codigo) {
		this.codigo.clear();
		this.codigo.sendKeys(codigo);
	}

	public void selecionarEnquadPlanoEmpresário(String enquadPlanoEmpresário) {
		Utils.selectMenuItemEqualsIgnoresCase(driver,
				this.enquadPlanoEmpresário, enquadPlanoEmpresário);
	}

	public Bloco clickBloco() {
		bloco.click();
		return PageFactory.initElements(driver, Bloco.class);
	}

	public void selecionarSistemaConstrutivo(String sistemaConstrutivo) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.sistemaConstrutivo,
				sistemaConstrutivo);
	}

	public void entrarBDIConstrutor(String bDIConstrutor) {
		this.bDIConstrutor.clear();
		this.bDIConstrutor.sendKeys(bDIConstrutor);
	}

	public AdicionarContrapartida clickAdicionarContrapartida() {
		adicionarContrapartida.click();
		return PageFactory.initElements(driver, AdicionarContrapartida.class);
	}

	public void clickAdicionarDespesasDiversas() {
		adicionarDespesasDiversas.click();
	}

	public void entrarItemDespesasDiversas(List<String> itemDespesasDiversas) {
		int i = 0;
		for (String itemDespesasDiversas1 : itemDespesasDiversas) {
			this.itemDespesasDiversas.get(i).clear();
			this.itemDespesasDiversas.get(i).sendKeys(itemDespesasDiversas1);
			i++;
		}
	}

	public void entrarValorDespesasDiversas(List<String> valorDespesasDiversas) {
		int i = 0;
		for (String valorDespesasDiversas1 : valorDespesasDiversas) {
			this.valorDespesasDiversas.get(i).clear();
			this.valorDespesasDiversas.get(i).sendKeys(valorDespesasDiversas1);
			i++;
		}
	}

	public Cronograma clickCronograma() {
		cronograma.click();
		return PageFactory.initElements(driver, Cronograma.class);
	}

	public void selecionarRegimeTributario(String regimeTributario) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.regimeTributario,
				regimeTributario);
	}

	public void selecionarTipoSegregacao(String tipoSegregacao) {
		Utils.selectMenuItemEqualsIgnoresCase(driver, this.tipoSegregacao,
				tipoSegregacao);
	}

	public AdicionarPessoaJuridica clickAdicionarPessoaJuridica() {
		adicionarPessoaJuridica.click();
		return PageFactory.initElements(driver, AdicionarPessoaJuridica.class);
	}

	public Empreendimento clickEnviarProposta() {
		enviarProposta.click();
		return PageFactory.initElements(driver, Empreendimento.class);
	}

	public void entrarNumeroCim(String numeroCim) {
		this.numeroCim.clear();
		this.numeroCim.sendKeys(numeroCim);
	}
	
	public SituacaoProposta clickGuardarProposta() {
		guardarProposta.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}
}
