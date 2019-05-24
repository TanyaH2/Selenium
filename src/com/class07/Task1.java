package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
	/**
	 * TC 1: ToolsQA Frame verification Open chrome browser Go to
	 * “https://www.toolsqa.com/iframe-practice-page/” Click on “Blogs” link inside
	 * first frame Verify element “Interactions” is present in second frame Navigate
	 * to Home Page Quit browser
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
//		CommonMethods.setUpDriver("firefox", "https://www.toolsqa.com/iframe-practice-page/");

		// first frame
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("First Commit In Git")).click();

		/**
		 * driver.switchTo().frame("IF1");
		 * driver.findElement(By.linkText("//a[text()='Guest Blog']")).click();
		 */

		// switch to main
		driver.switchTo().defaultContent();

		// switch to second frame
		driver.switchTo().frame("iframe2");

		boolean z = driver.findElement(By.xpath("//h3[@class='widget-title']")).isDisplayed();
		if (z == true) {

			driver.switchTo().defaultContent();
			driver.quit();
			System.out.println(z + "- Interactions is displayed");
		} else {
			System.out.println("Interactions is not displayed");
		}
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().defaultContent();
//		
//		
//		Thread.sleep(2000);
//		driver.quit();

		/**
		 * CommonMethods.setUpDriver("chrome",
		 * "https://www.toolsqa.com/iframe-practice-page/");
		 * driver.switchTo().frame("IF1"); 
		 * driver.findElement(By.xpath("//a[text()='Git Log']")).click(); 
		 * driver.switchTo().defaultContent();
		 * driver.switchTo().frame(1); 
		 * boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		 * if(inter==true) { driver.switchTo().defaultContent(); 
		 * driver.close(); 
		 * }
		 */
	}

}
