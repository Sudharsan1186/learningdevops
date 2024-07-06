package interviewprep;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FindBrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Number of links in webpage : " + links.size());
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement link : links) {
			String linkUrl = link.getAttribute("href");
			if(linkUrl != null && !linkUrl.contains("javascript")) {
				urlList.add(linkUrl);
			}
		}
		
		for(String url : urlList) {
			try {
				URL u = new URL(url);
				URLConnection connUrl;
				
				connUrl = u.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection)connUrl;
				httpConn.connect();
				
				if(httpConn.getResponseCode()== 200) {
					System.out.println(url + " " + httpConn.getResponseMessage());				
				} else {
					System.out.println(url + " is broken");
					System.out.println(httpConn.getResponseCode() + " " + httpConn.getResponseMessage());
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
