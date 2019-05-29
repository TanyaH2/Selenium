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
		
		//2.Login to the application
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), "Tester");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), "test");
		driver.findElement(By.cssSelector("input.button")).click();
		
		//3.Create an Order
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		selectValueFromDD(driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct")),"FamilyAlbum");
		sendText(driver.findElement(By.xpath("//input[@onchange='productsChanged()']")), "13");
		driver.findElement(By.cssSelector("input[value='Calculate']")).click();
		
		sendText(driver.findElement(By.cssSelector("input[name$='$txtName']")), "Arya Stark");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")), "1145 Winterfell Dr.");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox3")), "North");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox4")), "NW");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox5")), "73009");
		
 		radioButton(driver.findElements(By.cssSelector("label[for*='cardList']")), "MasterCard");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")), "4335678976330900");
		sendText(driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")), "12/20");
        driver.findElement(By.cssSelector("a.btn_light")).click();
        driver.findElement(By.xpath("//a[@class='btn_light']")).click();
        
        //4.Verify order of that person is displayed in the table “List of All Orders”
        driver.findElement(By.xpath("//a[text()='View all orders']")).click();
        
        dataCheck(driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td")), "Arya Stark");
//        List<WebElement> cells=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));	
//        String expected="Arya Stark";
//		for (WebElement cell: cells) {
//			String cellText=cell.getText();
//			System.out.println(cellText);
//			if(cellText.equalsIgnoreCase(expected)) {
//				System.out.println("Your order is displayed");
//			}
//		}
		
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}