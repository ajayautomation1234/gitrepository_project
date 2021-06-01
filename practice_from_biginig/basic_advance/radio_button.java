package basic_advance;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Logger log = Logger.getLogger(radio_button.class);
		
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		log.info("opening webiste");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 log.info("entring weight");
		
		driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).click();
		
		 log.info("finding element ");
		
		driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
		
		 log.info("clicking on the element");
		
	   boolean text=	driver.findElement(By.xpath("//p[contains(text(),\"Radio button 'Male' is checked\")]")).isDisplayed();
	   
	   log.info(" getting text");
	
		
	 System.out.println(text);
		
	 log.info("printing the text");
		
		

	}

}
