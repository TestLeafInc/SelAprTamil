package week6.day2.tests;

import org.testng.annotations.Test;

import week6.day2.hooks.TestNgHooks;
import week6.day2.pages.Login;

public class LoginTests extends TestNgHooks{
	
	
	@Test
	public void login() {
		
		new Login()
			.typeUserName("DemoCSR")
			.typePassword("crmsfa")
			.clickLogin()
			.verifyWelcomeMessage()
			.clickLogout();

	}

}
