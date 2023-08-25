package org.opencart.OpenCart_Demo_New;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenCar_BaseClass {

	public static WebDriver driver;

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

	public static void js_scroll(WebDriver driver, WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", element);
	}

	
//	public static void move_to_element(WebDriver driver, WebElement element) {
//		Actions element1ction = new element1ctions(driver);
//		action.moveToElement(ele).build().perform();
//		
//	}
	
//	public static void element1ction_click(WebDriver driver, WebElement element) {
//		Actions element1ction = new element1ctions(driver);
//		action.click().build().perform();
//		
//	}
	
	//click
	
	public static void js_Click(WebDriver driver, WebElement element1) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element1);
		
	}
	//screenshort
		
	public static void snap(WebDriver driver, String picname) throws IOException {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\OpenCart_Demo_New\\screenshort" + picname + ".png");
			FileUtils.copyFile(source, destination);
			}
	//DropDown_value
			
			public static void selectby_value(WebElement element1, String value) {
				Select s =new Select (element1);
				s.selectByValue (value);
			}

	//DropDown_Visible
			
			public static void selectby_visibletxt(WebElement element1, String value) {
				Select s1= new Select (element1);
				s1.selectByVisibleText (value);	
			}
			
	//DropDown_index
			
			public static void selectby_index(WebElement element1, int index) {
				Select s2=new Select (element1);
				s2.selectByIndex(index);
			}

    // implecty wait

//    public static void toHold(int second) {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
//    }

    public static void toHold( int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));


    }
    //close
			public static void close(WebDriver driver) {
				driver.close();
		
		
		
		
}	

}
