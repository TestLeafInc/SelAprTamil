package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class Home extends TestNgHooks{
	
	public Home verifyWelcomeMessage() {
		String message = driver.findElement(By.tagName("h2")).getText();
		if(message.contains("Welcome")) {
			System.out.println("Successfully Logged In");
		}
		return this;
	}
	
	public Login clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Login();
	}
	
	public MyMenus clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyMenus();
	}

}
