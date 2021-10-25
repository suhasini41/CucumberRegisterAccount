package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage
{
	WebDriver driver;
	public AccountCreatedPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement accountCreatedHeader;
	
	public String getTitle1()
	{
		return driver.getTitle();
	}
	
	public String headerText()
	{
		return accountCreatedHeader.getText();
	}
}
