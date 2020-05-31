package com.qa.hubspot.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.hubspot.basepeage.BaseTest;
import com.qa.hubspot.util.ConstantsUtil;

public class LoginPageTests extends BaseTest {
	
	@Test(priority=1)
	public void verifySignUPLinkTest() {
Assert.assertTrue(lp.checkSignupLink());
	}
	
	@Test(priority=2)
	public void verifyTitleTest() {
	String text=	lp.getTitle();
	System.out.println(text);
	Assert.assertEquals(text, ConstantsUtil.Login_page_title);
	}
	
	
	@Test(priority=3)
	public void verifyLoginTest() {
		lp.checkLogin("souji.mitul@gmail.com", "Krish100ji");
	//	lp.checkLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}}
	


