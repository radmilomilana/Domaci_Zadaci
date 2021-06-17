package domaci_03_06_base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import domaci_03_06_pages.LogInPage;
import domaci_03_06_pages.MainPage;
import domaci_03_06_tests.ExcelReader_domaci;


public class BaseTest_domaci {
	public WebDriver driver;
	public ExcelReader_domaci citacExcela;
	public MainPage mainPageNavigation;
	public LogInPage logInPage;
	
	@BeforeClass
	public void preSvihTestova() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		citacExcela =  new ExcelReader_domaci("data/domaci_03_06.xlsx");
		mainPageNavigation = new MainPage(driver);
		logInPage = new LogInPage(driver);
	}

	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}
}
