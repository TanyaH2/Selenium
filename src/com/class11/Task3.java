package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		 driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
	       
        driver.findElement(By.xpath("//input[@name='txtPassword']/folowing-sibling::span")).sendKeys("admin123");
       
        driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
        // driver.close();
	}

}
