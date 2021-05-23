package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class EditLead extends MyMenus{
	
	public EditLead typeCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public EditLead typeFirstName(String firstName) {
		driver.findElement(By.id("updateLeadForm_firstName")).clear();
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	
	public ViewLead clickUpdateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLead();
	}

}
