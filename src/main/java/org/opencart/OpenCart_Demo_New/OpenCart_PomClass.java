package org.opencart.OpenCart_Demo_New;
import org.checkerframework.checker.interning.qual.FindDistinct;
import org.hamcrest.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OpenCart_PomClass {
	
	public WebDriver driver;
	
		@FindBy(xpath="//a[@href='#tab-admin']")
		private WebElement Admin;

	
		@FindBy(xpath = "//a[@href='#tab-unlimited']")
		private WebElement UnlimitedEverything;
		
		@FindBy(xpath = "//a[@href='#tab-customer']")
		private WebElement Customer;
		
		@FindBy(xpath = "//a[@href='#tab-shipping']")
		private WebElement Shipping;
		
		@FindBy(xpath = "//a[@href='#tab-extension']")
		private WebElement extension;
		
		@FindBy(xpath = "//a[normalize-space()='Mobile & SEO']")
		private WebElement mobile;
		
		@FindBy(xpath = "//a[@href='#tab-developer']")
		private WebElement developer;
		
		@FindBy(xpath = "//a[.='Admin '] ")
		private WebElement ad;
		
	  //scroll down
		
		@FindBy(xpath = "//h3[.='Downloadable Products Ready']")
		private WebElement scroll;

		@FindBy(xpath = "//h2[.='Turn mail to your advantage']")
		private WebElement scroll1;
		
		@FindBy(xpath = "//h2[.='Sales reports']")
		private WebElement scroll2;
		
		@FindBy(xpath = "//h2[.='Partners around the world']")
		private WebElement scroll3;
		
		@FindBy(xpath = "//h2[.='Product Feeds']")
		private WebElement scroll4;
		
		@FindBy(xpath = "//h2[.='Open-Source']")
		private WebElement scroll5;
		
		@FindBy(xpath = "//h2[.='//a[@class='btn btn-lg'][normalize-space()='Unlimited everything']']")
		private WebElement scroll6;
		
		@FindBy(xpath = "//h3[normalize-space()='Featured']")
		private WebElement scroll7;
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement scroll8;
		
		@FindBy(xpath = "//input[@class='form-control']")
		private WebElement scroll9;
		
		@FindBy(xpath = "//input[@class='form-control']")
		private WebElement scroll10;
		

		
		

		//up
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup;
		
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup1;
		
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup2;

		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup3;
		
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup4;
		
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup5;
		
		@FindBy(xpath = "//h1[.='OpenCart Features']")
		private WebElement scrollup6;
		
		
		
		
		//new
		

		@FindBy(xpath = "//a[normalize-space()='Linkedin']")
		private WebElement linkedin;
		
		@FindBy(xpath = "//a[normalize-space()='Facebook']")
		private WebElement facebook;
		
		@FindBy(xpath = "//a[normalize-space()='Twitter']")
		private WebElement twitter;
		
//		Tag 2@
		
		@FindBy(xpath = "(//a[text()='Demo'])[1]")
		private WebElement demo;
		
		@FindBy(xpath = "//a[@class='box-overlay']")
		private WebElement storefront;
	
		@FindBy(xpath = "//a[normalize-space()='MacBook']")
		private WebElement macbook;
		
		@FindBy(xpath = "//i[@class='fa fa-home']")
		private WebElement home;
		
		@FindBy(xpath = "//a[.='Laptops & Notebooks']")
		private WebElement laptop;
		
		@FindBy(xpath = "//a[.='Show All Laptops & Notebooks']")
		private WebElement show;
		
		@FindBy(xpath = "//a[.='Components']")
		private WebElement components;
		
		@FindBy(xpath = "//a[.='Monitors (2)']")
		private WebElement monitor;
		
		@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
		private WebElement mon;
		
		@FindBy(xpath = "//button[.='Add to Cart']")
		private WebElement addcart1;
		
		@FindBy(xpath = "//a[.='Tablets']")
		private WebElement table;
		
		@FindBy(xpath = "//a[.='Samsung Galaxy Tab 10.1']")
		private WebElement samsug;
		
		@FindBy(xpath = "(//button[@type='submit'])[3]")
		private WebElement addcart;
		
		@FindBy(xpath = "//a[.='Software']")
		private WebElement software;
		
		@FindBy(xpath = "//a[.='Phones & PDAs']")
		private WebElement pads;
		
		@FindBy(xpath = "//a[.='HTC Touch HD']")
		private WebElement mob;
		
		@FindBy(xpath = "//button[.='Add to Cart']")
		private WebElement addcart2;
		
		@FindBy(xpath = "//img[@title='iPhone']")
		private WebElement iphone;
		
		@FindBy(xpath = "//img[@alt='Palm Treo Pro']")
		private WebElement palm;
		
		@FindBy(xpath = "//a[.='Cameras']")
		private WebElement camara;
		
		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement canon;
		
		@FindBy(xpath = "//img[@alt='Nikon D300']")
		private WebElement nikon;
	
		@FindBy(xpath = "//a[.='MP3 Players']")
		private WebElement mp3;
		
		@FindBy(xpath = "//a[.='test 20 (0)']")
		private WebElement test20;
		
//		  Tag 3@
		

		@FindBy(xpath = "(//a[.='Marketplace'])[1]")
		private WebElement marketplace;
		
		
		@FindBy(xpath = "//a[.='Commercial']")
		private WebElement commerical;
		
		@FindBy(xpath = "//a[.='Free']")
		private WebElement free;
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement search;
		
		@FindBy(xpath = "//button[@id='button-search']")
		private WebElement searchbutton;
		
	//scroll	
		
		@FindBy(xpath = "//a[.='All']")
		private WebElement all;
		
		

		@FindBy(xpath = "//a[.='Marketplaces']")
		private WebElement marketplc;
		
		@FindBy(xpath = "//a[.='Themes']")
		private WebElement themes;
		
		@FindBy(xpath = "//a[.='Languages']")
		private WebElement languagesnew;
		
		@FindBy(xpath = "//a[.='Payment Gateways']")
		private WebElement PaymentGateways;
		
		@FindBy(xpath = "//a[.='Shipping Methods']")
		private WebElement ShippingMethods;
		
		@FindBy(xpath = "//a[.='Modules']")
		private WebElement Modules;
		
		@FindBy(xpath = "//a[.='Order Totals']")
		private WebElement OrderTotals;
		
		@FindBy(xpath = "//a[.='Product Feeds']")
		private WebElement ProductFeeds;
		
		@FindBy(xpath = "//a[.='Reports']")
		private WebElement Reports;
		
		@FindBy(xpath = "//a[.='Other']")
		private WebElement Other;
		
		@FindBy(xpath = "//a[.='VQMod']")
		private WebElement VQMod;
		
		@FindBy(xpath = "//select[@class='form-control']")   //dropdown 
		private WebElement allclick;
		
		@FindBy(xpath = "//label[normalize-space()='OpenCart Partners']")
		private WebElement opencartpartners;
		
		@FindBy(xpath = "//label[normalize-space()='Developers']")
		private WebElement developers;
		
		@FindBy(xpath = "//select[@id='input-sort']")	 	//drop down
		private WebElement rating;
		
		@FindBy(xpath = "//a[.='Blog']")
		private WebElement bolg;
		
		@FindBy(xpath = "//a[.='All Articles']")  
		private WebElement Articles;
		
		@FindBy(xpath = "//a[normalize-space()='Announcements']")
		private WebElement Announcements;
		
		@FindBy(xpath = "//a[normalize-space()='Tips and Tricks']")
		private WebElement Tips;
		
		@FindBy(xpath = "//a[normalize-space()='Success Stories']")
		private WebElement SuccessStories;
		
		@FindBy(xpath = "//a[normalize-space()='Video Tutorials']")
		private WebElement VideoTutorials;
		
		
		@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Download']")
		private WebElement download;
		


//		Tag3   and 4  scroll down

		@FindBy(xpath = "//img[@class='img-responsive']")
		private WebElement scroll11;
		
		@FindBy(xpath = "//div[@class='extension-name']")
		private WebElement scroll12;
		
		@FindBy(xpath = "//select[@class='form-control']")
		private WebElement scroll13;

		@FindBy(xpath = "//body/footer/div[@class='container']/div[2]")
		private WebElement scroll14;
		
		
		
//		Tag3 and  4  scroll up  
		
	
		@FindBy(xpath = "//div[@id='navbar-collapse-header']") 
		private WebElement scrollup7;
		
	
		
//		Tag 5
		
		@FindBy(xpath = "//a[normalize-space()='Resources']")
		private WebElement Resources;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='Showcase']")
		private WebElement showcase;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='Contact Us']")
		private WebElement ContactUs;
		
		

		@FindBy(xpath = "//select[@id='input-reason']")
		private WebElement help;
		
		@FindBy(xpath = "//input[@id='input-name']")
		private WebElement name;
		
		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@placeholder='Company Name']]")
		private WebElement  CompanyName;
		
		@FindBy(xpath = "//input[@placeholder='Web Site']")
		private WebElement input_website;
		
		@FindBy(xpath = "//input[@placeholder='Phone']")
		private WebElement phone_1;
		
		@FindBy(xpath = "//select[@id='input-country']")      //dropdown
		private WebElement dropdown_country;
		
		@FindBy(xpath = "//textarea[@id='input-enquiry']")
		private WebElement message;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='OpenCart Partners']")
		private WebElement OpenCart_Part;
		
		@FindBy(xpath = "//select[@class='form-control']")
		private WebElement dropdown_control;
		
		@FindBy(xpath = "//label[normalize-space()='Development Partner']")
		private WebElement Development_Partner;
		
		@FindBy(xpath = "//label[normalize-space()='Hosting Partner']")
		private WebElement Hosting_Partner;
		
		@FindBy(xpath = "//label[normalize-space()='Payment Partner']")
		private WebElement Payment_Partner;
		
		@FindBy(xpath = "//label[normalize-space()='OpenCart Certified']")
		private WebElement OpenCart_Certified;
		
		@FindBy(xpath = "//label[normalize-space()='Premium Partner']")
		private WebElement Premium_Partner;
		
		@FindBy(xpath = "//label[normalize-space()='Partner']")
		private WebElement Partner;
		
		@FindBy(xpath = "//a[normalize-space()='Community Forums']")
		private WebElement Community_Forums;
		
		@FindBy(xpath = "//a[@class='btn btn-default'][normalize-space()='Unanswered topics']")
		private WebElement Unanswered_topics;
			
		@FindBy(xpath = "//select[@id='st']") 
		private WebElement dropdown_day;
		
		@FindBy(xpath = "//select[@id='sk']")
		private WebElement dropdown_topictitle;
		
		@FindBy(xpath = "//select[@id='sd']")
		private WebElement dropdown_ascending;

		@FindBy(xpath = "//input[@name='sort']")  
		private WebElement go;
		
		@FindBy(xpath = "//a[@class='btn btn-default'][normalize-space()='Active topics']")
		private WebElement Active_topics;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='OpenCart Documentation']")
		private WebElement OpenCart_Documentation1;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='System Requirements']")
		private WebElement System_Requirements;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='Installation']")
		private WebElement Installation;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='Getting Started']")
		private WebElement Getting_Started;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='Where to download']")
		private WebElement Where_to_download;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='Browsing the Store Front']")
		private WebElement Browsing_the_Store_Front;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Admin Interface']")
		private WebElement Admin_Interface;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Catalog']")
		private WebElement Catalog;
		
		@FindBy(xpath = "//body/div[@class='container']/div[@class='row']/div[@class='col-md-3 hidden-xs hidden-sm']/div[@id='menu']/div[@id='en-gb']/ul/li[@class='open']/a[1]")
		private WebElement Extension;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Sales']")
		private WebElement Sales;
		
		@FindBy(xpath = "//body/div[@class='container']/div[@class='row']/div[@class='col-md-3 hidden-xs hidden-sm']/div[@id='menu']/div[@id='en-gb']/ul/li[1]/a[1]")
		private WebElement Marketing1;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='System']")
		private WebElement System;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Tools']")
		private WebElement Tools;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Reports']")
		private WebElement Reports_guide;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Developer Guide']")
		private WebElement Developer_Guide;
				
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='Video Tutorial']")
		private WebElement Video_Tutorial;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='OpenCart Books']")
		private WebElement OpenCart_Books1;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='GitHub Bug Tracker']")
		private WebElement GitHub_Bug_Tracker;
		
		@FindBy(xpath = "//ul[@class='dropdown-menu']//a[normalize-space()='Developer']")
		private WebElement Developer2;
		
		@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")
		private WebElement Features;
//		
//		@FindBy(xpath = "")
//		private WebElement
		
		
		
		
		
//		Tag 5       scroll down
		
		
	
		@FindBy(xpath = "//body/footer/div[@class='container']/div[1]")
		private WebElement scroll15;
				
		@FindBy(xpath = "//label[normalize-space()='How can we help you?']")
		private WebElement scroll16;
		
		@FindBy(xpath = "//h4[normalize-space()='Type']")
		private WebElement scroll17;
		
		@FindBy(xpath = "//div[@id='search-shortcut']")
		private WebElement scroll18;
		
		@FindBy(xpath = "//body[1]/div[1]/div[4]/div[1]/div[3]/div[26]/dl[1]/dt[1]/div[1]/ul[1]/li[2]")
		private WebElement scroll19;
				
		@FindBy(xpath = "//div[26]//dl[1]//dt[1]//div[1]//ul[1]")
		private WebElement scroll20;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[@class='parent'][normalize-space()='Admin Interface']")
		private WebElement scroll21;
		
		@FindBy(xpath = "//p[contains(text(),'This guide serves as a resource to users needing d')]")
		private WebElement scroll22;
		
		
//		Tag 5		scroll up  
		
		

		@FindBy(xpath = "//div[@id='navbar-collapse-header']")
		private WebElement scrollup8;
		
		@FindBy(xpath = "//div[@class='col-md-3 hidden-xs hidden-sm']//a[normalize-space()='Getting Started']")
		private WebElement scrollup9;
		
		
		
		
//---------------------------------------------------------------










		public OpenCart_PomClass (WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		
		
		

		
		
		public WebElement getAdmin() {
			return Admin;
		}

		public WebElement getUnlimitedEverything() {
			return UnlimitedEverything;
		}

		public WebElement getCustomer() {
			return Customer;
		}

		public WebElement getShipping() {
			return Shipping;
		}

		public WebElement getExtension() {
			return extension;
		}

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getDeveloper() {
			return developer;
		}
		
		public WebElement getAd() {
			return ad;
		}
		
		public WebElement getLinkedin() {
			return linkedin;
		}

		public WebElement getFacebook() {
			return facebook;
		}

		public WebElement getTwitter() {
			return twitter;
		}
		
		
		
		
//		   Tag 2@S
		

		public WebElement getDemo() {
			return demo;
		}
		
		public WebElement getStorefront() {
			return storefront;
		}
		
		
		public WebElement getMacbook() {
			return macbook;
		}


		public WebElement getHome() {
			return home;
		}

		public WebElement getLaptop() {
			return laptop;
		}
		
		public WebElement getShow() {
			return show;
		}
		
		public WebElement getComponents() {
			return components;
		}

		public WebElement getTable() {
			return table;
		}
		
		public WebElement getMonitor() {
			return monitor;
		}
		
		public WebElement getMon() {
			return mon;
		}
		
		public WebElement getAddcart() {
			return addcart;
		}

		public WebElement getSamsug() {
			return samsug;
		}
		
		public WebElement getAddcart1() {
			return addcart1;
		}
		
		public WebElement getSoftware() {
			return software;
		}
		
		public WebElement getPads() {
			return pads;
		}

		public WebElement getMob() {
			return mob;
		}

		public WebElement getAddcart2() {
			return addcart2;
		}
		
		public WebElement getIphone() {
			return iphone;
		}
		
		public WebElement getPalm() {
			return palm;
		}
		
		public WebElement getCamara() {
			return camara;
		}
		
		public WebElement getCanon() {
			return canon;
		}
		
		public WebElement getNikon() {
			return nikon;
		}
		
		public WebElement getMp3() {
			return mp3;
		}
		
		public WebElement getTest20() {
			return test20;
		}
		
		
		
		

		//scrollDown  1  &  2
		
		public WebElement getScroll() {
			return scroll;
		}

		public WebElement getScroll1() {
			return scroll1;
		}
		
		public WebElement getScroll2() {
			return scroll2;
		}

		public WebElement getScroll3() {
			return scroll3;
		}

		public WebElement getScroll4() {
			return scroll4;
		}
		
		public WebElement getScroll5() {
			return scroll5;
		}
		
		public WebElement getScroll6() {
			return scroll6;
		}
      
		public WebElement getScroll7() {
			return scroll7;
		}

		public WebElement getScroll8() {
			return scroll8;
		}
		
		public WebElement getScroll9() {
			return scroll9;
		}

		public WebElement getScroll10() {
			return scroll10;
		}
		
		
		

	   //scrollup  1   &  2
		

		public WebElement getScrollup() {
			return scrollup;
		}
		
		public WebElement getScrollup1() {
			return scrollup1;
		}

		public WebElement getScrollup2() {
			return scrollup2;
		}

		public WebElement getScrollup3() {
			return scrollup3;
		}

		public WebElement getScrollup4() {
			return scrollup4;
		}

		public WebElement getScrollup5() {
			return scrollup5;
		}

		public WebElement getScrollup6() {
			return scrollup6;
		}

		
		
		
//	    Tag@ 3
		
		public WebElement getMarketplace() {
			return marketplace;
		}

		public WebElement getCommerical() {
			return commerical;
		}

		public WebElement getFree() {
			return free;
		}
		
		public WebElement getSearch() {
			return search;
		}

		public WebElement getSearchbutton() {
			return searchbutton;
		}
		
		public WebElement getAll() {
			return all;
		}

		public WebElement getMarketplc() {
			return marketplc;
		}

		public WebElement getThemes() {
			return themes;
		}

		public WebElement getLanguagesnew() {
			return languagesnew;
		}

		public WebElement getPaymentGateways() {
			return PaymentGateways;
		}

		public WebElement getShippingMethods() {
			return ShippingMethods;
		}

		public WebElement getModules() {
			return Modules;
		}

		public WebElement getOrderTotals() {
			return OrderTotals;
		}

		public WebElement getProductFeeds() {
			return ProductFeeds;
		}

		public WebElement getReports() {
			return Reports;
		}

		public WebElement getOther() {
			return Other;
		}

		public WebElement getVQMod() {
			return VQMod;
		}

		public WebElement getAllclick() {
			return allclick;
		}
		
		public WebElement getOpencartpartners() {
			return opencartpartners;
		}

		public WebElement getDevelopers() {
			return developers;
		}

		public WebElement getRating() {  
			return rating;
		}
		
		
		
		
		
		
	//Tag@ 4    
		
		public WebElement getBolg() {
			return bolg;
		}

		public WebElement getArticles() {
			return Articles;
		}
		
		public WebElement getAnnouncements() {
			return Announcements;
		}

		public WebElement getTips() {
			return Tips;
		}

		public WebElement getSuccessStories() {
			return SuccessStories;
		}

		public WebElement getVideoTutorials() {
			return VideoTutorials;
		}
		
		public WebElement getDownload() {
			return download;
		}
		


		
		
	//Tag@3  &   4  scroll down
		
		public WebElement getScroll11() {
			return scroll11;
		}
		
		public WebElement getScroll12() {
			return scroll12;
		}

		public WebElement getScroll13() {
			return scroll13;
		}

		public WebElement getScroll14() {
			return scroll14;
		}

		
	// Tag@3   &    4  Scroll down
		
		public WebElement getScrollup7() {
			return scrollup7;
		}


		
	// Tag@  5  
		
		public WebElement getResources() {
			return Resources;
		}

		public WebElement getShowcase() {
			return showcase;
		}
		
		public WebElement getContactUs() {
			return ContactUs;
		}

		public WebElement getHelp() {
			return help;
		}

		public WebElement getName() {
			return name;
		}

		public WebElement getEmail() {
			return email;
		}
		
	    public WebElement getCompanyName() {
     		return CompanyName;
	    }

		public WebElement getInput_website() {
			return input_website;
		}

		public WebElement getPhone_1() {
			return phone_1;
		}

		public WebElement getDropdown_country() {
			return dropdown_country;
		}

		public WebElement getMessage() {
			return message;
		}
		
		public WebElement getOpenCart_Part() {
			return OpenCart_Part;
		}

		public WebElement getDropdown_control() {
			return dropdown_control;
		}
		
		public WebElement getDevelopment_Partner() {
			return Development_Partner;
		}

		public WebElement getHosting_Partner() {
			return Hosting_Partner;
		}

		public WebElement getPayment_Partner() {
			return Payment_Partner;
		}

		public WebElement getOpenCart_Certified() {
			return OpenCart_Certified;
		}

		public WebElement getPremium_Partner() {
			return Premium_Partner;
		}


		public WebElement getPartner() {
			return Partner;
		}

		public WebElement getCommunity_Forums() {
			return Community_Forums;
		}

		public WebElement getUnanswered_topics() {
			return Unanswered_topics;
		}

		public WebElement getDropdown_day() {
			return dropdown_day;
		}

		public WebElement getDropdown_topictitle() {
			return dropdown_topictitle;
		}

		public WebElement getDropdown_ascending() {
			return dropdown_ascending;
		}

		public WebElement getGo() {
			return go;
		}

		public WebElement getActive_topics() {
			return Active_topics;
		}
		public WebElement getOpenCart_Documentation1() {
			return OpenCart_Documentation1;
		}

		public WebElement getSystem_Requirements() {
			return System_Requirements;
		}

		public WebElement getInstallation() {
			return Installation;
		}

		public WebElement getGetting_Started() {
			return Getting_Started;
		}

		public WebElement getWhere_to_download() {
			return Where_to_download;
		}

		public WebElement getBrowsing_the_Store_Front() {
			return Browsing_the_Store_Front;
		}
		
		public WebElement getAdmin_Interface() {
			return Admin_Interface;
		}
		
		public WebElement getCatalog() {
			return Catalog;
		}

		public WebElement getSales() {
			return Sales;
		}

		public WebElement getMarketing1() {
			return Marketing1;
		}
		
		public WebElement getSystem() {
			return System;
		}

		public WebElement getTools() {
			return Tools;
		}

		public WebElement getReports_guide() {
			return Reports_guide;
		}

		public WebElement getDeveloper_Guide() {
			return Developer_Guide;
		}

		public WebElement getVideo_Tutorial() {
			return Video_Tutorial;
		}

		public WebElement getOpenCart_Books1() {
			return OpenCart_Books1;
		}

		public WebElement getGitHub_Bug_Tracker() {
			return GitHub_Bug_Tracker;
		}

		public WebElement getDeveloper2() {
			return Developer2;
		}

		public WebElement getFeatures() {
			return Features;
		}
		

		// Tag@  5  scroll down &   scroll up
		
		
		public WebElement getScroll15() {
			return scroll15;
		}

		public WebElement getScroll16() {
			return scroll16;
		}
		
		public WebElement getScroll17() {
			return scroll17;
		}

		public WebElement getScroll18() {
			return scroll18;
		}
		
		public WebElement getScroll19() {
			return scroll19;
		}
		
		public WebElement getScroll20() {
			return scroll20;
		}
		
		public WebElement getScroll21() {
			return scroll21;
		}
		
		public WebElement getScroll22() {
			return scroll22;
		}
		
		public WebElement getScrollup8() {
			return scrollup8;
		}
		
		public WebElement getScrollup9() {
			return scrollup9;
		}


		



}
