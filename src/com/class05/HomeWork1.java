package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork1 {
	/**
	 * TC 1: Facebook dropdown verification Open chrome browser Go to
	 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
	 * 31 day options year dd has 115 year options Select your date of birth Quit
	 * browser
	 * 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/tetianahatley/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//fullscreen()
		driver.get("https://www.facebook.com");

		// months
		WebElement month = driver.findElement(By.id("month"));
		Select obj = new Select(month);
		List<WebElement> allOptions = obj.getOptions();
		obj.selectByVisibleText("Mar");
		System.out.println(allOptions.size() - 1);

		// days
		WebElement days = driver.findElement(By.id("day"));
		Select obj1 = new Select(days);
		List<WebElement> allOptions1 = obj1.getOptions();
		obj1.selectByVisibleText("9");
		System.out.println(allOptions1.size() - 1);

		// years
		WebElement year = driver.findElement(By.id("year"));
		Select obj2 = new Select(year);
		List<WebElement> allOptions2 = obj2.getOptions();
		obj2.selectByVisibleText("1987");
		System.out.println(allOptions2.size() - 1);

		Thread.sleep(3000);
		driver.quit();
	}

}
