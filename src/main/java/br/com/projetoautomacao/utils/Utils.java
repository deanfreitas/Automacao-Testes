package br.com.projetoautomacao.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;



public class Utils {

	private final static String caminho = System.getProperty("user.dir").concat("\\src\\resources\\");

	public static void deleteCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

	public static void validarAlert(String alertMessage, WebDriver driver){
		for(int i=0;i<=8 ;i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.err.println("Thread Sleep falhou");
				e.printStackTrace();
			}
			if(isAlertPresent(driver)){
				String txtAlert = driver.switchTo().alert().getText();
				if(!alertMessage.equals(txtAlert)){
					System.err.println("ALERT: " + alertMessage + " NÃO LOCALIZADO");
					System.err.println("ALERT PRESENTE: " + txtAlert);
				}
				driver.switchTo().alert().accept();
				return;
			}
		}
	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		return alertText;
	}

	public static boolean isElementPresent(By by, WebDriver driver) {
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void carregarArquivo() {
		String locale = System.getProperty("user.language");
		String imagem="";

		if(locale.equals("pt")){
			imagem = "novo_abrir_arquivo.JPG";
		}else if(locale.equals("en")){
			imagem = "novo_open.JPG";
		}

		Screen s = new Screen();
		boolean findImg = false;
		try{
			do{
				s.find(caminho.concat(imagem));
				findImg = true;
			}while(!findImg);
			s.type(null, caminho + "teste.pdf", 0);
			s.click(caminho.concat(imagem), 0);
			Thread.sleep(4000);

		}catch (FindFailed e) {
			e.printStackTrace();
		}catch (InterruptedException e) {
		}

	}

	public static void selectMenuItemEqualsIgnoresCase(WebDriver driver,WebElement element, String item){
		List<WebElement> lista = new Select(element).getOptions();
		for (WebElement webElement : lista) {
			if(webElement.getText().equalsIgnoreCase(item)){
				String value = webElement.getAttribute("value");
				new Select(element).selectByValue(value);
				return;
			}
		}
		throw new IllegalArgumentException("Não foi localizado valor: " + item);
	}


}
