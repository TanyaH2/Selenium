package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("sorry wrong title");
		}
		
		
		driver.get("http:facebook.com");
		System.out.println(driver.getTitle());
		String title1= driver.getTitle();
		if(title1.equalsIgnoreCase("facebook - log in or sign up")) {
			System.out.println("this is the right title");
		}else {
			System.out.println("sorry wrong one");
		}
		driver.close();
	
	}

}
