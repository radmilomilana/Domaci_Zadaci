package domaci_pages_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount_vezbanje {
	WebDriver mojDriver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement rememberMeBox;
	WebElement logIn;
	WebElement logOut;
	
	public MyAccount_vezbanje(WebDriver mojDriver) {
		super();
		this.mojDriver = mojDriver;
	}

	public WebElement getUsernameField() {
		return mojDriver.findElement(By.id("username"));
	}

	public WebElement getPasswordField() {
		return mojDriver.findElement(By.id("password"));
	}

	public WebElement getRememberMeBox() {
		return mojDriver.findElement(By.id("rememberme"));
	}

	public WebElement getLogIn() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
	}
	
	public WebElement getLogOut() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
	}
	
	public void usernameInput(String username) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);
	}
	public void passwordInput(String password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
    public void rememberMeCheckBoxCheck() {
    	this.getRememberMeBox().click();
    }
    public void logInButtonClick() {
    	this.getLogIn().click();
    }
    public String logOutButtonText() {
    	return this.getLogOut().getText();
    }

}
