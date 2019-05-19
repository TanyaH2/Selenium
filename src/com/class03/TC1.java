package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	/**
	 * TC 1: Facebook login: Open chrome browser Go to “https://www.facebook.com/”
	 * Enter valid username and valid password and click login User successfully
	 * logged in
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
//		WebDriver driver= new ChromeDriver();
//		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
		
//		driver.findElement(By.name("firstname")).sendKeys("Dany");
//		driver.findElement(By.name("lastname")).sendKeys("Targo");
//		driver.findElement(By.name("reg_email__")).sendKeys("tskrypka87@gmail.com");	
//		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tskrypka87@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("KhalDrogo");
//		driver.findElement(By.className("_58mt")).click();
//		driver.findElement(By.id("month")).sendKeys("June");
//		driver.findElement(By.id("day")).sendKeys("13");
//		driver.findElement(By.id("year")).sendKeys("1666");
//		driver.findElement(By.name("websubmit")).click();
		
//		driver.findElement(By.name("email")).sendKeys("tskrypka87@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("KhalDrogo");
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(2000);
//		driver.quit();
		
		
//		driver.findElement(By.id("email")).sendKeys("tskrypka87@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.name("pass")).sendKeys("KhalDrogo");
//		driver.findElement(By.partialLinkText("Forgot")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.findElement(By.name("pass")).sendKeys("KhalDrogo");
//		Thread.sleep(1000);
//		driver.findElement(By.id("u_0_2")).click();
//		driver.findElement(By.id("loginbutton")).click();
//		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("tskrypka87@gmail.com");	
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("KhalDrogo");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
