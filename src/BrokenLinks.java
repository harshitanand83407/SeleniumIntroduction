
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		   
				System.setProperty("webdriver.chrome.driver","C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//String url =  driver.findElements(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
				
				//HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
				//conn.setRequestMethod("HEAD");
				//conn.connect();
				//int respCode = conn.getResponseCode();
				//System.out.println(respCode);
				
				
				}
				
	}



