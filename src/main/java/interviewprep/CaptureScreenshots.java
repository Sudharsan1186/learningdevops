package interviewprep;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CaptureScreenshots {
	public static void main(String[] args) throws IOException {
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/* Capture currently visible portion of web page */
		
		Screenshot viewable = new AShot().takeScreenshot(driver);
		try {
			ImageIO.write(viewable.getImage(), "PNG", new File("./snaps/viewable.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/* Capture full page screenshot */	
		
		Screenshot fullpage = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(fullpage.getImage(), "PNG", new File("./snaps/fullpage.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	/* Capture particular WebElement */
		
		WebElement deals = driver.findElement(By.id("desktop-btf-grid-1"));
		File src = deals.getScreenshotAs(OutputType.FILE);
	        
	   try {
		FileUtils.copyFile(src, new File("./snaps/element.png"));
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	   
	   
	   File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	   FileHandler.copy(source, new File("./snaps/fullpagesnap.png"));
	}
}
