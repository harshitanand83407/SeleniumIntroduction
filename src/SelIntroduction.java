import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome driver
    //System.setProperty("webdriver.chrome.driver", "C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");
    //WebDriver driver= new ChromeDriver();
        // Firefox Driver
    System.setProperty("webdriver.gecko.driver", "C:/Users/hanand/geckodriver-v0.33.0-win-aarch64/geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
    
    //driver.get("https://qainternalmatch.dev-sos.soprasteria-it.services/");
    //System.out.println(driver.getTitle());
    driver.get("https://rahulshettyacademy.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.close();
    //driver.quit();
	}

}
