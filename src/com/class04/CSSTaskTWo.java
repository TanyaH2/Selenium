package com.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTaskTWo {
	/**
	 * Open chrome browser Go to “http://newtours.demoaut.com/” Click on Register
	 * Link Fill out all required info Click Submit
	 *
	 * 
	 * css=tag#id 
	 * css= tag[attribute=’value’] 
	 * css=tag.class 
	 * css=tag^='value'] for starts with 
	 * css=tag$='value'] for ends with 
	 * css=tag*='value'] for contains
	 * 
	 * //a[contains(text(),'REGISTER')] ---Xpath
	 */
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
//		Thread.sleep(2000);

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		//driver.findElement(By.cssSelector("")).sendKeys();
		Thread.sleep(2000);
        driver.quit();
	}

}
