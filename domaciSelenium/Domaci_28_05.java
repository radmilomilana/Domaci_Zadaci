package domaciSelenium;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Domaci_28_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		
		
		js.executeScript("window.open()");
		
		
		driver.getWindowHandle();
		ArrayList<String> listaRuckiProzora = new ArrayList<String>(driver.getWindowHandles());
		
		for (int i = 0; i < listaRuckiProzora.size(); i++) {
			System.out.println(listaRuckiProzora.get(i));
		}
		
		WebDriverWait cekanje = new WebDriverWait (driver, 15);
		
		driver.switchTo().window(listaRuckiProzora.get(2));
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.switchTo().window(listaRuckiProzora.get(1));
		driver.navigate().to("https://www.youtube.com/");
		
		
		driver.switchTo().window(listaRuckiProzora.get(2));
		driver.close();
		
		driver.switchTo().window(listaRuckiProzora.get(0));
		
		WebElement elements = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")));
		elements.click();
		
		
		WebElement textBook =cekanje.until(ExpectedConditions.elementToBeClickable(By.id("item-0")));
		textBook.click();
		
		
		WebElement name = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
		name.sendKeys("Milana Radmilo");
		
		
		WebElement email = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
		email.sendKeys("milana@gmail.com");
		
		
		WebElement currentAddress = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("currentAddress")));
		currentAddress.sendKeys("Novi Sad");
		
		
		WebElement permanentAddress = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("permanentAddress")));
		permanentAddress.sendKeys("Novi Sad");
		
		
		WebElement submitButton = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"submit\"]")));
		submitButton.click();
		
		
		if (submitButton.isDisplayed()) {
			System.out.println("podaci su prikazani.");
		}
		else {
			System.out.println("podaci nisu prikazani.");
		}
		
		WebElement checkBox = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("item-1")));
		checkBox.click();
	
		
		WebElement homeButton = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tree-node\"]")));
		homeButton.click();
		
		
		if (homeButton.isSelected()) {
			System.out.println("Home button je cekiran.");
			
		}
		else {
			System.out.println("Home button nije cekiran.");
		}
		
		WebElement radioBox = cekanje.until(ExpectedConditions.elementToBeClickable(By.id("item-2")));
		radioBox.click();
		
		
		WebElement yesButton = cekanje.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")));
		yesButton.click();
		
		
		if (yesButton.isSelected()) {
			System.out.println("Izabrano je 'yes' polje. ");
		}
		else {
			System.out.println("Nije izabrano 'yes' polje. ");
		}
		
		driver.quit();
		
		System.out.println("Kraj programa.");
		
		
	}

}
