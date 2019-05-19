package com.class04;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class XPathWithForLOOP {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
			//WebElement element = driver.findElement(By.xpath("//input[@id='sex-0']"));
	        //element.submit();
			List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
			for(int i=0;i<radio.size();i++) {
				System.out.println(radio.size());
				String listofRadiobuttons =radio.get(i).getAttribute("value");
				System.out.println(listofRadiobuttons);
				radio.get(i).click();
			}
			
			//element.sendKeys("hello");
			//String st = driver.findElement(By.xpath("//span[text()='Share with Facebook']")).getText();
			
			//System.out.println(attribute);

		}

	}