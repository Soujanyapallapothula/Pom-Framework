package com.qa.hubspot.basepeage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.ContactsPage;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.Loginpage;
import com.qa.hubspot.util.ConstantsUtil;

public class ContactPageTest extends BaseTest{
	
	@BeforeClass
	public void contactSetup() {
		hp=	lp.checkLogin("souji.mitul@gmail.com", "Krish100ji");
		cp=hp.primaryContact();
		}
		
//	public void verifyContactPageTitleTest() {
//	String title=	cp.contactPageTitle();
//	System.out.println(title);
//Assert.assertEquals(title, ConstantsUtil.Contact_page_title);
//	}
	
	
	@Test
	public void verifycreateContactTest() {
		cp.doCreateContact("raj@gmail.com", "Raj", "raj", "Qa");
		
	}

}
