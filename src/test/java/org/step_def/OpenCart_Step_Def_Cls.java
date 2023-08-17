package org.step_def;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.opencart.OpenCart_Demo_New.OpenCar_BaseClass;
import org.opencart.OpenCart_Demo_New.OpenCart_PomClass;
import org.openqa.selenium.WebDriver;
import org.runner_cls.OpenCart_Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCart_Step_Def_Cls extends OpenCar_BaseClass {
public static WebDriver driver = OpenCart_Runner_Class.driver;
public static OpenCart_PomClass op = new OpenCart_PomClass(driver);



@Given("get URL from opencart")
public void get_url_from_opencart() {
	url(driver, "https://www.opencart.com/index.php?route=cms/feature");  
}
@Given("maximize the window")
public void maximize_the_window() {
	maxi(driver);
}
@When("user click the Admin")
public void user_click_the_admin() throws InterruptedException {
	op.getAdmin().click();
	js_scroll(driver, op.getScroll5());
	Thread.sleep(1000);
	
}
@When("user click the UnlimitedEverything")
public void user_click_the_unlimited_everything() {
//	op.getUnlimitedEverything().click();
	js_Click(driver,op.getUnlimitedEverything());
	js_scroll(driver,op.getScrollup());
}
@When("user scroll down")
public void user_scroll_down() throws InterruptedException {

	Thread.sleep(1000);
	js_scroll(driver, op.getScroll());
	Thread.sleep(1000);
	
}
@When("user click the Customer")
public void user_click_the_customer() throws InterruptedException {
//	op.getCustomer().click();
	js_Click(driver, op.getCustomer());
	js_scroll(driver,op.getScrollup1());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll1());
	Thread.sleep(1000);
    
}


@When("user click the Shipping")
public void user_click_the_shipping() throws InterruptedException {
	js_Click(driver, op.getShipping());
	js_scroll(driver,op.getScrollup2());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll2());
	Thread.sleep(1000);	
}


@When("user click the Extension")
public void user_click_the_extension() throws InterruptedException {
//	op.getExtension().click();
	js_Click(driver,op.getExtension());
	js_scroll(driver,op.getScrollup3());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll3());
	Thread.sleep(1000); 
}


@Given("user click the Mobile")
public void user_click_the_mobile() throws InterruptedException {
//	op.getMobile().click();
	js_Click(driver,op.getMobile());
	js_scroll(driver,op.getScrollup4());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll4());
	Thread.sleep(1000);
}


@Given("user click the Developer")
public void user_click_the_developer() throws InterruptedException {
//	op.getDeveloper().click();
	js_Click(driver, op.getDeveloper());
	js_scroll(driver,op.getScrollup5());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll5());
	Thread.sleep(1000);
	js_Click(driver, op.getAd());
	js_scroll(driver,op.getScrollup6());
}




//  Tag2


@When("user click an Demo")
public void user_click_an_demo() {
	
     js_Click(driver, op.getDemo());
}

@When("user click an Store Front")
public void user_click_an_store_front() throws InterruptedException {
	
	js_Click(driver, op.getStorefront());
	
	Set<String> tab0 = driver.getWindowHandles();
	Iterator<String> dom = tab0.iterator();
	String parent0 = dom.next();
	String child0 = dom.next();
	driver.switchTo().window(child0);
	js_scroll(driver, op.getScroll7());
	Thread.sleep(1000);
}


@When("user click an macbook")
public void user_click_an_macbook() throws InterruptedException {
	
	js_Click(driver, op.getMacbook());
	Thread.sleep(1000);	
}


@When("user click an Desktop")
public void user_click_an_desktop() throws InterruptedException {
	js_Click(driver, op.getHome());
	Thread.sleep(1000); 
}


@When("user click an laptops and notebooks")
public void user_click_an_laptops_and_notebooks() throws InterruptedException {
	
	js_Click(driver, op.getLaptop());
	Thread.sleep(1000);
	js_Click(driver, op.getShow());
	Thread.sleep(1000);
	js_Click(driver, op.getHome());
	Thread.sleep(1000);   
}


@When("user click an Components")
public void user_click_an_components() throws InterruptedException {
	
	js_Click(driver, op.getComponents());
	Thread.sleep(1000);
	js_Click(driver, op.getMonitor());
	Thread.sleep(1000);
	js_Click(driver, op.getMon());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll8());
	Thread.sleep(1000);
	js_Click(driver, op.getAddcart());
	js_Click(driver, op.getHome());
	Thread.sleep(1000);   
}


@When("user click an Tables")
public void user_click_an_tables() throws InterruptedException {
	
	js_Click(driver, op.getTable());
	Thread.sleep(1000);
	js_Click(driver, op.getSamsug());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll9());
	Thread.sleep(1000);
	js_Click(driver, op.getAddcart1());
	js_Click(driver, op.getHome());
	Thread.sleep(1000);
}


@When("user click an Software")
public void user_click_an_software() throws InterruptedException {
	
	js_Click(driver, op.getSoftware());
	Thread.sleep(1000);
	js_Click(driver, op.getHome());
	Thread.sleep(1000);
}


@When("user click an Phones and PDA")
public void user_click_an_phones_and_pda() throws InterruptedException {
	
	js_Click(driver, op.getPads());
	Thread.sleep(1000);
	js_Click(driver, op.getMob());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll10());
	Thread.sleep(1000); 
	js_Click(driver, op.getAddcart2());
	Thread.sleep(1000);
	driver.navigate().back(); 
	js_Click(driver, op.getIphone());
	driver.navigate().back();
	js_Click(driver, op.getPalm());
	js_Click(driver, op.getHome());
}	


@When("user click an Cameras")
public void user_click_an_cameras() throws InterruptedException {
	
	js_Click(driver, op.getCamara());
	js_Click(driver, op.getCanon());
	Thread.sleep(1000);
	driver.navigate().back();
	js_Click(driver, op.getNikon());
	Thread.sleep(1000);
	js_Click(driver, op.getHome());	
}


@When("user click an MP3 Players")
public void user_click_an_mp3_players() throws InterruptedException {
	
	js_Click(driver, op.getMp3());
	Thread.sleep(1000);
	js_Click(driver, op.getTest20());
	Thread.sleep(1000);
	js_Click(driver, op.getHome());   
	Set<String> tab3 = driver.getWindowHandles();
	Iterator<String> dom = tab3.iterator();
	String parent3 = dom.next();
	String child3 = dom.next();
	driver.switchTo().window(parent3);
}


//      Tag 3



@When("user click an MarketPlace")
public void user_click_an_market_place() throws InterruptedException {
	
	js_Click(driver, op.getMarketplace());
	Thread.sleep(1000);  
}


@When("user click an commercial")
public void user_click_an_commercial() throws InterruptedException {
    
	js_Click(driver, op.getCommerical());
	Thread.sleep(1000);
}


@When("user click an free")
public void user_click_an_free() throws InterruptedException {
	
	js_Click(driver, op.getFree());
	Thread.sleep(1000);
}


@When("user click an search")
public void user_click_an_search() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	op.getSearch().sendKeys("mobile");
	js_Click(driver, op.getSearchbutton());
	
// click by one and one
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getAll());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getMarketplc());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getThemes());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getLanguagesnew());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getPaymentGateways());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getShippingMethods());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getModules());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getOrderTotals());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getProductFeeds());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getReports());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getOther());
	js_scroll(driver, op.getScroll11());
	js_Click(driver, op.getVQMod());
	
	}


@When("user click an DropDownSortBy")
public void user_click_an_drop_down_sort_by() throws InterruptedException {
	
	js_scroll(driver, op.getScroll12());
	selectby_visibletxt(op.getAllclick(), "4.0.2.0");
	js_Click(driver, op.getMarketplc());
	Thread.sleep(2000);
	js_scroll(driver, op.getScroll13());
	Thread.sleep(2000);
	js_Click(driver, op.getOpencartpartners());
	js_scroll(driver, op.getScroll13());
	Thread.sleep(2000);
	js_Click(driver, op.getDevelopers());
	selectby_visibletxt(op.getRating(), "Rating");  
}


//Tag@4



@When("user click an Blog")
public void user_click_an_blog() {
	
	js_Click(driver, op.getBolg());
 }   


@When("user click an Articles")
public void user_click_an_articles() throws InterruptedException {
	
	js_Click(driver, op.getArticles());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	Thread.sleep(1000);
}


@When("user click an Announcements")
public void user_click_an_announcements() throws InterruptedException {
	
	js_Click(driver, op.getAnnouncements());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	Thread.sleep(1000);
}    


@When("user click an Tips")
public void user_click_an_tips() throws InterruptedException {
	
	js_Click(driver, op.getTips());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	Thread.sleep(1000);
 }   


@When("user click an SuccessStories")
public void user_click_an_success_stories() throws InterruptedException {
	
	js_Click(driver, op.getSuccessStories());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	Thread.sleep(1000);
 }  


@When("user click an VideoTutorials")
public void user_click_an_video_tutorials() throws InterruptedException {
	
	js_Click(driver, op.getVideoTutorials());
	Thread.sleep(1000);
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	Thread.sleep(1000);
}


@When("user click an Download")
public void user_click_an_download() {
	
	js_Click(driver, op.getDownload());  
}


@When("user click Scroll Down and Scroll Up")
public void user_click_scroll_down_and_scroll_up() throws InterruptedException {	
	
	js_scroll(driver, op.getScroll14());
	Thread.sleep(1000);
	js_scroll(driver, op.getScrollup7());
	
}	



//	Tag 5
	
	
	@When("user click an Resource")
	public void user_click_an_resource() throws InterruptedException {
		
		js_Click(driver, op.getResources());								
		Thread.sleep(1000);   
	}
	
	
	@When("user click an Showcase")
	public void user_click_an_showcase() throws InterruptedException {
		
		js_Click(driver, op.getShowcase());									
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll15());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());
		Thread.sleep(1000);
		js_Click(driver, op.getResources());								
		Thread.sleep(1000);
	}
	
	
	@When("user click an ContactUs")
	public void user_click_an_contact_us() throws InterruptedException {
		
		js_Click(driver, op.getContactUs());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll16());
		Thread.sleep(1000);
	    selectby_visibletxt(op.getHelp(),"I have a partnership question");
		Thread.sleep(1000);
		op.getName().sendKeys("chillu");
		Thread.sleep(1000);
		op.getEmail().sendKeys("sathishsms333@gmail");
		Thread.sleep(1000);
//		op.getCompanyName().sendKeys("asdfghjk");
//		Thread.sleep(1000);
//		op.getInput_website().sendKeys("asdfg");
//		Thread.sleep(1000);
//		op.getPhone_1().sendKeys("1234567890");
//		selectby_visibletxt(op.getDropdown_country(), "Angola");
//		Thread.sleep(1000);
		op.getMessage().sendKeys("how are you");
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());
	}
	
	
	@When("user click an OpenCart_Part")
	public void user_click_an_open_cart_part() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getOpenCart_Part());							
		Thread.sleep(1000);
		selectby_visibletxt(op.getDropdown_control(), "India (14)");
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll17());
		Thread.sleep(1000);
		js_Click(driver, op.getDevelopment_Partner());
		Thread.sleep(1000);
		js_Click(driver, op.getHosting_Partner());
		Thread.sleep(1000);
		js_Click(driver, op.getPayment_Partner());
		Thread.sleep(1000);
		js_Click(driver, op.getOpenCart_Certified());
		Thread.sleep(1000);
		js_Click(driver, op.getPremium_Partner());
		Thread.sleep(1000);
		js_Click(driver, op.getPartner());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());
	}
	
	
	@When("user click an Community Forums")
	public void user_click_an_community_forums() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                //4
		Thread.sleep(1000);
		js_Click(driver, op.getCommunity_Forums());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll18());
		Thread.sleep(1000);
		js_Click(driver, op.getUnanswered_topics());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll19());
		Thread.sleep(1000);
		selectby_visibletxt(op.getDropdown_day(), "1 month");
		Thread.sleep(1000);
		selectby_visibletxt(op.getDropdown_topictitle(), "Topic title");
		Thread.sleep(1000);
		selectby_visibletxt(op.getDropdown_ascending(), "Ascending" );
		Thread.sleep(1000);
		js_Click(driver, op.getGo());
		Thread.sleep(5000);
		driver.navigate().back();
		js_scroll(driver, op.getScrollup8());
		Thread.sleep(1000);
		driver.navigate().back();
		js_Click(driver, op.getActive_topics());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll20());
		Thread.sleep(1000);
		selectby_visibletxt(op.getDropdown_day(), "3 months");
		Thread.sleep(1000);
		js_Click(driver, op.getGo());
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		js_scroll(driver, op.getScrollup8());
	}
	
	
	@When("user click an OpenCart Documentation")
	public void user_click_an_open_cart_documentation() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getOpenCart_Documentation1());
		Thread.sleep(1000);
		js_Click(driver, op.getSystem_Requirements());
		Thread.sleep(1000);
		js_Click(driver, op.getInstallation());
		Thread.sleep(1000);
		js_Click(driver, op.getGetting_Started());
		Thread.sleep(1000);
		js_Click(driver, op.getWhere_to_download());
		Thread.sleep(1000);
		js_Click(driver, op.getBrowsing_the_Store_Front());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll15());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup9());
		js_Click(driver, op.getAdmin_Interface());
		Thread.sleep(1000);
		js_Click(driver, op.getAdmin_Interface());
		Thread.sleep(1000);
		js_Click(driver, op.getCatalog());
		Thread.sleep(1000);
		js_Click(driver, op.getCatalog());
		Thread.sleep(1000);
//		js_Click(driver, op.getExtension());
//		Thread.sleep(1000);
//		js_Click(driver, op.getExtension());
//		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getSales());
		Thread.sleep(1000);
		js_Click(driver, op.getSales());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getMarketing1());
		Thread.sleep(1000);
		js_Click(driver, op.getMarketing1());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getSystem());
		Thread.sleep(1000);
		js_Click(driver, op.getSystem());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getTools());
		Thread.sleep(1000);
		js_Click(driver, op.getTools());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getReports_guide());
		Thread.sleep(1000);
		js_Click(driver, op.getReports_guide());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll21());
		Thread.sleep(1000);
		js_Click(driver, op.getDeveloper_Guide());
		Thread.sleep(1000);
		js_Click(driver, op.getDeveloper_Guide());
		Thread.sleep(1000);
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getVideo_Tutorial());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll22());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());
	}
	
	
	@When("user click an OpenCart Books")
	public void user_click_an_open_cart_books() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getOpenCart_Books1());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll15());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());	
	}
	
	
	@When("user click an Github Bug Tracker")
	public void user_click_an_github_bug_tracker() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getGitHub_Bug_Tracker());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());	
	}
	
	
	@When("user click an Developer")
	public void user_click_an_developer() throws InterruptedException {
		
		js_Click(driver, op.getResources());                                
		Thread.sleep(1000);
		js_Click(driver, op.getDeveloper2());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll15());
		Thread.sleep(1000);
		js_scroll(driver, op.getScrollup8());
	
	}

	

	@When("user click an Social Media")
	public void user_click_an_social_media() throws InterruptedException {
		
		js_Click(driver, op.getFeatures());
		Thread.sleep(1000);
		js_scroll(driver, op.getScroll15());
		Thread.sleep(1000);
	}
	
	
	@When("user click an Linkedin")
	public void user_click_an_linkedin() throws InterruptedException {
		
		js_Click(driver, op.getLinkedin());
	Thread.sleep(4000);
	//snap(driver, "linked");
	Set<String> tab = driver.getWindowHandles();
	Iterator<String> link = tab.iterator();
	String parent = link.next();
	String child = link.next();
	driver.switchTo().window(parent);   
	}
	
	
	@When("user click an Facebook")
	public void user_click_an_facebook() throws InterruptedException {
		
	js_Click(driver,op.getFacebook());
	Thread.sleep(4000);
	//snap(driver, "facebook");
	Set<String> tab1 = driver.getWindowHandles();
	Iterator<String> fb = tab1.iterator();
	String parent1 = fb.next();
	String child1 = fb.next();
	driver.switchTo().window(parent1);
	}
	@When("user click an Twitter")
	public void user_click_an_twitter() throws InterruptedException {
		
	js_Click(driver, op.getTwitter());
	//snap(driver, "twitter");
	Thread.sleep(4000);
	Set<String> tab2 = driver.getWindowHandles();
	Iterator<String> dom = tab2.iterator();
	String parent2 = dom.next();
	String child2 = dom.next();
	driver.switchTo().window(child2);
	 
	}

	@Then("opencart page completed sucessfully")
	public void opencart_page_completed_sucessfully() {
		System.out.println("OpenCart web application sucessfully completed");
		
	}












}
