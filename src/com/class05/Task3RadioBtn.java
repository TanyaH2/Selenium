package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3RadioBtn {
	/**
	 * * Check all Years of Experience radio buttons are clickable
	 * ----------------------------------------------- 
	 * Check all Automation Tools checkboxes are clickable and keep 
	 * “Selenium WebDriver” option as selected
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//String valueToSelect = "Automation Tester";
		List<WebElement> yearsExp = driver.findElements(By.name("exp"));

		System.out.println(yearsExp.size());

		for (WebElement exp : yearsExp) {

			if (exp.isEnabled()) {

				String value = exp.getAttribute("value");
				System.out.println(value);

				
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		System.setProperty("webdriver.chrome.driver","/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver1=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String valueToSelect1 = "Selenium WebDriver";
		List<WebElement> autTool = driver.findElements(By.name("tool"));

		System.out.println(autTool.size());

		for (WebElement tool : autTool) {

			if (tool.isEnabled()) {

				String value = tool.getAttribute("value");
				System.out.println(value);
				tool.click();
				if (value.equals(valueToSelect1)) {
					tool.click();
				}
				
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
		/**
		 * List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radio: radioExp) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
		 */
	}
	}


