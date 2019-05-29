package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TableHeadersAndRowsTasdk1 extends CommonMethods{
/*
 * TC 1: Table headers and rows verification

Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows
 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
	driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List<WebElement>rows =driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(rows.size());
		
		for(WebElement textrow:rows) {
			System.out.println(textrow.getText());
		}
		
		
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(cols.size());
		
		for (WebElement textCols: cols) {
		String a=textCols.getText();
		System.out.println(a);
		}
		
	Thread.sleep(3000);
	driver.quit();
	}



}
