package domaciSelenium;


	import static org.testng.Assert.assertEquals;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Domaci_31_05 {
		WebDriver driver;
		WebDriverWait wdwait;
		
		@BeforeClass 
		public void preSvihTestova() {
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			driver = new ChromeDriver();
			wdwait = new WebDriverWait(driver, 15);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		@BeforeMethod 
		public void navigacijaNaKatalonSajt() {		
			driver.navigate().to(" http://cms.demo.katalon.com/");
			wdwait = new WebDriverWait(driver, 15);
			WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
			myAccount.click();
			wdwait = new WebDriverWait(driver, 15);
		}
		@Test (priority = 0)
		public void invalidPassLogIn () {
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("customer");
			wdwait = new WebDriverWait(driver, 15);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("147852369");
			wdwait = new WebDriverWait(driver, 15);
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
			String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();			
			assertEquals(actualText, "ERROR: The password you entered for the username customer is incorrect. Lost your password?");
			
		}
		
		@Test (priority = 5 )
		public void logInWithoutData () {
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("");
			wdwait = new WebDriverWait(driver, 15);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("");
			wdwait = new WebDriverWait(driver, 15);
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
			
			String actualText = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li")).getText();
			assertEquals(actualText, "Error: Username is required.");
		
		}
		
		@AfterMethod 
		public void posleSvakogTesta() {		
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
		}
		@AfterClass 
		public void posleSvihTestova() {		
			driver.close();
		}
	}
