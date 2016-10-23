package br.com.projetoautomacao.segundo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroEmpreendimentoMcmvFaixaI {
	
	final WebDriver driver;
	
	@FindBy(css = "#bt_abrirFaseManualmente > div.btVerdeResumo.bt_quadro_valores > div.texto_transparente")
	private WebElement reabrirFase;
	
	@FindBy(css = "table.botaoRodapeBordaLeft.bt_voltar > tbody > tr > td > div.botaoRodape")
	private WebElement retornar;
	
	@FindBy(css = "#bt_fecharFaseManualmente > div.btVerdeResumo.bt_quadro_valores > div.texto_transparente")
	private WebElement encerrarFase;
	
	public CadastroEmpreendimentoMcmvFaixaI(WebDriver driver) {
		this.driver = driver;
	}

	public void clickReabrirFase() {
		reabrirFase.click();
	}
	
	public SituacaoProposta clickRetornar() {
		retornar.click();
		return PageFactory.initElements(driver, SituacaoProposta.class);
	}
	
	public void clickEncerrarFase() {
		encerrarFase.click();
	}
}
