package basic_advance;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class desired_capability {
	
	static WebDriver driver;
    static String baseURL;
	static String nodeURL;
	public static void main(String[] args) throws MalformedURLException {
		baseURL = "https://www.facebook.com/";
        nodeURL = "http://192.168.43.140:4444/wd/hub";
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		}

}

