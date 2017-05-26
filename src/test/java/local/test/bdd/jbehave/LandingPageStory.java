package local.test.bdd.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import local.test.bdd.steps.LandingPageSteps;
import net.thucydides.core.annotations.Steps;

public class LandingPageStory {

	@Steps
	private LandingPageSteps landingPageSteps;
	
	@Given("a Search String '$searchString'")
	@When("google search page open")
	@Then("all search results will be displayed")
	public void searchString(String searchString) {
		landingPageSteps.openLandingPage(searchString);
				
	}
	
}
