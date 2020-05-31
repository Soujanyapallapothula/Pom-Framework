package com.qa.hubspot.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	WebDriver driver;
	 
	public ElementUtil(WebDriver driver ) {
		this.driver=driver;
	}
	
	 public WebElement getElement( By locator) {
		 WebElement element=null;
		 try {
			 
		 element=driver.findElement(locator);
		 System.out.println("Element found " +locator);
		 }
		  catch(Exception e) {
			 System.out.println("some exception occured " +locator);
			  }
		 return element;
		 
	 }
	 public void doSendKeys( By locator,String value) {
		 getElement(locator).sendKeys(value);
		 
	 }
	 public void doClick( By locator) {
		 getElement(locator).click();
		 
	 }
	 public String doGetTitle() {
		return  driver.getTitle();
	 }
	 
	 
	 
	
	 public String doGetText(By locator) {
		 return	 getElement(locator).getText();
	 }
		 
		 public boolean findIsDisplayed(By locator) {
		return	 getElement(  locator).isDisplayed();
		 }
		 
		 public  List<WebElement> doGetelements(By locator) { //generic code for getting list of webelements
			  List<WebElement> elementsList=driver.findElements(locator);
			  return elementsList;
			
		 }
		 
		 
		// -------*********Select GenericCode Methods*************//
		 
		 public void doSelectByVisibleText(By locator, String value) {
			  Select select=new Select(getElement(locator));
			select.selectByVisibleText(value); 
		 }
		 
		 public void doSelectByIndex(By locator,int index) {
			 Select select=new Select(getElement(locator));
				select.selectByIndex(index); 
		 }
		 public void doSelectByValue(By locator, String value) {
			 Select select=new Select(getElement(locator));
			 select.selectByValue(value);
		 }
		 
		
			
		// ****** DropDownOptions without select class(generic code methods)******** 
		 
		 public ArrayList<String>  doGetDropDownOptions(By locator) {
			 ArrayList<String> ar=new ArrayList<String>();
				Select select=new Select(getElement(locator));
				List<WebElement> DropDownOptions=	select.getOptions();
				for(int i=0;i<DropDownOptions.size();i++) {
					String text=DropDownOptions.get(i).getText();
					ar.add(text);
				}
				return ar;
		 }

		 
		 
		 
		 public  void doGetDropdownValueWithoutSelect( By locator,String value) {
				List<WebElement> OptionsList=doGetelements((locator));
				for(int i=0;i<OptionsList.size();i++) {
			String text=OptionsList.get(i).getText();
					if(text.equals(value)) {
						OptionsList.get(i).click();
						break;
}}}
				
				
				
				public void doRightClick( By locator) {
					Actions action=new Actions(driver);
					WebElement rightClick=getElement(locator);
					action.contextClick(rightClick).build().perform();
				}
				
				
				public void doDragAndDrop(By source,By target) {
					Actions action=new Actions(driver);
					WebElement sourceEle=getElement(source);
					WebElement targetEle=getElement(target);
					action.dragAndDrop(sourceEle,targetEle).build().perform();
				}
				
				public void DragAndDropByClick(By source, By target) {
					Actions action=new Actions(driver);
					WebElement sourceEle=getElement(source);
					WebElement targetEle=getElement(target);
					action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
				}
				
				
				
				// *********ExplicitWaitMethods*************
				
public  Boolean checkTitleToBePresent(String Url,int timeout) {
					
					WebDriverWait wait=new WebDriverWait(driver,10);
				boolean b=		wait.until(ExpectedConditions.titleIs(Url));
					return b;
				}

public  WebElement checkElementToBeClickable(By locator,int timeout) {
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	WebElement element=		 wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
}

				
				
				
				
				public  Alert checkAlertToBePresent(int timeout) {
					
					WebDriverWait wait=new WebDriverWait(driver,10);
					Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
					return alert;
				}
				
				
				public List<WebElement> checkVisibilityOfAllElements(By locator,int timeout) {
					WebDriverWait wait=new WebDriverWait(driver, timeout);
					List<WebElement> LinkList=			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			        return LinkList;
				}
				
				public  WebElement checkPresenceOfElement(    By locator,int timeunit) {
					WebDriverWait wait=new WebDriverWait(driver,10);
					WebElement element=	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
					return element;
				}
				public Boolean checkUrl(String Url,int timeout) {
					WebDriverWait wait=new WebDriverWait(driver,10);
				boolean b=		wait.until(ExpectedConditions.urlContains(Url));
				return b;
				}

				
				
				}
				
				
				


				
	
			
				
				
				
				



			 
			 
			 
			 
		 
		  
	 



