package week6.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.day2.hooks.TestNgHooks;

public class Login extends TestNgHooks{
		
	public Login typeUserName(String userdata) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(userdata);
		return this;
	}
	
	public Login typePassword(String passdata) {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(passdata);
		return this;
	}
	
	public Home typePasswordAndEnter() {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("crmsfa", Keys.ENTER);
		return new Home();
	}
	
	public Home clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Home();
	}
	
	public Login clickLoginForFailure() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
	

}
