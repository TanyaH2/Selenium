package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorkTestCaseFire {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/tetianahatley/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().fullscreen();

		// name
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement name = driver.findElement(By.cssSelector("input[name='firstname'] "));
		name.sendKeys("Tanya");

		// lastName
		WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname'] "));
		lastName.sendKeys("Hatley");

		// Sex
		String valueToSelect = "Female";
		List<WebElement> sexList = driver.findElements(By.name("sex"));
		System.out.println(sexList.size());
		for (WebElement sList : sexList) {
			if (sList.isEnabled()) {
				System.out.println("Sex radio buttons ARE enabled");
				String value = sList.getAttribute("value");
				System.out.println(value);
				if (value.equals(valueToSelect)) {
					sList.click();
				}
			}
		}

		// Experience - Check all Years of Experience radio buttons are clickable
		List<WebElement> exp = driver.findElements(By.name("exp"));
		System.out.println(exp.size());
		for (WebElement expList : exp) {
			if (expList.isEnabled()) {
				expList.click();
				System.out.println("Experience radio buttons are clickable");
			} else {
				System.out.println("Experience radio buttons NOT clickable");
			}
		}
		
		// Date
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("05/19/2019");

		// Profession -Select both checkboxes for profession
		List<WebElement> prof = driver.findElements(By.name("profession"));
		for (WebElement pro : prof) {
			if (pro.isEnabled()) {
				pro.click();
			}
		}

		// Tools -Check all Automation Tools checkboxes are clickable and keep “Selenium
		// WebDriver” option as selected
		String valueSet1 = "Selenium Webdriver";
		List<WebElement> tool = driver.findElements(By.name("tool"));
		for (WebElement tools : tool) {
			if (tools.isEnabled()) {
				tools.click();
			}
		}
		for (WebElement tools : tool) {
			String value = tools.getAttribute("value");
			if (!value.equals(valueSet1)) {
				tools.click();
			}
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
