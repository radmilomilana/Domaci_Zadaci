package domaci_pages_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage_domaci  {
	
	WebDriver mojDriver;
	WebElement whatsInCart;
	WebElement cartsTotal;
	WebElement removeFromCartClick;
	WebElement emptyCartMessage;
	

	public CartPage_domaci(WebDriver mojDriver) {
		super();
		this.mojDriver = mojDriver;
	}
	
	public WebElement getWhatsInCart() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}

	public String whatsInCart() {
		return this.getWhatsInCart().getText();
	}

	public WebElement getCartsTotal() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div[2]/div/table/tbody/tr[3]/td/strong/span"));
	}

	public String cartsTotal() {
		return this.getCartsTotal().getText();
	}

	public WebElement getRemoveFromCartClick() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}

	public void removeFromCartClick() {
		this.getRemoveFromCartClick().click();
	}

	public WebElement getEmptyCartMessage() {
		return mojDriver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
	}
	public String textFromEmptyCartMessage() {
		return this.getEmptyCartMessage().getText();
	}
}
