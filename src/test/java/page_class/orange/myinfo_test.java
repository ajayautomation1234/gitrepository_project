package page_class.orange;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseObject_orange.testbase;
import pageobject.orange.login_page;
import pageobject.orange.myinfo;
import utility_file.util;




public class myinfo_test extends testbase{
	
	public static login_page l;
	public static myinfo m;
	String sheetname="king";
	
	public myinfo_test() {
		super();
	}

	
 @BeforeMethod
	public void myinfo_initialize() throws IOException {
		
		load_browser();
		 l=new login_page();
		 l.verifyusername(pro.getProperty("Username"));
			l.verifypassword(pro.getProperty("Password"));
			l.login_button();
		 m=new myinfo();
		}

 @Test(priority=1)
	public void verify() {
		String text=  m.king();        
     System.out.println(text);
     assertEquals(text, "No Records are Available");
	}
 
 @DataProvider
	public Iterator<Object[]> data_provi() {
	ArrayList<Object[]> datafromexcell=util.getdatafromexcel();
	return datafromexcell.iterator();
}
 
 
@Test(priority=2, dataProvider="data_provi")
      public void myinfo_initi() throws IOException
      {
	     verify();
        	
    	 m.myinfo.click();
    	 m.edit.click();
    	 m.firstname.clear();
    	 m.firstname.sendKeys("ajay");
    	 m.middlename.clear();
    	 m.middlename.sendKeys("kumar");
    	 m.lastname.clear();
    	 m.lastname.sendKeys("AM");
    	 
   }
        
        
//        @DataProvider
//    	public Iterator<Object[]> data_provi() {
//    		ArrayList<Object[]> datafromexcell=utility_file.util.getdatafromexcel();
//    		return datafromexcell.iterator();
//    	}
        
      
      @AfterMethod
      public void tear_down() {
    	  driver.close();
      }
	
}
