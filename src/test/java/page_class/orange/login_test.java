package page_class.orange;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseObject_orange.custome;
import BaseObject_orange.testbase;
import pageobject.orange.login_page;
@Listeners(custome.class)
public class login_test extends testbase{
	
	login_page l;
	
	public login_test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
	load_browser();
	 l=new login_page();
	}
	
	@Test
	public void verifylogin() {
		
		l.verifyusername(pro.getProperty("Username"));
		l.verifypassword(pro.getProperty("Password"));
		l.login_button();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
