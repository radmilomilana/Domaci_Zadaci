package domaci_03_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement logInButton;
	
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.xpath("//*[@id=\"lpc-header-nav\"]/div/div/div[1]/div/nav/ul[2]/li[1]/a"));
		
	}
	public void logInClick() {
		this.getLogInButton().click();
	}
	
}
