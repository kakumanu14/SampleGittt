package org.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntoClass {
	public static void main(String[] args) throws InterruptedException {
		//to set properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Driver Jars\\chromedriver.exe");
		
		//initiate driver
		WebDriver driver = new ChromeDriver();
		
		//to maximize
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		username.sendKeys("Bhavana");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("testing");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(5000);
		
		//quit browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
