package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
	/**
	 * Task One Ahead to http://uitestpractice.com/Students/Index 
	 * Click on the Actions 
	 * Click on the click me ! 
	 * Handle the alert and click okay 
	 * Double Click Double Click Me ! 
	 * Handle the alert and click okay 
	 * Close the browser
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
	
       driver.findElement(By.xpath("//a[text()='Actions']")).click();
       driver.findElement(By.xpath("//button[text()='Click Me !']")).click();
       
		
	}

}
