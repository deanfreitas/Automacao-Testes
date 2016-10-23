package br.com.projetoautomacao.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverWaitVivere {

	public static void aguardarEvento(WebElement element, WebDriver driver){
		for(int i=0;i<=30 ;i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.err.println("Thread Sleep falhou");
				e.printStackTrace();
			}
			if(element.isDisplayed() && element.isEnabled()){
				break;
			}
		}
	}
}
