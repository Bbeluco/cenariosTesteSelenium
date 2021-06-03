package JsPromptPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import pagesComuns.BasePage;

public class promptPage extends BasePage{

	public void clicarBtnJsPrompt() {
		chrome.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
	}
	
	public void inputMensagemDentroDaCaixaPrompt() {
		Alert alert = chrome.switchTo().alert();
		alert.sendKeys("Fui colocado a partir do JS Prompt");
		alert.accept();
	}
	
	public String getMensagemDeSucesso() {
		return chrome.findElement(By.id("result")).getText();
	}
}
