package org.base;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public WebDriver toLaunchBrowser(String Browser) {

		switch (Browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("invalid browser name :" + Browser );
			break;
		}
		driver.manage().window().maximize();
		return driver;
	}
	public void toUrl1(String url) {
		driver.get(url);

	}
	public String  toprinttext(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public String toGetText(WebElement text) {
		String text2 = text.getText();
		return text2;
	}
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void btnclick(WebElement element) {
		element.click();
	}
	private void toExit() {
		driver.quit();
	}
	private void toCloseCurenntPage() {
		driver.close();
	}

	public void dropDown(WebElement element, String dropoption, String value) {
		Select select = new Select(element);
		switch (dropoption) {
		case "vtext":
			select.selectByVisibleText(value);
			break;
		case"value":
			select.selectByValue(value);
			break;
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		default:
			System.out.println("invalid dropdown option :" + dropoption);
			break;
		}
	}
	public WebElement toFindLocator(String locatortype, String locatorvalue) {
		WebElement element = null  ;
		switch (locatortype) {
		case "id":
			element  = driver.findElement(By.id(locatorvalue));
			break;
		case"name":
			element  = driver.findElement(By.name(locatorvalue));
			break;
		case"xpath":
			element  = driver.findElement(By.xpath(locatorvalue));
			break;
		default:
			System.out.println("invalid locator value:"+ locatortype);
			break;
		}
		return element;
	}
	public void toUrl(String url) {
		driver.get(url);
	}

}
