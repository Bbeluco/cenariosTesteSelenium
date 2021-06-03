package testesEHooks;

import org.junit.Assert;
import org.junit.Test;

import JsPromptPage.promptPage;
import pagesComuns.HomePage;

public class JsPromptTest extends Hooks{

	@Test
	public void jsPrompt() {
		HomePage hp = new HomePage();
		hp.abrirTabelaLadoEsquerdo("Mudança de foco");
		hp.selecionaOpcaoDentroDaTabela("Alert");
		
		promptPage prompt = new promptPage();
		prompt.clicarBtnJsPrompt();
		prompt.inputMensagemDentroDaCaixaPrompt();
		prompt.getMensagemDeSucesso();
		
		Assert.assertEquals("Você digitou: Fui colocado a partir do JS Prompt",
				prompt.getMensagemDeSucesso());
	}
}
