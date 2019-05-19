package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/tetianahatley/Selenium/geckodriver");//
		WebDriver test=new FirefoxDriver();
		test.get("http://amazon.com");
		
	}


}
