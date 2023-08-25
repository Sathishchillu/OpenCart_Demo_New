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
public static OpenCart_PomClass option = new OpenCart_PomClass(driver);



@Given("get URL from opencart")
public void get_url_from_opencart() {
	url(driver, "https://www.opencart.com/index.php?route=cms/feature");  
}
@Given("maximize the window")
public void maximize_the_window()
{
    maxi(driver);
    toHold(10);

}

@When("user click the Admin")
public void user_click_the_admin() throws InterruptedException {
	option.getAdmin().click();
	js_scroll(driver, option.getScroll5());

}
@When("user click the UnlimitedEverything")
public void user_click_the_unlimited_everything() {
//	option.getUnlimitedEverything().click();
	js_Click(driver,option.getUnlimitedEverything());
	js_scroll(driver,option.getScrollup());
}
@When("user scroll down")
public void user_scroll_down() throws InterruptedException {

	js_scroll(driver, option.getScroll());
}


@When("user click the Customer")
public void user_click_the_customer() throws InterruptedException {
//	option.getCustomer().click();
	js_Click(driver, option.getCustomer());
	js_scroll(driver,option.getScrollup1());
	js_scroll(driver, option.getScroll1());
}

@When("user click the Shipping")
public void user_click_the_shipping() throws InterruptedException {
	js_Click(driver, option.getShipping());
	js_scroll(driver,option.getScrollup2());
	js_scroll(driver, option.getScroll2());
}


@When("user click the Extension")
public void user_click_the_extension() throws InterruptedException {
//	option.getExtension().click();
	js_Click(driver,option.getExtension());
	js_scroll(driver,option.getScrollup3());
	js_scroll(driver, option.getScroll3());
}


@Given("user click the Mobile")
public void user_click_the_mobile() throws InterruptedException {
//	option.getMobile().click();
	js_Click(driver,option.getMobile());
	js_scroll(driver,option.getScrollup4());
	js_scroll(driver, option.getScroll4());
}


@Given("user click the Developer")
public void user_click_the_developer() throws InterruptedException {
//	option.getDeveloper().click();
	js_Click(driver, option.getDeveloper());
	js_scroll(driver,option.getScrollup5());
	js_scroll(driver, option.getScroll5());
	js_Click(driver, option.getAd());
	js_scroll(driver,option.getScrollup6());
}


//  Tag2

@When("user click an Demo")
public void user_click_an_demo() {

     js_Click(driver, option.getDemo());
}

@When("user click an Store Front")
public void user_click_an_store_front() throws InterruptedException {

	js_Click(driver, option.getStorefront());

	Set<String> tab0 = driver.getWindowHandles();
	Iterator<String> dom = tab0.iterator();
	String parent0 = dom.next();
	String child0 = dom.next();
	driver.switchTo().window(child0);
	js_scroll(driver, option.getScroll7());
}


@When("user click an macbook")
public void user_click_an_macbook() throws InterruptedException {

	js_Click(driver, option.getMacbook());
}


@When("user click an Desktop")
public void user_click_an_desktop() throws InterruptedException {
	js_Click(driver, option.getHome());
}


@When("user click an laptops and notebooks")
public void user_click_an_laptops_and_notebooks() throws InterruptedException {

	js_Click(driver, option.getLaptop());
	js_Click(driver, option.getShow());
	js_Click(driver, option.getHome());
}


@When("user click an Components")
public void user_click_an_components() throws InterruptedException {

	js_Click(driver, option.getComponents());
	js_Click(driver, option.getMonitor());
	js_Click(driver, option.getMon());
	js_scroll(driver, option.getScroll8());
	js_Click(driver, option.getAddcart());
	js_Click(driver, option.getHome());
}


@When("user click an Tables")
public void user_click_an_tables() throws InterruptedException {

	js_Click(driver, option.getTable());
	js_Click(driver, option.getSamsug());
	js_scroll(driver, option.getScroll9());
	js_Click(driver, option.getAddcart1());
	js_Click(driver, option.getHome());
}


@When("user click an Software")
public void user_click_an_software() throws InterruptedException {

	js_Click(driver, option.getSoftware());
	js_Click(driver, option.getHome());
}


@When("user click an Phones and PDA")
public void user_click_an_phones_and_pda() throws InterruptedException {

	js_Click(driver, option.getPads());
	js_Click(driver, option.getMob());
	js_scroll(driver, option.getScroll10());
	js_Click(driver, option.getAddcart2());
	driver.navigate().back();
	js_Click(driver, option.getIphone());
	driver.navigate().back();
	js_Click(driver, option.getPalm());
	js_Click(driver, option.getHome());
}


@When("user click an Cameras")
public void user_click_an_cameras() throws InterruptedException {

	js_Click(driver, option.getCamara());
	js_Click(driver, option.getCanon());
	driver.navigate().back();
	js_Click(driver, option.getNikon());
	js_Click(driver, option.getHome());
}


@When("user click an MP3 Players")
public void user_click_an_mp3_players() throws InterruptedException {

	js_Click(driver, option.getMp3());
	js_Click(driver, option.getTest20());
	js_Click(driver, option.getHome());
	Set<String> tab3 = driver.getWindowHandles();
	Iterator<String> dom = tab3.iterator();
	String parent3 = dom.next();
	String child3 = dom.next();
	driver.switchTo().window(parent3);
}


//      Tag 3


@When("user click an MarketPlace")
public void user_click_an_market_place() throws InterruptedException {

	js_Click(driver, option.getMarketplace());
}


@When("user click an commercial")
public void user_click_an_commercial() throws InterruptedException {

	js_Click(driver, option.getCommerical());
}


@When("user click an free")
public void user_click_an_free() throws InterruptedException {

	js_Click(driver, option.getFree());
}


@When("user click an search")
public void user_click_an_search() throws InterruptedException {

	option.getSearch().sendKeys("mobile");
	js_Click(driver, option.getSearchbutton());

// click by one and one
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getAll());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getMarketplc());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getThemes());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getLanguagesnew());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getPaymentGateways());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getShippingMethods());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getModules());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getOrderTotals());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getProductFeeds());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getReports());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getOther());
	js_scroll(driver, option.getScroll11());
	js_Click(driver, option.getVQMod());

	}


@When("user click an DropDownSortBy")
public void user_click_an_drop_down_sort_by() throws InterruptedException {

	js_scroll(driver, option.getScroll12());
	selectby_visibletxt(option.getAllclick(), "4.0.2.0");
	js_Click(driver, option.getMarketplc());
	js_scroll(driver, option.getScroll13());
	js_Click(driver, option.getOpencartpartners());
	js_scroll(driver, option.getScroll13());
	js_Click(driver, option.getDevelopers());
	selectby_visibletxt(option.getRating(), "Rating");
}


//Tag@4

@When("user click an Blog")
public void user_click_an_blog() {

	js_Click(driver, option.getBolg());
 }


@When("user click an Articles")
public void user_click_an_articles() throws InterruptedException {

	js_Click(driver, option.getArticles());
	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());
}


@When("user click an Announcements")
public void user_click_an_announcements() throws InterruptedException {

	js_Click(driver, option.getAnnouncements());
	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());
}


@When("user click an Tips")
public void user_click_an_tips() throws InterruptedException {

	js_Click(driver, option.getTips());
	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());
 }


@When("user click an SuccessStories")
public void user_click_an_success_stories() throws InterruptedException {

	js_Click(driver, option.getSuccessStories());
	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());
 }


@When("user click an VideoTutorials")
public void user_click_an_video_tutorials() throws InterruptedException {

	js_Click(driver, option.getVideoTutorials());
	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());
}


@When("user click an Download")
public void user_click_an_download() {

	js_Click(driver, option.getDownload());
}


@When("user click Scroll Down and Scroll Up")
public void user_click_scroll_down_and_scroll_up() throws InterruptedException {

	js_scroll(driver, option.getScroll14());
	js_scroll(driver, option.getScrollup7());

}


//	Tag 5


	@When("user click an Resource")
	public void user_click_an_resource() throws InterruptedException {

		js_Click(driver, option.getResources());
	}


	@When("user click an Showcase")
	public void user_click_an_showcase() throws InterruptedException {

		js_Click(driver, option.getShowcase());
		js_scroll(driver, option.getScroll15());
		js_scroll(driver, option.getScrollup8());
		js_Click(driver, option.getResources());
	}


	@When("user click an ContactUs")
	public void user_click_an_contact_us() throws InterruptedException {

		js_Click(driver, option.getContactUs());
		js_scroll(driver, option.getScroll16());
	    selectby_visibletxt(option.getHelp(),"I have a partnership question");
		option.getName().sendKeys("chillu");
		option.getEmail().sendKeys("sathishsms333@gmail");
//		option.getCompanyName().sendKeys("asdfghjk");
//		option.getInput_website().sendKeys("asdfg");
//		option.getPhone_1().sendKeys("1234567890");
//		selectby_visibletxt(option.getDropdown_country(), "Angola");
		option.getMessage().sendKeys("how are you");
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an OpenCart_Part")
	public void user_click_an_open_cart_part() throws InterruptedException {

		js_Click(driver, option.getResources());
		js_Click(driver, option.getOpenCart_Part());
		selectby_visibletxt(option.getDropdown_control(), "India (14)");
		js_scroll(driver, option.getScroll17());
		js_Click(driver, option.getDevelopment_Partner());
		js_Click(driver, option.getHosting_Partner());
		js_Click(driver, option.getPayment_Partner());
		js_Click(driver, option.getOpenCart_Certified());
		js_Click(driver, option.getPremium_Partner());
		js_Click(driver, option.getPartner());
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an Community Forums")
	public void user_click_an_community_forums() throws InterruptedException {

		js_Click(driver, option.getResources());                                //4
		js_Click(driver, option.getCommunity_Forums());
		js_scroll(driver, option.getScroll18());
		js_Click(driver, option.getUnanswered_topics());
		js_scroll(driver, option.getScroll19());
		selectby_visibletxt(option.getDropdown_day(), "1 month");
		selectby_visibletxt(option.getDropdown_topictitle(), "Topic title");
		selectby_visibletxt(option.getDropdown_ascending(), "Ascending" );
		js_Click(driver, option.getGo());
		driver.navigate().back();
		js_scroll(driver, option.getScrollup8());
		driver.navigate().back();
		js_Click(driver, option.getActive_topics());
		js_scroll(driver, option.getScroll20());
		selectby_visibletxt(option.getDropdown_day(), "3 months");
		js_Click(driver, option.getGo());
		driver.navigate().back();
		driver.navigate().back();
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an OpenCart Documentation")
	public void user_click_an_open_cart_documentation() throws InterruptedException {

		js_Click(driver, option.getResources());
		js_Click(driver, option.getOpenCart_Documentation1());
		js_Click(driver, option.getSystem_Requirements());
		js_Click(driver, option.getInstallation());
		js_Click(driver, option.getGetting_Started());
		js_Click(driver, option.getWhere_to_download());
		js_Click(driver, option.getBrowsing_the_Store_Front());
		js_scroll(driver, option.getScroll15());
		js_scroll(driver, option.getScrollup9());
		js_Click(driver, option.getAdmin_Interface());
		js_Click(driver, option.getAdmin_Interface());
		js_Click(driver, option.getCatalog());
		js_Click(driver, option.getCatalog());
//		js_Click(driver, option.getExtension());
//		js_Click(driver, option.getExtension());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getSales());
		js_Click(driver, option.getSales());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getMarketing1());
		js_Click(driver, option.getMarketing1());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getSystem());
		js_Click(driver, option.getSystem());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getTools());
		js_Click(driver, option.getTools());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getReports_guide());
		js_Click(driver, option.getReports_guide());
		js_scroll(driver, option.getScroll21());
		js_Click(driver, option.getDeveloper_Guide());
		js_Click(driver, option.getDeveloper_Guide());
		js_Click(driver, option.getResources());
		js_Click(driver, option.getVideo_Tutorial());
		js_scroll(driver, option.getScroll22());
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an OpenCart Books")
	public void user_click_an_open_cart_books() throws InterruptedException {

		js_Click(driver, option.getResources());
		js_Click(driver, option.getOpenCart_Books1());
		js_scroll(driver, option.getScroll15());
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an Github Bug Tracker")
	public void user_click_an_github_bug_tracker() throws InterruptedException {

		js_Click(driver, option.getResources());
		js_Click(driver, option.getGitHub_Bug_Tracker());
		driver.navigate().back();
		js_scroll(driver, option.getScrollup8());
	}


	@When("user click an Developer")
	public void user_click_an_developer() throws InterruptedException {

		js_Click(driver, option.getResources());
		js_Click(driver, option.getDeveloper2());
		js_scroll(driver, option.getScroll15());
		js_scroll(driver, option.getScrollup8());

	}



	@When("user click an Social Media")
	public void user_click_an_social_media() throws InterruptedException {

		js_Click(driver, option.getFeatures());
		js_scroll(driver, option.getScroll15());
	}
	
	
	@When("user click an Linkedin")
	public void user_click_an_linkedin() throws InterruptedException {
		
		js_Click(driver, option.getLinkedin());
	//snap(driver, "linked");
	Set<String> tab = driver.getWindowHandles();
	Iterator<String> link = tab.iterator();
	String parent = link.next();
	String child = link.next();
	driver.switchTo().window(parent);   
	}
	
	
	@When("user click an Facebook")
	public void user_click_an_facebook() throws InterruptedException {
		
	js_Click(driver,option.getFacebook());
	//snap(driver, "facebook");
	Set<String> tab1 = driver.getWindowHandles();
	Iterator<String> fb = tab1.iterator();
	String parent1 = fb.next();
	String child1 = fb.next();
	driver.switchTo().window(parent1);
	}


	@When("user click an Twitter")
	public void user_click_an_twitter() throws InterruptedException {
		
	js_Click(driver, option.getTwitter());
	//snap(driver, "twitter");
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
