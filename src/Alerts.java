
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class Alerts {

public static void main(String[] args) {



String text="Harshit";

System.setProperty("webdriver.chrome.driver","C:/Users/hanand/chromedriver_win32 (2)/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

driver.findElement(By.id("name")).sendKeys(text);

driver.findElement(By.cssSelector("[id='alertbtn']")).click();

System.out.println(driver.switchTo().alert().getText());

driver.switchTo().alert().accept();

driver.findElement(By.id("confirmbtn")).click();

System.out.println(driver.switchTo().alert().getText());



driver.switchTo().alert().dismiss();
}
}



















   













