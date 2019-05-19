package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://cnn.com");
		//Thread.sleep(3000);
		
		driver.navigate().to("http://google.com");
		
		//Thread.sleep(3000);
		driver.navigate().back();
		//Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.quit();
		
		
		
	}
	
}
