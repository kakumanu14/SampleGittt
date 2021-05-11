package org.xyz;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ClassA {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//to set properties
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\Driver Jars\\chromedriver.exe");
		
		//initiate driver
		WebDriver driver = new ChromeDriver();
		
		//to maximize
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		
		//TypeCasting
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\home\\Desktop\\Driver Jars\\samplescrn.png");
		Files.copy(source, destination);
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
