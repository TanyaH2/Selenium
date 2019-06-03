package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

/*
 * TC 12356 - search flight verification
 * Step 1: Navigate to URL
 * Step 2: Enter details
 * Step 3: Verify search is succesfull
 */
public class FlightSearchTask extends CommonMethods {

//	public static void main(String[] args) {

	String browser = "chrome";
	String url = "http://www.aa.com/homePage.do";

	@BeforeMethod
	public void setUp() {
		setUpDriver(browser, url);
	}

	@Test
	public void searchFlight() throws InterruptedException {
		
		// enter to and from
		sendText(driver.findElement(By.name("originAirport")), "DCA");
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		
		// click on calendar icon
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
		// grab element that holds month & year
		WebElement depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));

		while (!depMonth.getText().contains("October")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			// if we wont perform this action we will get
			// StaleElementReferenceException: stale element reference: element is not
			// attached to the page document
			depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		}
		// capturing all cell and then loop and search for specific date
		List<WebElement> depCells = driver.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for (WebElement cell : depCells) {
			if (cell.getText().equals("18")) {
				cell.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")).click();

		// select arrival as December 24
		while (true) {
			String monthYearShowing = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-right')]/div")).getText();

			if (monthYearShowing.equals("December 2019")) {
				break;

			} else {
				WebElement button = driver.findElement(By.xpath(
						"//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/a"));
				button.click();
			}

		}

		calendarDateSelection(driver.findElements(By.xpath("//div[contains(@class, 'group-last')]/table/tbody/tr/td")),
				"24");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void tearDow() {
		driver.close();
	}

}

//}
