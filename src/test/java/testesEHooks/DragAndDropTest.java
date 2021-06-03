package testesEHooks;

import org.junit.Assert;
import org.junit.Test;

import DragAndDropPage.DragAndDropPage;
import pagesComuns.HomePage;

public class DragAndDropTest extends Hooks{

	@Test
	public void dragTest() {
		HomePage hp = new HomePage();
		hp.abrirTabelaLadoEsquerdo("Iterações");
		hp.selecionaOpcaoDentroDaTabela("Drag And Drop");
		
		DragAndDropPage dragPage = new DragAndDropPage();
		dragPage.arrastaElemento();
		Assert.assertTrue(dragPage.isNaPosicaoDesejada());
	}
}
