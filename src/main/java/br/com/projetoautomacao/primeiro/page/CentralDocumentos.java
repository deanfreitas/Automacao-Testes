package br.com.projetoautomacao.primeiro.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralDocumentos {

	final WebDriver driver;

	@FindBy(css = "div[name='divAbrirDoc']")
	private WebElement participante;

	@FindBy(xpath = "(//table[@id='existeComprador']/tbody/tr/td/div/table/tbody/tr/td/strong)[2]")
	private WebElement participante1;

	@FindBy(css = "div[name='divAbrirDoc'] > strong")
	private WebElement imovel;

	@FindBy(xpath = "/html/body/form/div/table/tbody/tr/td/fieldset[3]/div/div/div[2]/table/tbody[2]")
	private WebElement dadosParticipantes;

	public CentralDocumentos(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarParticipante() {
		participante.click();
	}

	public void clicarDadosParticipante() {
		List<WebElement> linhasTabelas = dadosParticipantes.findElements(By
				.xpath("tr"));

		List<String> camposVerdes = new ArrayList<String>();
		List<String> camposVermelhos = new ArrayList<String>();
		List<String> camposBarra = new ArrayList<String>();

		for (WebElement linhasTabelas1 : linhasTabelas) {
			List<WebElement> colunasTabelas = linhasTabelas1.findElements(By
					.xpath("td"));
			for (WebElement colunasTabelas1 : colunasTabelas) {

				String campos = colunasTabelas1.getAttribute("class");

				if (campos.equals("situacao_analise_fase_verde")) {
					camposVerdes.add(colunasTabelas.get(1).getText());
				}

				else if (campos.equals("situacao_analise_fase_vermelho")) {
					camposVermelhos.add(colunasTabelas.get(1).getText());
				}

				else if (campos.equals("situacao_analise_fase")) {
					camposBarra.add(colunasTabelas.get(1).getText());
				}
			}
		}

		System.out.println(camposVerdes);
		System.out.println();
		System.out.println(camposVermelhos);
		System.out.println();
		System.out.println(camposBarra);
	}
}
