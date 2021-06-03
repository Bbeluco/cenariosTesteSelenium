package pagesComuns;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

	public void abrirTabelaLadoEsquerdo(String opcao) {
		chrome.findElement(By.linkText(opcao)).click();
	}
	
	public void selecionaOpcaoDentroDaTabela(String opcaoDaTabela) {
		chrome.findElement(By.linkText(opcaoDaTabela)).click();
	}
}
