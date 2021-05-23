package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class FindLeads extends MyMenus{
	
	public FindLeads typeFirstName(String firstName) {
		driver.findElement(By.xpath("//span[text()='Name and ID']/following::input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//span[text()='Name and ID']/following::input[@name='firstName']")).sendKeys(firstName);
		return this;
	}
	

	public FindLeads clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		return this;
	}
	
	public ViewLead clickFirstMatchingResult() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		return new ViewLead();
	}
	
	

}
