package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[7]/input[@name='firstname']
		
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("html/body/div/div[5]/div/div/div/div/div/div/div/div[2]/div/form/fieldset/div[8]/input[@name='firstname']")).sendKeys("name");
		
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@placeholder='Username']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@data-test='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@value='LOGIN']")).click();
		
		driver.quit();
	}

}
