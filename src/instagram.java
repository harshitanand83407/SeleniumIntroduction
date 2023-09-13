import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("harshit_anand_monu");
		// _aa4b _add6 _ac4d
		driver.findElement(By.name("password")).sendKeys("H@rshit01122000");
		driver.findElement(By.xpath("//button/div[1]")).click();
		// driver.findElement(By.linkText("Not Now")).click();
		driver.findElement(By.xpath(
				"// div[@class='x1i10hfl xjqpnuy xa49m3k xqeqjp1 x2hbi6w xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1q0g3np x1lku1pv x1a2a7pz x6s0dn4 xjyslct x1ejq31n xd10rxx x1sy0etr x17r0tee x9f619 x1ypdohk x1i0vuye x1f6kntn xwhw2v2 xl56j7k x17ydfre x2b8uid xlyipyv x87ps6o x14atkfc xcdnw81 xjbqb8w xm3z3ea x1x8b98j x131883w x16mih1h x972fbf xcfux6l x1qhh985 xm0m39n xt0psk2 xt7dq6l xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x1n5bzlp x173jzuc x1yc6y37']"))
				.click();
		driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
		// driver.findElement(By.xpath("//img[@alt='']"));
		driver.findElement(By.xpath(
				"//img[@class='xpdipgo x6umtig x1b1mbwd xaqea5y xav7gou xk390pu x5yr21d xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x11njtxf xh8yej3']"))
				.click();
		//driver.findElement(By.xpath("//img[@alt='harshit_anand_monu's profile picture']"));
		

	}

}
