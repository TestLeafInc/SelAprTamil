package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class MyMenus extends TestNgHooks{
	
	
	public MyLeads clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}

	public MyLeads clickAccountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyLeads();
	}
}
