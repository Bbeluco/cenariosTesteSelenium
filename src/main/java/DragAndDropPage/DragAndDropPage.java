package DragAndDropPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pagesComuns.BasePage;

public class DragAndDropPage extends BasePage{
	
	private static final int EIXO_Y = 30;
	private static final int EIXO_X = 275;

	public WebElement capturaElementoParaSerArrastado() {
		return chrome.findElement(By.id("winston"));
	}
	
	public void arrastaElemento() {
		Actions act = new Actions(chrome);
		act.dragAndDropBy(capturaElementoParaSerArrastado(), EIXO_X, EIXO_Y).perform();
	}
	
	public boolean isNaPosicaoDesejada() {
		return chrome.findElement(By.cssSelector("div[style=\"background: rgb(0, 200, 0);\"]")).isEnabled();
	}
}
