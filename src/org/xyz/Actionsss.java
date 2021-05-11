package org.xyz;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionsss extends BaseClass{
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver2 = getDriver();
	getURL("https://www.facebook.com/");
	
	loginPage l = new loginPage();
	insertdata(l.getUsername(), "Bhavana");
	insertdata(l.getPassword(), "Test");
	uquit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
