package com.class02;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		// Second TAB- One way(Firefox/Chrome)

		// ((JavascriptExecutor)driver).executeScript("window.open();");

		// Second TAB- another way(Firefox/Chrome)
		
		// The script that will will open a new blank window
		// If you want to open a link new tab, replace 'about:blank' with a link

       //String a = "window.open('about:blank','_blank');";
       //((JavascriptExecutor)driver).executeScript(a);

	}

}
