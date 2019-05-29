package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class RadioDemo extends  CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("Chrome", "https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().fullscreen();
		//driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio = driver.findElement(By.id("sex-0"));
		System.out.println(maleRadio.isDisplayed());// true
		System.out.println(maleRadio.isEnabled());// true
		System.out.println(maleRadio.isSelected());// false
		// 1 way of clicking on the element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());// true
		Thread.sleep(2000);
		driver.quit();

		// 2 way - preffered way
		String valueToSelect = "Automation Tester";
		List<WebElement> professionList = driver.findElements(By.name("profession"));

		System.out.println(professionList.size());

		for (WebElement profession : professionList) {
			System.out.println(profession.getSize());

			if (profession.isEnabled()) {
         //System.out.println(profession.getSize());
				String value = profession.getAttribute("value");
				System.out.println(value);

				if (value.equals(valueToSelect)) {
					profession.click();
				}
			}
		}
		Thread.sleep(3000);
		//driver.quit();
	}
}