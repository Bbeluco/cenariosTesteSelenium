package pagesComuns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver chrome;
	
	public void setupInicializacaoBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		chrome.get("https://automacaocombatista.herokuapp.com/treinamento/home");
	}
	
	public void finalizaBrowser() {
		chrome.close();
	}
} 
