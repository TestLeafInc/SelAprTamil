package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class ViewLead extends MyMenus{
	
	
	public ViewLead verifyViewLead() {
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("All Good !!");
		}
		return this;
	}

	public EditLead clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLead();
	}
}
