package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DoubleClickTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUpDriver("chrome", "https://www.saucedemo.com");
//		setUpDriver("firefox", "https://www.saucedemo.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Syntax");
		Actions act= new Actions(driver);
		WebElement doubleClick=driver.findElement(By.cssSelector("input#password"));
		act.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
	}

}
