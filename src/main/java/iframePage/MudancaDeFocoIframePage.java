package iframePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pagesComuns.BasePage;

public class MudancaDeFocoIframePage extends BasePage {

	public void capturaESelecionaIframe() {
		WebElement iframe = chrome.findElement(By.id("id_do_iframe"));

		chrome.switchTo().frame(iframe);
	}
	
	public WebElement selecionaCampo(String idDoCampo) {
		WebElement campo = chrome.findElement(By.id(idDoCampo));
		return campo;
	}
	
	public void preencheCampo(String primeiroNome, String ultimoNome, String senha, String email, String texto) {
		selecionaCampo("first_name").sendKeys(primeiroNome);
		selecionaCampo("last_name").sendKeys(ultimoNome);
		selecionaCampo("password").sendKeys(senha);
		selecionaCampo("email").sendKeys(email);
		selecionaCampo("textarea1").sendKeys(texto);
	}
	
	public int capturaQuantidadeDeInputsValidos() {
		return chrome.findElements(By.className("valid")).size();
	}
}
