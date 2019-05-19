package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
 */
public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.contains("Syntax")) {
			System.out.println("Title contains 'Syntax'");
		} else {
			System.out.println("Wrong, Title DOES NOT contain 'Syntax'");
		}

		driver.quit();
	}

}
