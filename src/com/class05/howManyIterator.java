package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * TC 1: Amazon link count: Open chrome browser Go to “https://www.amazon.com/”
 * Using Iterator get text of each link Get number of links that has text
 * 
 * @author tetianahatley
 *
 */
public class howManyIterator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "/Users/tetianahatley/Selenium/geckodriver");//
//		WebDriver test=new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		
		Iterator<WebElement>  iter=links.iterator();
		int count=0;
		while(iter.hasNext()) {
			WebElement num=iter.next();
			String  linkT= num.getText();// OR String linkT= iter.next().getText();
			if(!linkT.isEmpty()) {
				System.out.println(linkT);
				count++;
			}
		}
		System.out.println("Total number of links with text "+count);
		driver.quit();
	}
	

}
