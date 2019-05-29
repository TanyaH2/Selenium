package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task2Manel extends CommonMethods {
	    public static void main(String[] args) {
	        // logging in and registering for the program
	        setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");
	        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
	        driver.findElement(By.xpath("//input[@class='button']")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
	        Select select = new Select(driver.findElement(By.cssSelector("select#ctl00_MainContent_fmwOrder_ddlProduct")));
	        select.selectByIndex(1);
	        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("567");
	        driver.findElement(By.xpath("//input[@class='btn_dark']")).click();
	        
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']")).sendKeys("Sydney White");
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']")).sendKeys("123 Main Street");
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")).sendKeys("Chantilly");
	        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys("VA");
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']")).sendKeys("20147");
	        
	        
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$cardList']")).click();
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")).sendKeys("349784398742893");
	        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")).sendKeys("03/25");
	        driver.findElement(By.xpath("//a[@class='btn_light']")).click();
	        driver.findElement(By.xpath("//a[text()='View all orders']")).click();
	        // Getting rows/columns from table
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/th"));
	        // verifying information
	        String expectedName = "Sydney White";
	        String expectedQuantity = "567";
	        String expectedAddress = "123 Main Street";
	        String updatedAddress = "125 Main Street";
	        String expectedCity = "Chantilly";
	        String expectedState = "VA";
	        String expectedZip = "20147";
	        String expectedCard = "Visa";
	        String expectedCardNum = "349784398742893";
	        String expectedExpiration = "03/25";
	        for (int i = 1; i <= rows.size(); i++) {
	            String rowText = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]"))
	                    .getText();
	            if (rowText.contains(expectedName)) {
	                if (rowText.contains(expectedQuantity)) {
	                    if (rowText.contains(expectedAddress)) {
	                        if (rowText.contains(expectedCity)) {
	                            if (rowText.contains(expectedState)) {
	                                if (rowText.contains(expectedZip)) {
	                                    if (rowText.contains(expectedCard)) {
	                                        if (rowText.contains(expectedCardNum)) {
	                                            if (rowText.contains(expectedExpiration)) {
	                                                driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["
	                                                        + i + "]/td/input[@alt='Edit']")).click();
	                                                driver.findElement(By
	                                                        .xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"))
	                                                        .clear();
	                                                driver.findElement(By
	                                                        .xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"))
	                                                        .sendKeys("125 Main Street");
	                                                driver.findElement(
	                                                        By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']"))
	                                                        .click();
	                                                driver.findElement(By.xpath("//a[text()='View all orders']")).click();
	                                                String rowText2 = driver
	                                                        .findElement(By.xpath(
	                                                                "//table[@class='SampleTable']/tbody/tr[" + i + "]"))
	                                                        .getText();
	                                                if (rowText2.contains(updatedAddress)) {
	                                                    System.out.println("I made it");
	                                                    
	                                                }
	                                            }
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        driver.close();
	    }
	}
	