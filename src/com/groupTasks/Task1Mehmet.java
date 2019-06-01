package com.groupTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task1Mehmet extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

//		Navigate to Website
		String URL = "http://uitestpractice.com/";
		setUpDriver("Chrome", URL);

//		Click Form Link
		driver.findElement(By.linkText("Form")).click();

//		Fill the form out
		findingElement("cssSelector", "input#firstname", "Muhammad");
		findingElement("cssSelector", "input#lastname", "Ali");

//		checks radio buttons
		radioButtons("optradio");

//		checks check boxes and click dancing
		checkBoxes("dance");

//		Select country
		SelectCountry("Belarus");

//		Select Birth date
		SelectBirthDate("September", "5", "2000");

//		Fill the form out
		findingElement("cssSelector", "input#phonenumber", "8657459965");
		findingElement("cssSelector", "input#username", "MuhAli");
		findingElement("cssSelector", "input#email", "MuhAli@gmail.com");
		findingElement("cssSelector", "textarea#comment", "I'm live in Burke but i want to move to Fairfax");
		findingElement("cssSelector", "input#pwd", "MuhAli1234");

//		driver.findElement(By.cssSelector("button.btn.btn-default ")).click();

	}

////////MEHMET//////////////////////////////////////////////

	/**
	 * finding elements
	 * 
	 * @param locator
	 * @param path
	 * @param SendKeyValue
	 */
	public static void findingElement(String locator, String path, String SendKeyValue) {
		if (locator.equalsIgnoreCase("cssSelector")) {
			driver.findElement(By.cssSelector(path)).sendKeys(SendKeyValue);
		}
		if (locator.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(path)).sendKeys(SendKeyValue);
		}
		if (locator.equalsIgnoreCase("id")) {
			driver.findElement(By.id(path)).sendKeys(SendKeyValue);
		}
		if (locator.equalsIgnoreCase("className")) {
			driver.findElement(By.className(path)).sendKeys(SendKeyValue);
		}
		if (locator.equalsIgnoreCase("name")) {
			driver.findElement(By.name(path)).sendKeys(SendKeyValue);
		}
	}

	/**
	 * check radio buttons
	 * 
	 * @param nameOfButtons
	 */
	public static void radioButtons(String nameOfButtons) {
		List<WebElement> rbList = driver.findElements(By.name(nameOfButtons));
		for (WebElement buttons : rbList) {
			if (buttons.isEnabled()) {
				buttons.click();
			}
		}
	}

	/**
	 * Checks checkboxes
	 * 
	 * @param WantToClick
	 */
	public static void checkBoxes(String WantToClick) {
		List<WebElement> cbList = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (WebElement boxes : cbList) {
			if (boxes.isEnabled()) {
				boxes.click();
				String Value = boxes.getAttribute("value");
				System.out.println(Value);
				if (!Value.equalsIgnoreCase(WantToClick)) {
					boxes.click();
				}
			}
		}
	}

	/**
	 * makes country selection
	 * 
	 * @param country
	 */
	public static void SelectCountry(String country) {
		WebElement CountrySelect = driver.findElement(By.cssSelector("select#sel1"));
		Select select = new Select(CountrySelect);
		select.selectByVisibleText(country);
	}

	/**
	 * This method selects Birth day from dropdown and table
	 * 
	 * @param Month, Day, Year
	 */
	public static void SelectBirthDate(String Month, String Day, String Year) {

//Find element and click on it
		Actions action = new Actions(driver);
		WebElement DatePicker = driver.findElement(By.cssSelector("input#datepicker"));
		action.moveToElement(DatePicker).click().perform();

//two time click next button
		driver.findElement(By.cssSelector("a[title='Next']")).click();
		driver.findElement(By.cssSelector("a[title='Next']")).click();

//Select month from dropdown
		WebElement SelectMonth = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select MonthSelect = new Select(SelectMonth);

//Cut the month name to select		
		String Monthsubstr = Month.substring(0, 3);
		MonthSelect.selectByVisibleText(Monthsubstr);

//Select year
		WebElement SelectYear = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select YearSelect = new Select(SelectYear);
		YearSelect.selectByVisibleText(Year);

//Select day from web table
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement col : cols) {
			String text = col.getText();
			if (text.contains(Day)) {
				col.click();

			}
		}

	}
}

//////////////////////////////////////////////////////////////