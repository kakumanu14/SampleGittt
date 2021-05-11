package org.xyz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BaseClass{

	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private static WebElement username;
	
	@FindBy(id = "pass")
	private static WebElement password;

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
