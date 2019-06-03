package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']/../input")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();		
		driver.close();
	}

}
