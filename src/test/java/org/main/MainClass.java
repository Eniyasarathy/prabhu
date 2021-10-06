package org.main;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass b = new BaseClass();
		b.toLaunchBrowser("Chrome");
		b.toUrl1("http://adactinhotelapp.com/index.php");
		Thread.sleep(3000);
		WebElement text1 = b.toFindLocator("id", "username");
		b.type(text1, "Ramsarathy");
		WebElement pass = b.toFindLocator("id", "password");
		b.type(pass, "Sarathy@12345");
		System.out.println(pass);
		b.toFindLocator("id", "login").click();

	}

}
