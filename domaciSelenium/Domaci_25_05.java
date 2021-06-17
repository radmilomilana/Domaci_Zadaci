package domaciSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci_25_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to(" https://demoqa.com/ ");
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		elements.click();
		WebElement textBook = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
		textBook.click();
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullName.clear();
		fullName.sendKeys("Milana Radmilo");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("milana@gmail.com");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
		checkBox.click();
		WebElement strelica = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		strelica.click();
		WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span"));
		desktop.click();
		WebElement elementsback = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div"));
		elementsback.click();
		Thread.sleep(5000);
		driver.close();

	}

}
