package br.com.projetoautomacao.segundo.page;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.projetoautomacao.utils.FirefoxUtils;
import br.com.projetoautomacao.utils.Utils;

public class ExecutarAutomacao {

	// Login
	public static String user = "";
	public static String pass = "";
	public static String baseurl = "";

	// Novo Empreendimento
	public static String nome = "PREFEITURA DO MUNICIPIO DE AQUIRAZ";
	public static String regiao = "diretoria de distribuicao sao paulo - disap";
	public static String regional = "superintendencia varejo e governo são paulo norte";
	public static String pontoVenda = "9 DE JULHO-OLIMPIA,SP";
	public static String produto = "PMCMV FAIXA I FAR TOMBAMENTO";

	// Criar Empreendimento
	public static String proposta = "";
	public static String nomeEmpreendimento = "Teste";
	public static String tipoEmpreendimento = "VERTICAL";
	public static String usoImovel = "RESIDENCIAL";
	public static String usoPredominanteImóvel = "Unifamiliar";
	public static String tipoParcelamentoSolo = "LOTEAMENTO";
	public static String dataInicioObra = "122014";
	public static String dataTerminoObra = "052015";
	public static String diaLiberacao = "20";
	public static String codigoBem = "500034148";
	public static String situacaoTerreno = "Doado";
	public static String naturezaEmpreendimento = "PRODUCAO";
	public static String tipoInserçãoMunicípio = "MALHA URBANA";
	public static String latitude = "-12,238938";
	public static String longitude = "29,239838";
	public static String numeroIptu = "127398173";
	public static String codigo = "900";
	public static String enquadPlanoEmpresário = "MCMV I";
	public static String sistemaConstrutivo = "Convencional";
	public static String bDIConstrutor = "10";
	public static List<String> itemDespesasDiversas = new ArrayList<String>();
	public static List<String> valorDespesasDiversas = new ArrayList<String>();
	public static String regimeTributario = "REGIME NORMAL DE TRIBUTAÇÃO";
	public static String tipoSegregacao = "SEM PATRIMÔNIO DE AFETAÇÃO";
	public static String numeroCim = "145217";

	// Adicionar Novo Bloco
	public static String numeroEdificio = "1";
	public static String nomeEdificio = "Bloco A";
	public static String tipoEmpreendimentoNovobloco = "VERTICAL";
	public static String qtdPavimentos = "10";
	public static String quantidadeElevadores = "2";
	public static String qtdAndares = "10";
	public static String quantidadeUnidades = "20";
	public static String valorConstrutor = "120000";
	public static String areaTotal = "60";
	public static String areaPrivativa = "60";
	public static String qtdormitorio = "2";
	public static String numeroVagas = "1";
	public static String usoUnidade = "RESIDENCIAL";
	public static String tipoUnid = "APARTAMENTO";
	public static String descricaoUnidade = "Teste";
	public static List<String> numeroUnidade = new ArrayList<String>();

	// Adicionar Contrapartida
	public static String tipoContrapartida = "INFRAESTRUTURA";
	public static String subTipoContrapartida = "EQUIPAMENTO DE SEGURANCA";
	public static String origemContrapartida = "GOVERNO FEDERAL";
	public static String cnpjIntervenienteContrapartida = "09588906000143";
	public static String razaoSocialContrapartida = "CONSTRUTORA SUCESSO S A";
	public static String nomeIdentificadorContrapatida = "TESTE CONTRAPARTIDA";
	public static String valorContrapatida = "1000000";
	public static String exigCaucaoContrapatida = "Sim";
	public static String caucaoContrapatida = "1200000";
	public static String dataInicioContrapatida = "0101";
	public static String dataFimContrapatida = "3112";
	public static String descricaoTextoContrapatida = "teste";
	public static String exigCaucaoContrapatida1 = "Não";

	// OrcamentoCronograma
	public static String quantidadeEscavacaoManual = "1";
	public static String valorEscavacaoManual = "7200000";
	public static List<String> escavacaoManual = new ArrayList<String>();

	// Utils
	public static String exigCaucaoContrapatidaAlertMessage = "Para o(s) caso(s) em que há obrigatoriedade de Caução a Conta do Interveniente será desconsiderada.Deseja continuar?";
	public static String enviarPropostaAlertMessage = "Confirma o envio da Proposta?";
	public static String reabrirFaseAlertMessage = "A reabertura manual de uma Fase pode impactar o Fluxo. Deseja prosseguir? Esta operação será logada.";
	public static String reabrirFaseAlertMessage1 = "Fase aberta com sucesso.";
	public static String encerrarFaseAlertMessage = "Deseja prosseguir? Esta operação será logada.";
	public static String encerrarFaseAlertMessage1 = "Fase encerrada com sucesso.";

	// Adicionar Pessoa Juridica
	public static String pesquisarNomePessoaJuridica = "brook";

	// Vistoria
	public static String dataVistoria = "13112014";
	public static String engenheiroVistoria = "joao pereira";
	public static String numeroCrea = "12387398";

	// Medição Obra
	public static String medicaoAtual = "70";

	// Registro Contrato Construtora
	public static String dataAssinatura = "01052015";
	public static String dataRegistro = "01052015";
	public static String dataPrevistaEstorno = "01052015";
	
	// Situação proposta
	public static String nomeFase = "CADASTRO DO EMPREENDIMENTO MCMV FAIXA I";

	@Test
	public void gerarProposta() throws Exception {

		WebDriver driver = FirefoxUtils.setUp();
		Login login;
		Home home;
		Empreendimento empreendimento;
		NovoEmpreendimento novoEmpreendimento;
		CriarEmpreendimento criarEmpreendimento;
		Bloco bloco;
		AdicionarNovoBloco adicionarNovoBloco;
		AdicionarContrapartida adicionarContrapartida;
		Cronograma cronograma;
		OrcamentoCronograma orcamentoCronograma;
		AdicionarPessoaJuridica adicionarPessoaJuridica;
		EmpreendimentoAprovacao empreendimentoAprovacao;
		SituacaoProposta situacaoProposta;
		ValidacaoOrcamentoCronograma validacaoOrcamentoCronograma;
		Vistoria vistoria;
		MedicaoObra medicaoObra;
		AssinaturaContratoConstrutora assinaturaContratoConstrutora;
		RegistroContratoConstrutora registroContratoConstrutora;
		CadastroEmpreendimentoMcmvFaixaI cadastroEmpreendimentoMcmvFaixaI;

		driver.get(baseurl);
		login = PageFactory.initElements(driver, Login.class);
		home = login.loginHome(user, pass);
		empreendimento = home.clicarEmpreendimento();
		novoEmpreendimento = empreendimento.clicarNovoEmpreendimento();

		novoEmpreendimento.clicarPesquisar();
		novoEmpreendimento.entrarNome(nome);
		novoEmpreendimento.clicarAplicar();
		novoEmpreendimento.clicarRadio();
		novoEmpreendimento.clicarConfimar();
		novoEmpreendimento.selecionarRegiao(regiao);
		novoEmpreendimento.selecionarRegional(regional);
		novoEmpreendimento.selecionarPontoVenda(pontoVenda);
		novoEmpreendimento.selecionarProduto(produto);
		criarEmpreendimento = novoEmpreendimento.clicarContinuar();

		proposta = criarEmpreendimento.getProposta();
		System.out.println("Número da proposta: " + proposta);
		criarEmpreendimento.entrarNomeEmpreendimento(nomeEmpreendimento);
		criarEmpreendimento.selecionarTipoEmpreendimento(tipoEmpreendimento);
		criarEmpreendimento.selecionarUsoImovel(usoImovel);
		criarEmpreendimento
				.selecionarUsoPredominanteImóvel(usoPredominanteImóvel);
		criarEmpreendimento
				.selecionarTipoParcelamentoSolo(tipoParcelamentoSolo);
		criarEmpreendimento.entrarDataInicioObra(dataInicioObra);
		criarEmpreendimento.entrarDataTerminoObra(dataTerminoObra);
		criarEmpreendimento.entrarDiaLiberacao(diaLiberacao);
		criarEmpreendimento.clickBuscarTerreno();
		criarEmpreendimento.entrarCodigoBem(codigoBem);
		criarEmpreendimento.clickBuscarTerr();
		criarEmpreendimento.clickRadioTerreno();
		criarEmpreendimento.clickConfirmarTerreno();
		criarEmpreendimento.selecionarSituacaoTerreno(situacaoTerreno);
		criarEmpreendimento
				.selecionarNaturezaEmpreendimento(naturezaEmpreendimento);
		criarEmpreendimento
				.selecionarTipoInserçãoMunicípio(tipoInserçãoMunicípio);
		criarEmpreendimento.entrarLatitude(latitude);
		criarEmpreendimento.entrarLongitude(longitude);
		criarEmpreendimento.entrarNumeroIptu(numeroIptu);
		criarEmpreendimento.entrarCodigo(codigo);
		criarEmpreendimento
				.selecionarEnquadPlanoEmpresário(enquadPlanoEmpresário);
		bloco = criarEmpreendimento.clickBloco();

		adicionarNovoBloco = bloco.clickAdicionarNovoBloco();
		adicionarNovoBloco.entrarNumeroEdificio(numeroEdificio);
		adicionarNovoBloco.entrarNomeEdificio(nomeEdificio);
		adicionarNovoBloco
				.selecionarTipoEmpreendimentoNovobloco(tipoEmpreendimentoNovobloco);
		adicionarNovoBloco.entrarQtdPavimentos(qtdPavimentos);
		adicionarNovoBloco.entrarQuantidadeElevadores(quantidadeElevadores);
		adicionarNovoBloco.entrarQtdAndares(qtdAndares);
		adicionarNovoBloco.clickAdicionarNovaCaracteristica();
		adicionarNovoBloco.entrarQuantidadeUnidades(quantidadeUnidades);
		adicionarNovoBloco.entrarValorConstrutor(valorConstrutor);
		adicionarNovoBloco.entrarAreaTotal(areaTotal);
		adicionarNovoBloco.entrarAreaPrivativa(areaPrivativa);
		adicionarNovoBloco.entrarQtdormitorio(qtdormitorio);
		adicionarNovoBloco.entrarNumeroVagas(numeroVagas);
		adicionarNovoBloco.selecionarUsoUnidade(usoUnidade);
		adicionarNovoBloco.selecionarTipoUnid(tipoUnid);
		adicionarNovoBloco.clickBotaoDescricao();
		adicionarNovoBloco.entrarDescricaoUnidade(descricaoUnidade);
		adicionarNovoBloco.clickConfirmarUnidades();
		adicionarNovoBloco.entrarNumeroUnidade();
		bloco = adicionarNovoBloco.clickConfirmar();

		criarEmpreendimento = bloco.clickRetornar();
		criarEmpreendimento.selecionarSistemaConstrutivo(sistemaConstrutivo);
		criarEmpreendimento.entrarBDIConstrutor(bDIConstrutor);
		adicionarContrapartida = criarEmpreendimento
				.clickAdicionarContrapartida();

		adicionarContrapartida.clickAdicionarNovaContrapartida();
		adicionarContrapartida.selecionarTipoContrapartida(tipoContrapartida);
		adicionarContrapartida
				.selecionarSubTipoContrapartida(subTipoContrapartida);
		adicionarContrapartida
				.selecionarOrigemContrapartida(origemContrapartida);
		adicionarContrapartida.clickBuscarIntervenienteContrapartida();
		adicionarContrapartida
				.entrarCnpjIntervenienteContrapartida(cnpjIntervenienteContrapartida);
		adicionarContrapartida
				.entrarRazaoSocialContrapartida(razaoSocialContrapartida);
		adicionarContrapartida.clickBuscarContrapartida();
		adicionarContrapartida.clickRadioContrapartida();
		adicionarContrapartida.clickConsultarContaContrapartida();
		adicionarContrapartida.clickRadioContaContrapartida();
		adicionarContrapartida.clickConfirmarBuscaContrapatida();
		adicionarContrapartida
				.entrarNomeIdentificadorContrapatida(nomeIdentificadorContrapatida);
		adicionarContrapartida.entrarValorContrapatida(valorContrapatida);
		adicionarContrapartida
				.selecionarExigCaucaoContrapatida(exigCaucaoContrapatida);
		Utils.validarAlert(exigCaucaoContrapatidaAlertMessage, driver);
		adicionarContrapartida.entrarCaucaoContrapatida(caucaoContrapatida);
		adicionarContrapartida
				.entrarDataInicioContrapatida(dataInicioContrapatida);
		adicionarContrapartida.entrarDataFimContrapatida(dataFimContrapatida);
		adicionarContrapartida.clickDescricaoContrapatida();
		adicionarContrapartida
				.entrarDescricaoTextoContrapatida(descricaoTextoContrapatida);
		adicionarContrapartida.clickConfirmarDescricaoContrapatida();

		// Mudar campo exigCaucao para "Não"
		adicionarContrapartida
				.selecionarExigCaucaoContrapatida(exigCaucaoContrapatida1);
		criarEmpreendimento = adicionarContrapartida
				.clickConfirmarContrapatida();

		criarEmpreendimento.clickAdicionarDespesasDiversas();
		// acrescentando valores a lista
		itemDespesasDiversas.add(0, "Despesa 1");
		valorDespesasDiversas.add(0, "100000");
		criarEmpreendimento.entrarItemDespesasDiversas(itemDespesasDiversas);
		criarEmpreendimento.entrarValorDespesasDiversas(valorDespesasDiversas);

		// Criar apertar outra vez adicionar despesas diversas
		criarEmpreendimento.clickAdicionarDespesasDiversas();
		// acrescentando valores a lista
		itemDespesasDiversas.add(1, "Despesa 2");
		valorDespesasDiversas.add(1, "120000");
		criarEmpreendimento.entrarItemDespesasDiversas(itemDespesasDiversas);
		criarEmpreendimento.entrarValorDespesasDiversas(valorDespesasDiversas);
		cronograma = criarEmpreendimento.clickCronograma();

		orcamentoCronograma = cronograma.clickOrcamentoCronograma();

		orcamentoCronograma.clickRadioMovimentoTerra();
		orcamentoCronograma
				.entrarQuantidadeEscavacaoManual(quantidadeEscavacaoManual);
		orcamentoCronograma.entrarValorEscavacaoManual(valorEscavacaoManual);
		// acrescentando valores a lista
		escavacaoManual.add(0, "20");
		escavacaoManual.add(1, "40");
		escavacaoManual.add(2, "10");
		escavacaoManual.add(3, "10");
		escavacaoManual.add(4, "10");
		escavacaoManual.add(5, "10");
		orcamentoCronograma.entrarEscavacaoManual(escavacaoManual);
		cronograma = orcamentoCronograma.clickConfirmarOrcamentoCronograma();

		criarEmpreendimento = cronograma.clickConfirmarCronograma();
		criarEmpreendimento.selecionarRegimeTributario(regimeTributario);
		criarEmpreendimento.selecionarTipoSegregacao(tipoSegregacao);
		adicionarPessoaJuridica = criarEmpreendimento
				.clickAdicionarPessoaJuridica();

		adicionarPessoaJuridica.clickPesquisarPessoaJuridica();
		adicionarPessoaJuridica
				.entrarPesquisarNomePessoaJuridica(pesquisarNomePessoaJuridica);
		adicionarPessoaJuridica.clickAplicarPesquisaPessoaJuridica();
		adicionarPessoaJuridica.clickRadioPessoaJuridica();
		adicionarPessoaJuridica.clickConfirmarPessoaJuridica();
		adicionarPessoaJuridica.clickAtividadeEconomica();
		adicionarPessoaJuridica.clickConstrutor();
		criarEmpreendimento = adicionarPessoaJuridica
				.clickConfimarAdicionarPessoaJuridica();

		empreendimento = criarEmpreendimento.clickEnviarProposta();
		Utils.validarAlert(enviarPropostaAlertMessage, driver);

		// pausar a aplicação
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		empreendimentoAprovacao = empreendimento
				.clicarEmpreendimentoAprovacao();
		empreendimentoAprovacao.clickRadioProposta();
		empreendimentoAprovacao.entrarNumeroProposta(proposta);
		situacaoProposta = empreendimentoAprovacao.clickSituacaoProposta();

		validacaoOrcamentoCronograma = situacaoProposta
				.clickValidacaoOrcamentoCronograma();

		vistoria = validacaoOrcamentoCronograma.clickVistoria();
		vistoria.entrarDataVistoria(dataVistoria);
		vistoria.entrarEngenheiroVistoria(engenheiroVistoria);
		vistoria.entrarNumeroCrea(numeroCrea);
		medicaoObra = vistoria.clickBotaoMedicaoObra();

		medicaoObra.clickRadioItensMedicaoObra();
		medicaoObra.entrarMedicaoAtual(medicaoAtual);
		vistoria = medicaoObra.clickBotaoConfirmarMedicaoObra();

		validacaoOrcamentoCronograma = vistoria.clickConfirmarVistoria();

		validacaoOrcamentoCronograma.clickConclusaoTecnica();
		validacaoOrcamentoCronograma.clickAcaoValidacaoOrcamentoCronograma();
		situacaoProposta = validacaoOrcamentoCronograma
				.clickConfimarValidacaoOrcamentoCronograma();

		assinaturaContratoConstrutora = situacaoProposta
				.clickAssinaturaContratoConstrutora();

		assinaturaContratoConstrutora.clickRadioAcao();
		situacaoProposta = assinaturaContratoConstrutora
				.clickConfirmarAssinaturaContratoConstrutora();

		registroContratoConstrutora = situacaoProposta
				.clickRegistroContratoConstrutora();

		registroContratoConstrutora.entrarDataAssinatura(dataAssinatura);
		registroContratoConstrutora.entrarDataRegistro(dataRegistro);
		registroContratoConstrutora
				.entrarDataPrevistaEstorno(dataPrevistaEstorno);
		registroContratoConstrutora.clickRadioAcao();
		situacaoProposta = registroContratoConstrutora
				.clickConfirmarRegistroContratoConstrutora();

		// Situação proposta ==> detalhes da fase
		cadastroEmpreendimentoMcmvFaixaI = situacaoProposta.acessarDetalheFase(nomeFase);
		cadastroEmpreendimentoMcmvFaixaI.clickReabrirFase();
		Utils.validarAlert(reabrirFaseAlertMessage, driver);
		Utils.validarAlert(reabrirFaseAlertMessage1, driver);
		
		situacaoProposta = cadastroEmpreendimentoMcmvFaixaI.clickRetornar();
		
		criarEmpreendimento = situacaoProposta.clickCadastroEmpreendimento();
		criarEmpreendimento.entrarNumeroCim(numeroCim);
		situacaoProposta = criarEmpreendimento.clickGuardarProposta();
		
		cadastroEmpreendimentoMcmvFaixaI = situacaoProposta
				.clickDFCadastroEmpreendimento();
		cadastroEmpreendimentoMcmvFaixaI.clickEncerrarFase();
		Utils.validarAlert(encerrarFaseAlertMessage, driver);
		Utils.validarAlert(encerrarFaseAlertMessage1, driver);
		situacaoProposta = cadastroEmpreendimentoMcmvFaixaI.clickRetornar();
	}
}
