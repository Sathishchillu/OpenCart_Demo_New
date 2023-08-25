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
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver();
		
	}
	


}

