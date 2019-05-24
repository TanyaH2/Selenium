package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class IFrame extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
//		CommonMethods.setUpDriver("firefox", "http://google.com");

		// 1 way --> Using Name and ID
//		driver.switchTo().frame("iframe_a");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Tanya");

		driver.switchTo().frame("iframe_a");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name"));

		// 2 way --> Using Element (widely used)
//		WebElement ele=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
//		driver.switchTo().frame(ele);
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("TanyaH");

		WebElement elem = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(elem);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("T");

		// 3 way --> Using Index
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input#name")).sendKeys("TanyaHS");

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("TanyaHS");

//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[name='iframe_a']")));
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
//      driver.switchTo().defaultContent();
//		boolean Switch = driver.findElement(By.xpath("//h2[text()='SwitchTo']")).isDisplayed();
//		if (Switch == true) {
//			driver.close();
//		}

		Thread.sleep(2000);
		driver.quit();

	}

}
