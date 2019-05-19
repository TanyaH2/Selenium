package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://cnn.com");
	driver.get("http://youtube.com");
	//driver.close();
	driver.quit();
}
}
