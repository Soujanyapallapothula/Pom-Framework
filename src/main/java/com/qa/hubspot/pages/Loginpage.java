package com.qa.hubspot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.basepeage.BasePage;
import com.qa.hubspot.util.ElementUtil;

public class Loginpage extends BasePage{
	private WebDriver driver;
	ElementUtil elementutil;
	
	
	public Loginpage( WebDriver driver) {
		this.driver=driver;
		elementutil=new ElementUtil(driver);
		
	}
	
	By emailadress=By.id("username");
	By password=By.id("password");
	By loginButton=By.id("loginBtn");
	By signUpLink=By.linkText("Sign up");
	
	
	public String getTitle() {
	//	return getTitle();
	return	elementutil.doGetTitle();
		
	}
	
	public Boolean checkSignupLink() {
	//return driver.findElement(signUpLink).isDisplayed();
return	elementutil.findIsDisplayed(signUpLink);
		
	}
	public HomePage checkLogin(String un,String pwd) {
		
	//	driver.findElement(emailadress).sendKeys(un);
		//driver.findElement(password).sendKeys(pwd);
	//	driver.findElement(loginButton).click();
		elementutil.doSendKeys(emailadress, un);
		elementutil.doSendKeys(password, pwd);
		elementutil.doClick(loginButton);
		
		return new HomePage(driver);
		
		
	}
}

