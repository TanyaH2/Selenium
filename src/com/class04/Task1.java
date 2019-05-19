package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
/**
 * Task Enter the username with either contains or starts-with xpath
 * enter the password with either contains or starts-with xpath
 * click on login with either contains or starts-with xpath
 * @throws InterruptedException 
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
