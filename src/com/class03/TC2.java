package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	/*
	 * TC 2: Mercury Tours Registration: Open chrome browser Go to
	 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
	 * info Click Submit User successfully registered (Create 2 scripts using
	 * different locators)
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver/");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("http://newtours.demoaut.com/");
//		driver.findElement(By.linkText("REGISTER")).click();
//		driver.findElement(By.name("firstName")).sendKeys("Arya");
//		driver.findElement(By.name("lastName")).sendKeys("Stark");
//		driver.findElement(By.name("phone")).sendKeys("911");
//		driver.findElement(By.id("userName")).sendKeys("test123@gmail.com");
//		driver.findElement(By.name("address1")).sendKeys("123 main street");
//		driver.findElement(By.name("city")).sendKeys("Winterfell");
//		driver.findElement(By.name("state")).sendKeys("North");
//		driver.findElement(By.name("postalCode")).sendKeys("00000");
//		driver.findElement(By.id("email")).sendKeys("test123");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.name("confirmPassword")).sendKeys("123");
//		driver.findElement(By.name("register")).click();
//		Thread.sleep(3000);
//		driver.close();
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver/");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName' ]")).sendKeys("Arya");
		driver.findElement(By.xpath("//input[@name='lastName' ]")).sendKeys("Stark");
		driver.findElement(By.xpath("//input[@name='phone' ]")).sendKeys("911");
		driver.findElement(By.xpath("//input[@name='userName' and @id='userName' ]")).sendKeys("test123@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1' ]")).sendKeys("123 main street");
		driver.findElement(By.xpath("//input[@name='city' ]")).sendKeys("Winterfell");
		driver.findElement(By.xpath("//input[@name='state' ]")).sendKeys("North");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("00000");
		driver.findElement(By.xpath("//input[@name='email' ]")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Pascal Nouma");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1903");
	    driver.findElement(By.xpath("//input[@name='login']")).click();
		
	    driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}