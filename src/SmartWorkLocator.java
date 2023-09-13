import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartWorkLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://steria.sharepoint.com/sites/intra_all_dsi/SitePages/Parici-end-of-life.aspx");
		driver.findElement(By.id("i0116")).sendKeys("harshit.anand@soprasteria.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("Password")).sendKeys("L7r9t8@Q#h%Hy+M");
		driver.findElement(By.id("submitButton")).click();
		
		
		
	}

}