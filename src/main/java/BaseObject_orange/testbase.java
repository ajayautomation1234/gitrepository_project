package BaseObject_orange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
	public static Properties pro;
	public static WebDriver driver;
	
	
	
	public Properties load_data() throws IOException
	{
		FileInputStream stream=new FileInputStream("orange.propertiese");
		 pro=new Properties();
		 pro.load(stream);
		 return pro;
		}
	
	
	public void load_browser() throws IOException
	{
		 load_data();
		String Driver=pro.getProperty("Driver");
		String browser=pro.getProperty("Browser");
		String url=pro.getProperty("Url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Driver);
			 driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		
		}
	
	public void screeshot(String testMethodname) throws IOException
	{
		 load_data();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Ajay AM\\eclipse-workspace\\New folder\\A_A_A_A_A_A_lockdown_practice_code\\screen\\"+testMethodname+"-"+".jpg"));
	}   
	
	public void close()             
	{
		
		driver.close();
		
	}
	
	

}
