package org.xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
public static WebDriver getDriver() {
	//to set properties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Driver Jars\\chromedriver.exe");
	
	//initiate driver
	driver = new ChromeDriver();
	
	//to maximize
	driver.manage().window().maximize();
	return driver;
}


//URL launching
public static void getURL(String URL) {
	driver.get(URL);
}

//inserting the data
public static void insertdata(WebElement element, String text) {
	element.sendKeys(text);
}

public static void uclick(WebElement element1) {
	element1.click();
}

public static void uquit() {
	driver.quit();
}
}
