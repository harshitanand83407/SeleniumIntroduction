import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to by pass SSL check
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipassress:4444");
		options.setCapability("proxy",proxy);
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_dirctory","/dirctory/path");
		options.setExperimentalOption("prefs", prefs);
		
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver","C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");

		//options.setExperimentalOption("excludeSwitches",

		//	     Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com");
        System.out.println(driver.getTitle());
	}

}
