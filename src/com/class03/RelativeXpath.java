package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@data-test='password'] ")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='LOGIN'] ")).click();
		
		driver.quit();
		
		
		
//		driver.get("https://www.toolsqa.com/automation-practice-form/");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("performance_glitch_user");
//		driver.findElement(By.xpath("//input[@data-test='password'] ")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@value='LOGIN'] ")).click();
		
		
	}

}
