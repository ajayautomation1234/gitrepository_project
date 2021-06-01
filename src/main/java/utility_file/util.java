package utility_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseObject_orange.testbase;

public class util extends testbase{

	static Xls_Reader reader;
	public static ArrayList<Object[]> getdatafromexcel() {
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		 reader=new Xls_Reader("C:\\Users\\Ajay AM\\eclipse-workspace\\New folder\\A_A_A_A_A_A_lockdown_practice_code\\src\\main\\java\\utility_file\\orange_ajay.xlsx");
		 
		 for(int rownum=2;rownum<=reader.getRowCount("king");rownum++)
		 {
			 String firstname=reader.getCellData("king", "first", rownum);
			 String middlename=reader.getCellData("king", "middle", rownum);
			 String lastname=reader.getCellData("king", "last", rownum);
			  Object ab[]= {firstname};
			  mydata.add(ab);
			 
	 }
	return mydata;
	
	
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
	
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
