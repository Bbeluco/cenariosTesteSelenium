package testesEHooks;

import org.junit.After;
import org.junit.Before;

import pagesComuns.BasePage;

public class Hooks {
	BasePage bp = new BasePage();
	
	@Before
	public void setup() {
		bp.setupInicializacaoBrowser();
	}
	
	@After
	public void finish() {
		bp.finalizaBrowser();
	}
}
