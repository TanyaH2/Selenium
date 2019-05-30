package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/**
		 * TC 2: Table headers and rows verification
		 * 1.Open browser and go to:
		 *   “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 * 2.Login to the application
		 * 3.Create an Order
		 * 4.Verify order of that person is displayed in the table “List of All Orders”
		 * 5.Click on edit of that specific order
		 * 6.Verify each order detail
         * 7.Update street address
         * 8.Verify in the table that street has been updated
		 * 9.Close browser
		 */
		// 1.Open browser and go to:
		// “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);

		String Product="FamilyAlbum";
        String Quantity = "77";
        
        String Name = "Arya Stark";
        String Street = "1145 Winterfell Dr.";
        String City = "North";
        String State = "NW";
        String Zip = "73009";
        
        String Card = "MasterCard";
        String CardNum = "4335678976330900";
        String Expiration = "12/20";
        
		// 2.Login to the application
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), "Tester");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), "test");
		driver.findElement(By.cssSelector("input.button")).click();

		// 3.Create an Order
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		selectValueFromDD(driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct")), Product);
		sendText(driver.findElement(By.xpath("//input[@onchange='productsChanged()']")), Quantity);
		driver.findElement(By.cssSelector("input[value='Calculate']")).click();

		sendText(driver.findElement(By.cssSelector("input[name$='$txtName']")), Name);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")), Street);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox3")), City);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox4")), State);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox5")), Zip);

		radioButton(driver.findElements(By.cssSelector("label[for*='cardList']")), Card);
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")), CardNum);
		sendText(driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")), Expiration);
		driver.findElement(By.cssSelector("a.btn_light")).click();
		driver.findElement(By.xpath("//a[@class='btn_light']")).click();

		// 4.Verify order of that person is displayed in the table “List of All Orders”
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
	
		dataCheck(driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td")), "Arya Stark");

		// 5.Click on edit of that specific order
		driver.findElement(By.xpath("//table[contains(@id,'Content_order')]/tbody/tr[2]/td[13]")).click();

		//6.Verify each order detail
	     orderDataCheck(driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct")), "FamilyAlbum");
	     orderDataCheck(driver.findElement(By.xpath("//input[@onchange='productsChanged()']")), "77");
	     orderDataCheck(driver.findElement(By.cssSelector("input[name$='$txtName']")), "Arya Stark");
	     orderDataCheck(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")),"1145 Winterfell Dr.");
	     orderDataCheck(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox3")), "North");
	     orderDataCheck(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox4")), "NW");
	     orderDataCheck(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox5")), "73009");
	     radioButtonCheck(driver.findElements(By.cssSelector("label[for*='cardList']")), "MasterCard");  
	     orderDataCheck(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")), "4335678976330900");
	     orderDataCheck(driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")), "12/20");
		
	     // 7.Update street address
	     String newAddress="563 Wall Str.";
	     sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")), newAddress);
	     driver.findElement(By.cssSelector("a.btn_light")).click();
	     //8.Verify in the table that street has been updated
	     dataCheck(driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td")), newAddress);
	 
		driver.quit();
	}
}