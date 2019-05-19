package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
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
		
		
// www.barnesandnoble.com
//      tskrypka@icloud.com
//		76V-7pB-64D-wnM
		String a = "window.open('https://www.barnesandnoble.com/?DPSLogout=true','_blank');";
		((JavascriptExecutor)driver).executeScript(a);
		driver.get("https://www.barnesandnoble.com/?DPSLogout=true");
		//driver.findElement(By.className("bx-close-xstroke bx-close-x-adaptive")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("tskrypka@icloud.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("76V-7pB-64D-wnM");
		Thread.sleep(1000);
		driver.findElement(By.className("checkbox__box")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("btn btn--large")).click();
		Thread.sleep(3000);
//		
//		driver.quit();
		
//// www.graze.com
////		qwerty
		String z = "window.open('https://us.graze.com/','_blank');";
		((JavascriptExecutor)driver).executeScript(z);
		driver.get("https://us.graze.com/");
		driver.findElement(By.className("primary-navigation__item is-hidden-mobile")).click();
		
//		
//// www.insectlore.com
//// 4Ps-cxc-hF8-RoM		
//		String c = "window.open('about:blank','_blank');";
//		((JavascriptExecutor)driver).executeScript(c);
//		driver.get("www.insectlore.com");
		
		
		
		
		
		
	}

}
