package domaci_tests_01_06;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import domaci_pages_01_06.CartPage_domaci;
import domaci_pages_01_06.CheckOut_vezbanje;
import domaci_pages_01_06.MainNavigationDomaci;
import domaci_pages_01_06.MyAccount_vezbanje;
import domaci_pages_01_06.ShopPageDomaci;


public class BaseTests {
	WebDriver mojDriver;
	ShopPageDomaci shopPageDomaci;
	CartPage_domaci cartPageDomaci;
	MainNavigationDomaci mainNavigationDomaci;
	MyAccount_vezbanje myaccount_vezba;
	CheckOut_vezbanje checkOut_vezba;

	@BeforeClass
	public void preSihTestova() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		mojDriver = new ChromeDriver();
		mojDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		mojDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		shopPageDomaci = new ShopPageDomaci(mojDriver);
		cartPageDomaci = new CartPage_domaci(mojDriver);
		mainNavigationDomaci = new MainNavigationDomaci(mojDriver);
		myaccount_vezba = new MyAccount_vezbanje(mojDriver);
		checkOut_vezba = new CheckOut_vezbanje(mojDriver);
	}

	@AfterClass
	public void posleSvihTestova() {
		mojDriver.close();
	}
}


