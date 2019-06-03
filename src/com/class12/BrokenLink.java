package com.class12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class BrokenLink extends CommonMethods {

	public static void main(String[] args) throws IOException {

		String url = "http://Newtours.Demoaut.com";
		setUpDriver("chrome", url);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String linkUrl = link.getAttribute("href");

			if (!linkUrl.equalsIgnoreCase(null)) {
				URL obj = new URL(linkUrl);
				HttpURLConnection conn = ((HttpURLConnection) obj.openConnection());
				int rCode = conn.getResponseCode();
				if (rCode == 200) {
					System.out.println("Link " + linkUrl + " is valid");

				} else {
					System.out.println("Link " + linkUrl + " is NOT valid. Code of error: " + rCode);

				}

			}
		}

		driver.close();
	}

}
