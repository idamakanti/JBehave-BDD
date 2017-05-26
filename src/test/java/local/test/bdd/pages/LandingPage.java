package local.test.bdd.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://google.com")
public class LandingPage extends PageObject {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
	//driver=new ChromeDriver();
		this.driver=driver;
		
	}
	
	@FindBy(id="lst-ib")
	WebElement input;
	@FindBy(name="btnK")
	WebElement btnKey;
	
	public void sendSearchString( String searchString) {
		
		input.sendKeys(searchString);
		btnKey.click();
		
	}
	
	public void verifyPageResult() {
		
		assertTrue(true);
		
		
	}
}
