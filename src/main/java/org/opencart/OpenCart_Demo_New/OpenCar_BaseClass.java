package org.opencart.OpenCart_Demo_New;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenCar_BaseClass {

	public WebDriver driver;

	public static void url(WebDriver driver, String s) {
		driver.get(s);
	}

	public static void maxi(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void login(WebElement feature) {
		feature.click();
	}
	
	//scroll

	public static void js(WebDriver driver, WebElement ele) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", ele);
	}

	
//	public static void move_to_element(WebDriver driver, WebElement ele) {
//		Actions action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
//		
//	}
	
//	public static void action_click(WebDriver driver, WebElement ele) {
//		Actions action = new Actions(driver);
//		action.click().build().perform();
//		
//	}
	
	//click
	
	public static void js_Click(WebDriver driver, WebElement ele1) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele1);
		
	}
	//screenshort
		
	public static void snap(WebDriver driver, String picname) throws IOException {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\OpenCart_Demo_New\\screenshort" + picname + ".png");
			FileUtils.copyFile(source, destination);
			}
	//DropDown_value
			
			public static void DropDown_value(WebElement a, String b) {
				Select s =new Select(a);
				s.selectByValue(b);
			}

	//DropDown_Visible
			
			public static void DropDown_visibletxt(WebElement a, String b) {
				Select s1= new Select(a);
				s1.selectByVisibleText(b);	
			}
			
	//DropDown_index
			
			public static void DropDown_index(WebElement a, int i) {
				Select s2=new Select(a);
				s2.selectByIndex(i);
			}

			
	//close
			public static void close(WebDriver driver) {
				driver.close();
		
		
		
		
}	

}
