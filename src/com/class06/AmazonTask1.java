package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTask1 {
	/**
	 * TC 1: Amazon Department List Verification: Open chrome browse --> Go to
	 * “http://amazon.com/” Verify how many department options available. Print each
	 * department Select Computers Quit browser
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		WebElement options = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		
        //Verify how many department options available. 
		Select select = new Select(options);
		List<WebElement> allOpt = select.getOptions();
		System.out.println(allOpt.size());

		// Print each department
		String value = "Computers";
		for (WebElement dep : allOpt) {
			System.out.println(dep.getText());
			
		}
		select.selectByVisibleText(value);
		

		Thread.sleep(7000);
		driver.quit();
	}

}
