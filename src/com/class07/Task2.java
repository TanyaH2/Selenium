package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Task2 extends CommonMethods {
	/**
	 * Ahead to http://uitestpractice.com/Students/Switchto 
	 * Get the parent title 
	 * Get the parentId print the parent title and parentId 
	 * Click on the open in a new window 
	 * Get the child title 
	 * Get the childId print the child title and childId
	 * close the child window
	 * 
	 * 
	 * CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent =driver.getTitle();
		String parentId= driver.getWindowHandle();
		System.out.println("title: "+parent+" "+" ID: "+parentId);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		child=driver.getTitle();
		String childId= driver.getWindowHandle();
		System.out.println("title: "+child+" "+" ID: "+childId);
		driver.switchTo().window(parent);
	 * @param args
	 */
	public static void main(String[] args) {
		

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent =driver.getTitle();
		String parentId= driver.getWindowHandle();
		System.out.println("title: "+parent+" "+" ID: "+parentId);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		child=driver.getTitle();
		String childId= driver.getWindowHandle();
		System.out.println("title: "+child+" "+" ID: "+childId);

		
		driver.close();
		driver.switchTo().window(parent);
		driver.close();
		
	}

}
