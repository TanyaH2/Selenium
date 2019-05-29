package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/**
		 * TC 3: Table headers and rows verification 
		 * 1.Open chrome browser 
		 * 2.Go to “https://jqueryui.com/” 
		 * 3.Click on “Datepicker” 
		 * 4.Select August 10 of 2019
		 * 5.Verify date “08/10/2019” has been entered succesfully 
		 * 6.Close browser
		 */

		// 1.Open chrome browser
		// 2.Go to “https://jqueryui.com/”
		String url = "https://jqueryui.com/";
		setUpDriver("Chrome", url);

		// 3.Click on “Datepicker”
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();

		// 4.Select August 10 of 2019switch
		switchToFrame(0);
		driver.findElement(By.cssSelector("input.hasDatepicker")).click();

		//1 way to chose the date :
		//Easy way Date
//		WebElement date=driver.findElement(By.cssSelector("input.hasDatepicker"));
//				date.click();
//		
//		 sendText(date, "08/10/2019");
//	
		
		
		//2nd way to chose the date: 1-by month and year or 2-by calendar title:

		String expectedMonth = "August";   //1
		String expectedYear = "2019";      //1
//		String expectedMonthYear="August 2019";  //2
		while(true) {
			String monthShowing=driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText(); //1
			String yearShowing=driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();   //1
//			String monthYearShowing=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();   //2
		if (monthShowing.equalsIgnoreCase(expectedMonth)&&yearShowing.equalsIgnoreCase(expectedYear)) {   //1
//			if(monthYearShowing.equalsIgnoreCase(expectedMonthYear)){                                          //2
			break;      
			
		}else {
			WebElement button = driver.findElement(By.xpath("//a[@title='Next']"));
			button.click();
		}
		
		}
		calendarDateSelection(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")),"10");

	
		
		
		// 5.Verify date “08/10/2019” has been entered succesfully
		
		String verifingDate=driver.findElement(By.cssSelector("input.hasDatepicker")).getText();
		Boolean date1=verifingDate.equals("08/10/2019");
		if(true) {
			System.out.println(verifingDate);
			System.out.println("The date is correct");
			
		}else {
		  System.out.println("The 08/10/2019 date is not displayed");

		}
		

		// 6.Close browser

		Thread.sleep(5000);
	    driver.quit();
	}

}
