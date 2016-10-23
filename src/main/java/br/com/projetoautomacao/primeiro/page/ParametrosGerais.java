package br.com.projetoautomacao.primeiro.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ParametrosGerais {

	final WebDriver driver;

	private Actions builder;

	@FindBy(id = "dm0m0i4tdT")
	private WebElement cadastros;

	@FindBy(id = "dm0m1i0tdT")
	private WebElement cadastro;

	@FindBy(id = "dm0m2i44tdT")
	private WebElement evolucaoPadrao;

	@FindBy(id = "dm0m2i58tdT")
	private WebElement regiaoDesconto;

	@FindBy(id = "dm0m0i20tdT")
	private WebElement relatorios;

	@FindBy(id = "dm0m112i16tdT")
	private WebElement gerencial;

	@FindBy(id = "dm0m121i38tdT")
	private WebElement controleUnidades;

	public ParametrosGerais(WebDriver driver) {
		this.driver = driver;
		builder = new Actions(driver);
	}

	public void clicarRegiaoDesconto() throws InterruptedException {
		builder.moveToElement(cadastros).build().perform();

		Thread.sleep(1000);
		builder.moveToElement(cadastro).build().perform();

		Thread.sleep(1000);
		builder.moveToElement(evolucaoPadrao).build().perform();

		Thread.sleep(1000);
		builder.moveToElement(regiaoDesconto).build().perform();
		regiaoDesconto.click();
	}

	public void clicarControleUnidades() throws InterruptedException {
		builder.moveToElement(relatorios).build().perform();

		Thread.sleep(1000);
		builder.moveToElement(gerencial).build().perform();

		Thread.sleep(1000);
		builder.moveToElement(controleUnidades).build().perform();
		controleUnidades.click();
	}
}
