package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 1: Amazon Page Title Verification:
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
 * @author tetianahatley
 *
 */
public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("amazon.com: online shopping for electronics, apparel, computers, books, dvds & more")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Wrong title");
		}
		driver.quit();

	}

}
