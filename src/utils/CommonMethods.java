package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public static WebDriver driver;

	public static void setUpDriver(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			// For mac
			System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
			// for windows
			// System.setProperty("webdriver.chrome.driver",
			// "src/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(url);
		
	}

	public static void selectValueFromDD(WebElement element, String text) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String optionText = option.getText();
			if (optionText.equals(text)) {
				select.selectByVisibleText(text);
				break;
			} else {
				System.out.println("Option with text " + text + " is not available");
			}
		}
	}

	public static void selectValueFromDD(WebElement element, int index) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		if (options.size() > index) {
			select.selectByIndex(index);
		} else {
			System.out.println("Invalid index has been passed");
		}
	}

	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
}

//////////////////////////////////////////////////////////////
///**********************************************************
// * 
// * @param element
// * @param text
// * Below is for Sending Keys
// **********************************************************/
//    public static void sendText(WebElement element, String text) {
//        element.clear();
//        element.sendKeys(text);
//    }
//    
//    /**********************************************************
//     * 
//     * @param element
//     * @param broswer
//     * Below is for browserSetUp
//     **********************************************************/
//    
//    public static void browserSetUp(String broswer, String URL) {
//        if(broswer.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
//            driver=new ChromeDriver();
//        }else if(broswer.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "/Users/Syntax/Selenium/geckodriver");
//            driver=new FirefoxDriver();
//        }
//        driver.get(URL);
//    }
//    
//    /**********************************************************
//     * 
//     * @param element
//     * @param broswer
//     * Below is for selectByValue
//     **********************************************************/
//    
//    public static void selectByValue(WebElement element,String value) {
//         name=new Select(element);
//        List<WebElement> list=name.getOptions();
//        for(WebElement ele:list) {
//            System.out.println(ele.getText());
//            if(value.equals(ele.getAttribute("value"))) {
//                 name.selectByValue(value);
//            }
//        }
//    }
//    
//    /**********************************************************
//     * 
//     * @param element
//     * @param broswer
//     * Below is for selectByIndex
//     **********************************************************/
//    
//    public static void selectByIndex(WebElement element, int index) {
//        name=new Select(element);
//        List<WebElement> ele=name.getOptions();
//        for(WebElement option:ele) {
//            System.out.println(option.getText());
//            if(ele.size()>index) {
//                name.selectByIndex(index);
//            }
//
//
