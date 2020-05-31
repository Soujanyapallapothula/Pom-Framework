package com.qa.hubspot.basepeage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	WebDriver driver;
	Properties prop;
	public WebDriver init_Driver(Properties prop ) {
		
		String browsername=prop.getProperty("browser");
		
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();	
		}
		else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();	
		}
	driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		return driver;
	}

	public Properties init_properties() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Giya Krish\\eclipse-workspace4\\PomSeries\\src\\main\\java\\com\\qa\\hubspot\\config\\config.properties");
			try {
				prop.load(fis);
	//	prop.getProperty("url");
		//	prop.getProperty("username");
		//	prop.getProperty("password");
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return prop;
	}
}


	



	



