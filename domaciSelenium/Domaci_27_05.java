package domaciSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci_27_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/");
		driver.manage().window().maximize();
		
		
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
		elements.click();
		Thread.sleep(3000);
		
		WebElement textBook = driver.findElement(By.id("item-0"));
		textBook.click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("Milana Radmilo");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("milana@gmail.com");
		Thread.sleep(3000);
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Novi Sad");
		Thread.sleep(3000);
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("Novi Sad");
		Thread.sleep(3000);
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		submitButton.click();
		Thread.sleep(3000);
		
		if (submitButton.isDisplayed()) {
			System.out.println("podaci su prikazani.");
			
			
		}
		else {
			System.out.println("podaci nisu prikazani.");
			
		}
		
		WebElement checkBox = driver.findElement(By.id("item-1"));
		checkBox.click();
		Thread.sleep(3000);
		
		WebElement homeButton = driver.findElement(By.className("rct-checkbox"));
		homeButton.click();
		Thread.sleep(3000);
		
		if (homeButton.isEnabled()) {
			System.out.println("Home button je cekiran.");
			
		}
		else {
			System.out.println("Home button nije cekiran.");
		}
		
		WebElement radioBox = driver.findElement(By.id("item-2"));
		radioBox.click();
		Thread.sleep(3000);
		
		WebElement yesButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
		yesButton.click();
		Thread.sleep(3000);
		
		if (yesButton.isEnabled()) {
			System.out.println("Izabrano je 'yes' polje. ");
		}
		else {
			System.out.println("Nije izabrano 'yes' polje. ");
		}
		
		System.out.println("Kraj programa.");

	}

}
