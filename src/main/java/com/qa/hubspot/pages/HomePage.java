package com.qa.hubspot.pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

import com.qa.hubspot.basepeage.BasePage;
import com.qa.hubspot.util.ElementUtil;

	public class HomePage extends BasePage {
	private WebDriver driver;
	ElementUtil elementutil;
	ContactsPage cp;
		
		
		public HomePage( WebDriver driver) {
			this.driver=driver;
			elementutil=new ElementUtil(driver);
			
		}
		
		By homeHeaderText=By.xpath("//i18n-string[text()='Dashboard Library']");
		By userinfo=By.xpath("//div[@class='user-info-name']");
		By primaryContact=By.id("nav-primary-contacts-branch");
		By secondaryContact=By.xpath("(//a[@id='nav-secondary-contacts' and @class='navSecondaryLink'])[1]");
		
		public String getHomeTitle() {
	    return	elementutil.doGetTitle();
		}
		
		public String gethomeHeaderText() {
		if(elementutil.findIsDisplayed(homeHeaderText)) {
			return  elementutil.doGetText(homeHeaderText);
			}
		else
			return null;
			 
		}
		
		public  ContactsPage primaryContact() {
			secondaryContact();
			return new ContactsPage(driver);
		}
		
		public void secondaryContact() {
			elementutil.doClick(primaryContact);
			elementutil.checkPresenceOfElement(secondaryContact, 15);
			elementutil.doClick(secondaryContact);
		}
		
		
		
		
		
		
		
		
//		//public String getuserinfo() {
//			if(driver.findElement(userinfo).isDisplayed()){
//			return driver.findElement(userinfo).getText();
//		}else
//			return null;
		}


