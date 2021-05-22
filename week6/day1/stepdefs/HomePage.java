package stepdefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class HomePage  extends BaseSteps{
	
	@And("Click CRM SFA Link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
