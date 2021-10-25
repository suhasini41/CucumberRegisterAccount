package register.stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.qa.pages.AccountCreatedPage;
import com.demo.qa.pages.RegistrationPage;

import base.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegisterAccountTest 
{
	
	DriverFactory df = DriverFactory.getDriverFactory();
	WebDriver driver = df.getDriver();
	RegistrationPage rp = PageFactory.initElements(driver, RegistrationPage.class);
	AccountCreatedPage acp = PageFactory.initElements(driver, AccountCreatedPage.class);
	
	@Given("^the user the registration Page$")
	public void the_user_the_registration_Page() throws Throwable {
		driver.get("https://demo.opencart.com/index.php?route=account/register");
	   
	}

	@Given("^the title is asserted to be \"([^\"]*)\"$")
	public void the_title_is_asserted_to_be(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(rp.getTitle(), expectedTitle);
		
	}

	@When("^the user details are entered$")
	public void the_user_details_are_entered(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
	    rp.enterFirstname(data.get(0).get(0));
	    rp.enterLastName(data.get(0).get(1));
	    rp.enterEmail(data.get(0).get(2));
	    rp.enterTelephone(data.get(0).get(3));
	    rp.enterPassword(data.get(0).get(4));
	    rp.enterConfirmPass(data.get(0).get(5));
	}

	@When("^clicked on subscribe radio button$")
	public void clicked_on_subscribe_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rp.clickSubscribeRadioButton();
	}

	@When("^clicked on agree checkbox$")
	public void clicked_on_agree_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rp.clickAgreeCheckBox();
	}

	@When("^clicked on continue button$")
	public void clicked_on_continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   rp.clickContinueButton();
	}

	@Then("^the user is navigated to page with title \"([^\"]*)\"$")
	public void the_user_is_navigated_to_page_with_title(String expectedTitle1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.titleIs(expectedTitle1));
		System.out.println(acp.getTitle1());
		System.out.println(expectedTitle1+"***********");
		Assert.assertEquals(acp.getTitle1(), expectedTitle1); 
	}

	@Then("^the text \"([^\"]*)\" is displayed$")
	public void the_text_is_displayed(String expectedText) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals(acp.headerText(), expectedText);
		System.out.println(acp.headerText());
		System.out.println(expectedText+"***********");
	}


}
