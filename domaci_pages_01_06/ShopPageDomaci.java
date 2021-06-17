package domaci_pages_01_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPageDomaci {

	WebDriver mojDriver;
	WebElement addFlyingNinjaToCartButton;
	WebElement flyingNinjaViewCartButton;
	WebElement productInfo;
	WebElement descriptionItem;

	public ShopPageDomaci(WebDriver mojDriver) {
		super();
		this.mojDriver = mojDriver;
	}

	public WebElement getAddFlyingNinjaToCartButton() {
		return mojDriver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}

	public WebElement getflyingNinjaViewCartButton() {
		return mojDriver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]"));
	}

	public WebElement getProductInfo() {
		return mojDriver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[1]"));
	}
	

	public WebElement getDescriptionItem() {
		return mojDriver.findElement(By.xpath("//*[@id=\"product-26\"]/div[3]/div[1]/div/ul/li/div/p"));
	}

	public void addFlyingNinjaToCartButtonClick() {
		this.getAddFlyingNinjaToCartButton().click();
	}

	public void flyingNinjaViewCartButtonClick() {
		this.getflyingNinjaViewCartButton().click();
	}
	public void productInfoClick() {
		this.getProductInfo().click();
	}
	
	public String descriptionItem () {
		return this.getDescriptionItem().getText();
	}


}
