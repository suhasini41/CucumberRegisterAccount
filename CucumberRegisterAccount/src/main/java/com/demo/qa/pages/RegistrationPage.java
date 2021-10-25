package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage
{
	public WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(id="input-confirm")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@value='0']")
	WebElement subscribe;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement agreeCheckBox;
	
	public void enterFirstname(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lName)
	{
		lastName.sendKeys(lName);
	}
	
	public void enterEmail(String em)
	{
		email.sendKeys(em);
	}
	public void enterTelephone(String phoneNum)
	{
		telephone.sendKeys(phoneNum);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterConfirmPass(String confirmPass)
	{
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void clickSubscribeRadioButton()
	{
		subscribe.click();
	}
	
	public void clickContinueButton()
	{
		continuebutton.submit();
	}
	
	public void clickAgreeCheckBox()
	{
		agreeCheckBox.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
}
