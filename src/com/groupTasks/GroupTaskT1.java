package com.groupTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class GroupTaskT1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * TC 1: Users Application Form Fill 
		 * 
		 * 1.Open chrome browser 
		 * 2.Go to “http://uitestpractice.com/” 
		 * 3.Click on “Forms” link 
		 * 4.Fill out the entire form 
		 * 5.Close the browser
		 * 
		 * MUST USE Functions:
		 */
		
		// 1.Open chrome browser
		// 2.Go to “http://uitestpractice.com/”
		String url = "http://uitestpractice.com/";		
		setUpDriver("chrome", url);

		// 3.Click on “Forms” link
		driver.findElement(By.xpath("//a[text()='Form']")).click();

		// 4.Fill out the entire form:
		// First Name
		sendText(driver.findElement(By.cssSelector("input#firstname")), "John");

		// LastName
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Snow");

		// Radio Button MS
		radioButton(driver.findElements(By.cssSelector("label.radio-inline")), "Married");

		// Check Box Hobby
		checkBox(driver.findElements(By.cssSelector("label.checkbox-inline")), "Dancing", "Reading");

		// Country
		WebElement optionToChoose = driver.findElement(By.cssSelector("select#sel1"));
		selectValueFromDD(optionToChoose, "Bahrain");

		// Date Of Birth
		WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
		date.click();
		// sendText(date, "05/27/2019");

		WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		selectValueFromDD(month, 2);// month

		WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		selectValueFromDD(year, "2019");// year

		calendarDateSelection(driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td")),"13");
		

		// Phone Number
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Enter PhoneNumber']"));
		sendText(phone, "(703)667-3387");

		// User Name
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter UserName']"));
		sendText(userName, "Targarien");

		// Email
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']"));
		sendText(email, "stark@winter.com");

		// About Yourself
		WebElement info = driver.findElement(By.xpath("//textarea[@rows='5']"));
		sendText(info, "Hello My Name is John Snow");

		// Password
		WebElement password = driver.findElement(By.cssSelector("input#pwd"));
		sendText(password, "darewolf");

		// Submit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
		// 5.Close the browser
		driver.quit();
	}

}

