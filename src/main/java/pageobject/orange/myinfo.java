package pageobject.orange;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseObject_orange.testbase;

public class myinfo extends testbase{
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	@CacheLookup
	public static WebElement dashboard;	
	
	@FindBy(xpath="//td[contains(text(),'No Records are Available')]")
	@CacheLookup
	public static WebElement text;
	
	@FindBy(xpath="//b[contains(text(),'My Info')]")
	@CacheLookup
	public static WebElement myinfo;
	
	@FindBy(xpath="//input[@id='btnSave']")
	@CacheLookup
	public static WebElement edit;
	
	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	@CacheLookup
	public static WebElement firstname;
	
	
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")
	@CacheLookup
	public static WebElement middlename;
	
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	@CacheLookup
	public static WebElement lastname;
	
	
	



public  myinfo()
{
	PageFactory.initElements(driver, this);
}


public String  king() {
	
	return text.getText();
}





}



//input[@id='personal_txtEmpLastName']