package register.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass 
{
	DriverFactory df = DriverFactory.getDriverFactory();
	WebDriver driver = df.getDriver();
	
	@Before("@register")
	public void init()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@After("@register")
	public void tearDown()
	{
		driver.quit();
	}

}
