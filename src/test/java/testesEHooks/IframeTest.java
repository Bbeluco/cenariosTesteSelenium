package testesEHooks;

import org.junit.Assert;
import org.junit.Test;

import iframePage.MudancaDeFocoIframePage;
import pagesComuns.HomePage;

public class IframeTest extends Hooks{

	@Test
	public void inputDentroDoIframeTest() {
		int qtdInputsValidos;
		
		HomePage hp = new HomePage();
		hp.abrirTabelaLadoEsquerdo("Mudança de foco");
		hp.selecionaOpcaoDentroDaTabela("Iframe");
		
		MudancaDeFocoIframePage iframePage = new MudancaDeFocoIframePage();
		iframePage.capturaESelecionaIframe();
		iframePage.preencheCampo("Bruno", "Bispo", "senha123"
				, "bruno@email.com", "Sou uma caixa de texto");
		
		qtdInputsValidos  = iframePage.capturaQuantidadeDeInputsValidos();
		Assert.assertEquals(4, qtdInputsValidos);
	}
}
