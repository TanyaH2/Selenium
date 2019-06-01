package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TablesTask extends CommonMethods{
	/*
	 * TC 1: Table headers and rows verification
	 * 
	 * Open chrome browser Go to
	 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx” 
	 * Login to the application 
	 * Verify customer “Susan McLaren” is present in the table 
	 * Click on customer details 
	 * Update customers last name 
	 * Verify updated customers name is displayed in table 
	 * Close browser
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("Chrome", url);
		
		driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
		String password="input#ctl00_MainContent_password";
		driver.findElement(By.cssSelector(password)).sendKeys("test");
		driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		String expected="Susan McLaren";
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			if(rowText.contains(expected)) {
				System.out.println(expected+" is present in row "+i);
				driver.findElement(By.xpath("//table[contains(@id,'Content_order')]/tbody/tr["+i+"]/td[13]")).click();
			}			
		}
	String name=	driver.findElement(By.xpath("//input[@value='Susan McLaren']")).getText();
	
	String[] newName=name.split(" ");
	for(String nName:newName) {
		if(nName.equalsIgnoreCase("McLaren")) {
			nName.replaceAll(nName, "McMuffin");
			System.out.println(nName);
		}
	}
	
		
		
		
		
//		driver.quit();
	}

}
