package domaci_pages_01_06;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	public class MainNavigationDomaci {
		WebDriver driver;
	
		WebElement shopPageTab;
		WebElement cartPageTab;
		WebElement myAccountPageTab;
		
		public MainNavigationDomaci(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
		public WebElement getShopPageTab () {
			return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a"));
		}
		
		public void shopPageTabClick() {
			this.getShopPageTab().click();
		}
		
		public WebElement getCartPageTab() {
			return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
		}
		
		public void cartPageTabClick() {
			this.getCartPageTab().click();
		}

		public WebElement getMyAccountPageTab() {
			return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
		}
		public void myAccountTabClick() {
			this.getMyAccountPageTab().click();
		}
	}
