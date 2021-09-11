package Hooks;

import BaseClass.Baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Baseclass{

	@Before
	public void startapplication() {
		setUp();
	}
	@After
	public void teardown() {
		driver.quit();
	}
	
}
