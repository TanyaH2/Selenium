package com.class12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class BrokenIMGDemo extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome","http://Newtours.Demoaut.com");
	}
	
	@Test
	public void brokenLinksVerification() {
		
	
		//1.Grab all Links
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		System.out.println("Total number of links is: "+imgs.size());
		//2.Get href attribute
		for (WebElement img : imgs) {
			String linkUrl = img.getAttribute("src");
			
			try {
				URL obj = new URL(linkUrl);
				HttpURLConnection conn = ((HttpURLConnection) obj.openConnection());
				int code = conn.getResponseCode();
				if (code == 200) {
					System.out.println("Link " + linkUrl + " is valid");
				}else {
					System.out.println("Link " + linkUrl + " ------is NOT valid. Code of error: " + code);
				}
			}catch(Exception e){
				e.printStackTrace();
			
			
			}
	}
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
}