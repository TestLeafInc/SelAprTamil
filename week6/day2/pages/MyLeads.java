package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class MyLeads extends MyMenus{
	
	
	public CreateLead clickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
	
	public FindLeads clickFindLeadsMenu() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeads();
	}

}
