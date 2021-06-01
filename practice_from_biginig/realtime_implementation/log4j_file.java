package realtime_implementation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j_file {
	
	static WebDriver driver;
	static Logger log = Logger.getLogger(log4j_file.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.info("****************************** Starting test cases execution  *****************************************");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		log.info("launching chrome broswer");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
		
		

	}

}
