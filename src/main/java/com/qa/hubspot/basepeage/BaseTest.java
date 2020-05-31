package com.qa.hubspot.basepeage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.hubspot.pages.ContactsPage;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.Loginpage;
import com.qa.hubspot.util.ElementUtil;

public class BaseTest {
	public WebDriver driver;
public	BasePage bp;
public	Loginpage lp;
public HomePage hp;
public ContactsPage cp;
public	Properties prop;


	
	@BeforeTest
	public void setUp() {
		 bp=new BasePage();
		 Properties prop=bp.init_properties();
		 driver= bp.init_Driver(prop);
          lp=new Loginpage(driver);
          hp=new HomePage(driver);
         
	}
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


