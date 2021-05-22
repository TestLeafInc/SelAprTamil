package stepdefs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;

public class FindLeads extends BaseSteps{
	
	@And("Click Phone Tab")
	public void clickPhoneTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}
	
	@And("Type Phone Number as (.*)$")
	public void typePhoneNumber(String phoneNumber) {
		driver.findElementByName("phoneNumber").sendKeys(phoneNumber);
	}
	
	@And("Click Find Leads Button")
	public void clickFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}
	
	@And("Click First Matching Result")
	public void clickFirstMatchingResult() throws InterruptedException {
		Thread.sleep(2000);
		WebElement firstResult = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		//wait.until(ExpectedConditions.stalenessOf(firstResult));
		firstResult.click();
	}

}


