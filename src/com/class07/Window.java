package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.CommonMethods;

public class Window extends CommonMethods {

	/**
	 * 1. identify parent id
     * 2. get windowHandles()
     * 3. using iterator loop through all elements in set
     * 4. using if check if childId is not matching parentId --> then switch to that child ID
     * 5. get title of an ID and then close child window
     * 6. switch back control to the parent window
     * 7 repeat steps 2-6 .
     * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.switchTo().window(parent);

	}

}
//		 //class MultipleWindowsClass extends CommonMethods{
//
//			//public void testMultipleWindows() throws InterruptedException {
//				
//
//				// To open browser
//				CommonMethods.setUpDriver("chrome", "http://www.naukri.com/");
//
//				// To maximize browser
//				driver.manage().window().maximize();
//
//				// To open Naukri website with multiple windows
//				//driver.get("http://www.naukri.com/");
//
//				// It will return the parent window name as a String
//				String mainWindow = driver.getWindowHandle();
//
//				// It returns no. of windows opened by WebDriver and will return Set of Strings
//				Set<String> set = driver.getWindowHandles();
//
//				// Using Iterator to iterate with in windows
//				Iterator<String> itr = set.iterator();
//				while (itr.hasNext()) {
//					String childWindow = itr.next();
//
//					// Compare whether the main windows is not equal to child window. If not equal,
//					// we will close.
//					if (!mainWindow.equals(childWindow)) {
//						driver.switchTo().window(childWindow);
//						System.out.println(driver.switchTo().window(childWindow).getTitle());
//						driver.close();
//					}
//				}
//				// This is to switch to the main window
//				driver.switchTo().window(mainWindow);
//			}
//		
//	}
