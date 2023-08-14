package org.runner_cls;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\opencart\\OpenCart.feature",glue = "org.step_def")
//dryRun = true,
//monochrome= false,
//tags = "@Tag1")

public class OpenCart_Runner_Class {
	public static  WebDriver driver;
	
	@BeforeClass
	
	public static void start(){
		
		ChromeOptions q = new ChromeOptions();
	    q.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		
	}
	
	
	
	
	
	
	
	
	//@Given("get URL from opencart")
	//public void get_url_from_opencart() {
//		url(driver, "https://www.opencart.com/index.php?route=cms/feature");  
	//}
	//@Given("maximize the window")
	//public void maximize_the_window() {
//		maxi(driver);
	//}  
	//@When("user click the Admin")
	//public void user_click_the_admin() {
	//   op.getAdmin().click();
	//}
	//@When("user click the UnlimitedEverything")
	//public void user_click_the_unlimited_everything() {
	//   op.getUnlimitedEverything().click();
	//}
	//@When("user click the Customer")
	//public void user_click_the_customer() {
//	    op.getCustomer().click();
	//}
	//@When("user click the Shoping")
	//public void user_click_the_shoping() {
//	    op.getShoping().click();
	//}
	//@When("user click the Extension")
	//public void user_click_the_extension() {
//	    op.getExtension().click();
	//}
	//@When("user click the Mobile")
	//public void user_click_the_mobile() {
//	    op.getMobile().click();
	//}
	//@When("user click the Developer")
	//public void user_click_the_developer() {
//	    op.getDeveloper().click();
	//}
	//jse.excuteScript("window.scrollBy(true)");
	//jse.excuteScript("window.scrollBy(false)");


}
