package domaci_tests_01_06;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn_Vezbanje_Tests extends BaseTests {

	@BeforeMethod
	public void preSvakogTesta() {
		mojDriver.navigate().to("http://cms.demo.katalon.com/");
		mojDriver.manage().window().maximize();
		mojDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void logInValidDataTest() {
		mainNavigationDomaci.myAccountTabClick();
		myaccount_vezba.usernameInput("customer");
		myaccount_vezba.passwordInput("123456789");
		myaccount_vezba.rememberMeCheckBoxCheck();
		myaccount_vezba.logInButtonClick();
		
		
		String actual = myaccount_vezba.logOutButtonText();
		assertEquals(actual, "Log out");
	}
}
