package domaci_03_06_tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import domaci_03_06_base.BaseTest_domaci;
//import domaci_03_06_pages.LogInPage;
//import domaci_03_06_pages.MainPage;

public class LogInTests extends BaseTest_domaci{
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("https://wordpress.com");
		driver.manage().window().maximize();
	}
	

	
	@Test 
	public void logInValidData(){
	
		String email = citacExcela.getStringData("LogInValidData", 4, 2);
		String password = citacExcela.getStringData("LogInValidData", 6, 2);
		mainPageNavigation.logInClick();
		logInPage.insertEmailOrUsername(email);
		logInPage.continueButtonClick();
		logInPage.insertPassword(password);
		logInPage.logInButtonClick();
		
		String expected = citacExcela.getStringData("LogInValidData", 9, 2);
		String actual= logInPage.welcomeMessage();
		
		assertEquals(actual, expected );
	
		
	}

	@Test 
	public void logInWrongPassword(){
	
		String email = citacExcela.getStringData("LogInWrongPassword", 4, 2);
		String password = String.valueOf(citacExcela.getIntegerData("LogInWrongPassword", 6, 2));
		mainPageNavigation.logInClick();
		logInPage.insertEmailOrUsername(email);
		logInPage.continueButtonClick();
		logInPage.insertPassword(password);
		logInPage.logInButtonClick();
		
		String expected = citacExcela.getStringData("LogInWrongPassword", 9, 2);
		String actual= logInPage.wrongDataMessage();
		
		assertEquals(actual, expected );
	}
		@Test 
	public void logInWrongEmail(){
		String email = citacExcela.getStringData("LogInWrongUsernameOrEmail", 4, 2);
		mainPageNavigation.logInClick();
		logInPage.insertEmailOrUsername(email);
		logInPage.continueButtonClick();
				
		String expected = citacExcela.getStringData("LogInWrongUsernameOrEmail", 9, 2);
		String actual= logInPage.wrongDataMessage();
		
		assertEquals(actual, expected );
	
		}
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
