package domaci_03_06_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	WebDriver driver;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement logInButton;
	WebElement WrongPasswordMessage;
	WebElement WrongUsernameOrEmailMessage;
	WebElement continueButton;
	WebElement welcomeMessage;
	
	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailInputField() {
		return driver.findElement(By.id("usernameOrEmail"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
	}

	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button"));
	}

	public WebElement getWrongDataMessage() {
		return driver.findElement(By.cssSelector(".form-input-validation.is-error"));
	}
	public WebElement getWrongEmailMessage() {
		return driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[1]/div[1]"));
	}
	
	public WebElement getWelcomeMessage() {
		return driver.findElement(By.xpath("//*[@id=\"primary\"]/main/header/div/div/span/strong"));
	}
	
	public void insertEmailOrUsername(String emailOrUsername) {
		this.getEmailInputField().clear();
		this.getEmailInputField().sendKeys(emailOrUsername);
	}

	public void insertPassword(String Password) {
		this.getPasswordInputField().clear();
		this.getPasswordInputField().sendKeys(Password);
	}
	public void continueButtonClick() {
		this.getContinueButton().click();
	}
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public String wrongDataMessage() {
		return this.getWrongDataMessage().getText();
	}
	public String wrongEmailMessage() {
		return this.getWrongEmailMessage().getText();
	}
	public String welcomeMessage() {
		return this.getWelcomeMessage().getText();
	}
}
