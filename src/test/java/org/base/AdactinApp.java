package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("Ramsarathy");
		driver.findElement(By.id("password")).sendKeys("Sarathy@12345");
		driver.findElement(By.name("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByValue("Melbourne");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s = new Select(hotel);
		s.selectByIndex(1);	
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByIndex(1);
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomnos);
		s3.selectByVisibleText("8 - Eight");
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("23/09/2021");
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("24/09/2021");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s6 = new Select(adultroom);
		s6.selectByIndex(1);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s7 = new Select(adultroom);
		s7.selectByIndex(1);
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		WebElement btn = driver.findElement(By.id("radiobutton_0"));
		btn.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		driver.findElement(By.id("first_name")).sendKeys("hari");
		driver.findElement(By.id("last_name")).sendKeys("sarathy");
		driver.findElement(By.id("address")).sendKeys("Chennai");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s0 =new Select(cardtype);
		s0.selectByIndex(1);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s11 =new Select(month);
		s11.selectByIndex(1);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s12 =new Select(year);
		s12.selectByIndex(11);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	//	Alert a = driver.switchTo().alert();
	//	a.accept();

		WebElement orderid = driver.findElement(By.xpath("(//input[@type=\"text\"])[16]"));
		String attribute = orderid.getAttribute("value");
		System.out.println("order id :"+ attribute);
		driver.findElement(By.id("logout")).click();
		driver.quit();



























	}

}
