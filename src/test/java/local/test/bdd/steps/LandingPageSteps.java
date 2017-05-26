package local.test.bdd.steps;

import local.test.bdd.pages.LandingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class LandingPageSteps extends ScenarioSteps {
	LandingPage landingPage;
	public LandingPageSteps(Pages pages) {

		super(pages);
		landingPage = getPages().get(LandingPage.class);
		
	}
	
	@Step
	public void openLandingPage( String searchString) {
		
		landingPage.open();
		landingPage.sendSearchString(searchString);
		landingPage.verifyPageResult();
	}
	

}
