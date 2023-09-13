import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("http://google.com");
   // File src=     ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(src,new File("C:\\Users\\hanand\\Pictures\\Screenshots\\B.E"));

	}

}
