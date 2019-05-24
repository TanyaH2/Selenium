package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class HoverOverTask extends CommonMethods {
//			Task for hoverOver
//			         Navigate to https://www.toolsqa.com
//			             Hover over the Tutorial menu
//			             Click on Software Testing Tutorial
//			             Close the browser
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     setUpDriver("Chrome", "https://www.toolsqa.com");
     
    WebElement hov= driver.findElement(By.xpath("//span[text()='Tutorial']"));
    Actions act= new Actions(driver);
    act.moveToElement(hov).click().perform();
    
    WebElement hov1= driver.findElement(By.xpath("//span[text()='Web Automation Tools']"));
    Actions act1= new Actions(driver);
    act1.moveToElement(hov1).click().perform();
    
    driver.findElement(By.xpath("//span[text()='Selenium in Java']")).click();
    
    Thread.sleep(2000);
	driver.close();
		
		
		
		
	}

}
