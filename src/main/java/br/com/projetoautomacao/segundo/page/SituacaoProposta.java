package br.com.projetoautomacao.segundo.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SituacaoProposta {

	final WebDriver driver;

	@FindBy(id = "etapaFinanciamento")
	private WebElement validacaoOrcamentoCronograma;

	@FindBy(id = "etapaFinanciamento")
	private WebElement assinaturaContratoConstrutora;

	@FindBy(id = "etapaFinanciamento")
	private WebElement registroContratoConstrutora;

	@FindBy(name = "acessodetalheFase")
	private WebElement dFCadastroEmpreendimento;

	@FindBy(xpath = "/html/body/form/div/table/tbody/tr/td/div[6]/fieldset[2]/table/tbody/tr/td[3]/div/table")
	private WebElement tabelaProposta;

	@FindBy(id = "etapaFinanciamento")
	private WebElement cadastroEmpreendimento;

	public SituacaoProposta(WebDriver driver) {
		this.driver = driver;
	}

	public ValidacaoOrcamentoCronograma clickValidacaoOrcamentoCronograma() {
		validacaoOrcamentoCronograma.click();
		return PageFactory.initElements(driver,
				ValidacaoOrcamentoCronograma.class);
	}

	public AssinaturaContratoConstrutora clickAssinaturaContratoConstrutora() {
		assinaturaContratoConstrutora.click();
		return PageFactory.initElements(driver,
				AssinaturaContratoConstrutora.class);
	}

	public RegistroContratoConstrutora clickRegistroContratoConstrutora() {
		registroContratoConstrutora.click();
		return PageFactory.initElements(driver,
				RegistroContratoConstrutora.class);
	}

	public CadastroEmpreendimentoMcmvFaixaI clickDFCadastroEmpreendimento() {
		dFCadastroEmpreendimento.click();
		return PageFactory.initElements(driver,
				CadastroEmpreendimentoMcmvFaixaI.class);
	}

	public CriarEmpreendimento clickCadastroEmpreendimento() {
		cadastroEmpreendimento.click();
		return PageFactory.initElements(driver, CriarEmpreendimento.class);

	}

	public CadastroEmpreendimentoMcmvFaixaI acessarDetalheFase(String nomeFase) {
		List<WebElement> linhasTabela = tabelaProposta.findElements(By
				.xpath("tbody"));

		for (WebElement linhasTabela1 : linhasTabela) {
			List<WebElement> colunasTabela = linhasTabela1.findElements(By
					.xpath("tr/td"));

			String nome = colunasTabela.get(2).getText();
			if (nome.trim().equalsIgnoreCase(nomeFase.trim())) {
				colunasTabela.get(6).findElement(By.xpath("div/div")).click();
				break;
			}
		}
		return PageFactory.initElements(driver,
				CadastroEmpreendimentoMcmvFaixaI.class);
	}
}
