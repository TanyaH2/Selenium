package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC 1: Swag Labs Positive login: Open chrome browser Go to
 * “https://www.saucedemo.com/” Enter valid username and valid password and
 * click login Verify robot icon is displayed Verify “Products” text is
 * available next to the robot icon
 * ---------------------------------------------------------------------------
 * TC 2: Swag Labs Negative login: Open chrome browser Go to
 * “https://www.saucedemo.com/” Enter invalid username and password and click
 * login Verify error message contains: “Username and password do not match any
 * user in this service”
 * 
 * @author tetianahatley
 *
 */
public class PosNegTask {

	public static void main(String[] args) throws InterruptedException {
		String userName="performance_glitch_user";
		String password="secret_sauce";

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();//maximize(); for Windows
		
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
		//logo verification
		boolean logo=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
		if (logo) {
			System.out.println("Robot logo is displayed");
		}else {
			System.out.println("Robot logo is NOT displayed");
		}
		//verify product text
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		
		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("Element is NOT displayed OR textis NOT="+productText);
		}
		Thread.sleep(2000);
		driver.quit();
		
		/**
		 * driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
		for (WebElement radio: radioExp) {
			if(radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
		driver.quit();
	}
}
		 */
		
	}
}
