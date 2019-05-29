package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class VerifyElementIsEnabledTask3 extends CommonMethods{

	/*
	 * TC 3: Verify element is enabled
	 * 
	 * 1. Open chrome browser 
	 * 2. Go to “https://the-internet.herokuapp.com/” 
	 * 3. Click on “Click on the “Dynamic Controls” link 
	 * 4. Click on enable button 
	 * 5. Enter “Hello” and verify text is entered successfully 
	 * 6. Close the browser
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String url="https://the-internet.herokuapp.com/";
        setUpDriver("chrome",url);
        driver.findElement(By.linkText("Dynamic Controls")).click();
        WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
        
        Actions act=new Actions(driver);
        act.moveToElement(element).click().sendKeys("Hello").build().perform();

        driver.findElement(By.xpath("//button[text()='Disable']")).click();


        WebElement message=driver.findElement(By.id("message"));
       if(message.isDisplayed()) {
           System.out.println(message.getText());
           System.out.println("text is entered successfully");
       }else {
           System.out.println("No message is displayed");
       }


       driver.quit();
	}}