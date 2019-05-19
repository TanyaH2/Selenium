package com.class02;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParaBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=2111F43A33C7EE1FCDAA2375F4DA6C25");
		driver.findElement(By.id("customer.firstName")).sendKeys("Arya");
		driver.findElement(By.name("customer.lastName")).sendKeys("Stark");
		driver.findElement(By.id("customer.address.street")).sendKeys("1223 Winterfell");
		driver.findElement(By.id("customer.address.city")).sendKeys("Castle");
		driver.findElement(By.id("customer.address.state")).sendKeys("North");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("34999");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("7037772345");
		driver.findElement(By.id("customer.ssn")).sendKeys("678-76-4478");
		driver.findElement(By.id("customer.username")).sendKeys("KillerOfTheDead");
		driver.findElement(By.id("customer.password")).sendKeys("453bhj22");
		driver.findElement(By.name("repeatedPassword")).sendKeys("453bhj22");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.name("username")).sendKeys("KillerOfTheDead");
		driver.findElement(By.name("password")).sendKeys("453bhj22");
		driver.findElement(By.className("button")).click();

		// ((JavascriptExecutor)driver).executeScript("window.open();");

		
		
		// The script that will will open a new blank window
		// If you want to open a link new tab, replace 'about:blank' with a link
		
//		String a = "window.open('about:blank','_blank');";
//		((JavascriptExecutor)driver).executeScript(a);

	}

}
