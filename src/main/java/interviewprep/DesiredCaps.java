package interviewprep;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps {

	public static void main(String[] args) {
		
	// DesiredCapabilities with ChromeOptions
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
//		options.addArguments("--disable-infobars"); // no longer works
		
    // To disable infobar -> Chrome is being controlled by automated test software
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", 
				new String[]{"enable-automation"});
		
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
