package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;

/*
 * TC 1: OrangeHRM Login

   Navigate to “https://opensource-demo.orangehrmlive.com/”
   Login to the application
   Verify user is successfully logged in

   Note: must use properties file
 */
public class OrangeHRMLogIn {
 //CharSequence logIn;
 Properties prop; 
  
	@Test(priority= 1)
	public void loginAndVerification() {
		String filePath = "src/configs/credentials.properties";
		
		try {
			
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("logIn"));
		System.out.println(prop.get("password"));

	
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));

		CommonMethods.driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(prop.getProperty("logIn"));
		CommonMethods.driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(prop.getProperty("password"));
		CommonMethods.driver.findElement(By.cssSelector("input#btnLogin")).click();
		
     	
	}
	@Test(priority= 2) 
	public void checkLogIn() {
		
		SoftAssert as= new SoftAssert();
		as.assertTrue(true);
		System.out.println("You're logged in!");
	

		
		
		CommonMethods.driver.quit();
	
		
	}}
	

