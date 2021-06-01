package pageobject.orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseObject_orange.testbase;

public class login_page extends testbase{
    @FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement user;
	//@FindBy(xpath="//input[@id='txtPassword']")
	@FindBy(xpath="//input[@id='txtPassword']")
	@CacheLookup
	WebElement pass;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	@CacheLookup
	WebElement login;


public login_page()
{
	PageFactory.initElements(driver, this);
		}

public void verifyusername(String un)
{
	user.sendKeys(un);
}
public void verifypassword(String pw)
{
	pass.sendKeys(pw);
}

public void login_button() {
	login.click();
	
}
}