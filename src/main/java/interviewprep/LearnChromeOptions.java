package interviewprep;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnChromeOptions {

	public static void main(String[] args) {
		
		// new feature from Selenium 3.6.0
		ChromeOptions options = new ChromeOptions();
		EdgeOptions opt = new EdgeOptions();

//		options.setPlatformName(null)
//		options.setBrowserVersion(null)
//		options.setPageLoadTimeout(null)
//		options.setScriptTimeout(null)
//		options.setImplicitWaitTimeout(null)
		
//		options.setUnhandledPromptBehaviour(null)
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//		options.addArguments("--start-maximized");
		
		// To disable browser notifications
		options.addArguments("--disable-notifications");
		
		// To run without GUI
//		options.addArguments("--headless");
		
		options.addArguments("--disable-popup-blocking");
		
		options.addArguments("--incognito");
		
//		options.addArguments("--disable-infobars"); // no longer works
		
    // To disable infobar -> Chrome is being controlled by automated test software
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", 
				new String[]{"enable-automation"});
		
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
//		WebDriver driver = (WebDriver) RemoteWebDriver.builder().oneOf(options).build();
		driver.get("https://amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());

	}

}
