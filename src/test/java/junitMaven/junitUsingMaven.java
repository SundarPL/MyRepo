package junitMaven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitUsingMaven {
	public static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace1\\junitMaven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);

	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);

	}
	@Test
	public void testcase1() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Sundar");

	}
	@Test
	public void testcase2() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Sundar");

	}
	@Test
	public void testcase3() {
		WebElement btnLogin = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		btnLogin.click();

	}

}
