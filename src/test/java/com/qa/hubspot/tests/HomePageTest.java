package com.qa.hubspot.tests;



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.qa.hubspot.basepeage.BaseTest;
import com.qa.hubspot.pages.HomePage;

import com.qa.hubspot.util.ConstantsUtil;

public class HomePageTest extends BaseTest {
	
	HomePage hp;
	
	
	@BeforeClass
	public void HomesetUp() {
	hp=	lp.checkLogin("souji.mitul@gmail.com", "Krish100ji");
	
	}
	
	@Test(priority=0)
	 public void verifyhomeHeaderTextTest() {
	String text=	 hp.gethomeHeaderText();
	System.out.println(text);
	Assert.assertEquals(text, ConstantsUtil.Home_Psge_HeaderText);
	 }
	
	 
	// @Test
//	// public void verifyUserInfoTest() {
//String userInfo		= hp.getuserinfo();
//System.out.println(userInfo);
//Assert.assertEquals(userInfo, "sou palla");
//	 }
	 
	@Test(priority=1)
	 public void verifyHomePAgeTitle() {
	String title=	 hp.getHomeTitle();
	System.out.println(title);
	Assert.assertEquals(title,ConstantsUtil.Home_page_title);
	 }}
		
	
	


