package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTest {
	WebDriver driver;
	public WebDriver getDriver(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser"+ browser);
		}
		return driver;
	}
	private void getTheUrl() {
		driver.get(null);
	}
	private void printTitle() {
		driver.getTitle();
	}
	private void toPrintCurrentUrl() {
		driver.getCurrentUrl();
	}
	private void toFindLocator() {
		// TODO Auto-generated method stub

	}
	


}
