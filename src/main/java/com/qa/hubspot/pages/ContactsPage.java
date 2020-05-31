package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.basepeage.BasePage;
import com.qa.hubspot.util.ElementUtil;

public class ContactsPage extends BasePage{
private	WebDriver driver;
ElementUtil    elementutil;

	public ContactsPage( WebDriver Driver) {
    this.driver=driver;
        elementutil=new ElementUtil(driver);
	}
	
	By primarycreatecontact=By.xpath("//span[@data-key='contentToolbar.addContactButton']");
	By emailid=By.xpath("//input[@data-field='email']");
	By firstname=By.xpath("//input[@data-field='firstname']");
	By lastname=By.xpath("//input[@data-field='lastname']");
	By jobtitle=By.xpath("//input[@data-field='jobtitle']");
	By secondarycreatecontact=By.xpath("//span[@class='private-loading-button__content private-button--internal-spacing' and text()='Create contact']");


public String contactPageTitle() {
	return	elementutil.doGetTitle();
}

public void doCreateContact(String EmailId,String FirstName, String LastName, String JobTitle) {
//	elementutil.checkPresenceOfElement(emailid, 5);
	elementutil.doSendKeys(emailid, EmailId);
	elementutil.doSendKeys(firstname, FirstName);
	elementutil.doSendKeys(lastname, LastName);
	elementutil.checkPresenceOfElement(jobtitle, 5);
	elementutil.doSendKeys(jobtitle, JobTitle);
	
	
	
}
}
