package week6.day2.tests;

import org.testng.annotations.Test;

import week6.day2.hooks.TestNgHooks;
import week6.day2.pages.Login;

public class CreateLeadTests extends TestNgHooks{
	
	
	@Test
	public void login() {
		
		new Login()
			.typeUserName("DemoSalesManager")
			.typePassword("crmsfa")
			.clickLogin()
			.verifyWelcomeMessage()
			.clickCrmSfa()
			.clickLeadsTab()
			.clickCreateLeadMenu()
			.typeCompanyName("TestLeaf")
			.typeFirstName("Babu")
			.typeLastName("Manickam")
			.clickCreateLeadButton()
			.verifyViewLead();
	}

}
