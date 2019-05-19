package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("performance_glitch_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
