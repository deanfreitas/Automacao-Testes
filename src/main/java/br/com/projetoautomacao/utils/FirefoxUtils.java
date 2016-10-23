package br.com.projetoautomacao.utils;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxUtils {
	private static StringBuffer verificationErrors = new StringBuffer();
	private static WebDriver driver;
	public static final int time_out = 10;
	
	public static WebDriver setUp() throws Exception {
		// setAdapter(new MainClassAdapter(CadastroPreProposta.class, new
		// String[0]));
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		// firefoxProfile.setPreference("dom.ipc.plugins.enabled", false);
		// Set profile to accept untrusted certificates
		firefoxProfile.setAcceptUntrustedCertificates(true);
		// Set profile to not assumet certificate issuer is untrusted
		firefoxProfile.setAssumeUntrustedCertificateIssuer(false);
		// Set download location and file types
		firefoxProfile.setPreference("browser.download.folderList", 2);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
		String reportFolder = "C:\\TEMP";
		firefoxProfile.setPreference("browser.download.dir", reportFolder);
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv,application/pdf,application/csv,application/vnd.ms-excel");
		// Set to false so popup not displayed when download finished.
		firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
		firefoxProfile.setPreference("browser.download.panel.shown", false);
		firefoxProfile.setPreference("browser.download.useToolkitUI", true);
		// Set this to true to disable the pdf opening
		firefoxProfile.setPreference("pdfjs.disabled", true);
		firefoxProfile.setPreference("pdfjs.firstRun", false);
		firefoxProfile.setPreference("plugin.disable_full_page_plugin_for_types", "application/pdf");
		firefoxProfile.setPreference("browser.download.panel.firstSessionCompleted", true);
		firefoxProfile.setPreference("browser.download.panel.shown", true);
		firefoxProfile.setPreference("browser.cache.disk.enable", false);
		firefoxProfile.setPreference("browser.cache.memory.enable", false);
		firefoxProfile.setPreference("browser.cache.offline.enable", false);
		firefoxProfile.setPreference("network.http.use-cache", false);
		firefoxProfile.setPreference("dom.max_chrome_script_run_time", 200);
		firefoxProfile.setPreference("dom.max_script_run_time", 200);
		
		try{
			driver = new FirefoxDriver(firefoxProfile);
		}catch(WebDriverException e){
			setUpDriverClassPath(firefoxProfile);
		}
		driver.manage().timeouts().implicitlyWait(time_out, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	private static void setUpDriverClassPath(FirefoxProfile firefoxProfile){
		File pathToBinary = null;
		try{
			pathToBinary = new File(System.getenv("firefox"));
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			driver = new FirefoxDriver(ffBinary, firefoxProfile);
		}catch(NullPointerException e){
			throw new WebDriverException("NAO FOI LOCALIZADO UMA INSTALACAO VALIDA DO MOZILLA FIREFOX");
		}catch(WebDriverException e){
			throw new WebDriverException("NAO FOI LOCALIZADO UMA INSTALACAO VALIDA DO MOZILLA FIREFOX");
		}
	}
	
	public static void tearDown() throws Exception {
		driver.close();
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
