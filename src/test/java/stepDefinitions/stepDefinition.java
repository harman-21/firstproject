package stepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import NavMain.Base;
import NavMain.LandingPage;
import NavMain.LoginPage;

@RunWith(Cucumber.class)
public class stepDefinition extends Base{

    
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver = SelectBrowser();
	}

	@Given("Navigate to qaclickacademy.com site")
	public void navigate_to_qaclickacademy_com_site() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Given("Click on login link to land on sign in page")
	public void click_on_login_link_to_land_on_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp= new LandingPage(driver);
		lp.SignIn().click();
	
	}

	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage logPage= new LoginPage(driver);
		logPage.Email().sendKeys(username);
		logPage.Password().sendKeys(password);
		logPage.LogIn().click();
    }

	@Then("verify the user is successfully login")
	public void verify_the_user_is_successfully_login() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(driver.getTitle().contains("QaClickAcademy"));
	    
	}
	  @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

}