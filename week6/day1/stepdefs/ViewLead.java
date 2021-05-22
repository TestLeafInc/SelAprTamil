package stepdefs;

import io.cucumber.java.en.Then;

public class ViewLead  extends BaseSteps{
	
	
	@Then("Verify the lead is created")
	public void verifyTitle() {
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("Success");
		}
	}

}
