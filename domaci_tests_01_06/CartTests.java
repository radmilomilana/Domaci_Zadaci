package domaci_tests_01_06;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends BaseTests {
	
		@BeforeMethod
		public void preSvakogTesta() {
			mojDriver.navigate().to("http://cms.demo.katalon.com/");
			mojDriver.manage().window().maximize();
		}
		
		@Test(priority = 0)
		public void addProductToCart() {
			shopPageDomaci.addFlyingNinjaToCartButtonClick();
			shopPageDomaci.flyingNinjaViewCartButtonClick();
			mainNavigationDomaci.cartPageTabClick();
			
			String actualText = cartPageDomaci.whatsInCart();
			assertEquals(actualText, "Flying Ninja");
			
			
	}
		@Test (priority = 5)
		public void removeProductFromCart() throws InterruptedException {
			addProductToCart();
			cartPageDomaci.removeFromCartClick();
			Thread.sleep(3000);
			
			String actualText = cartPageDomaci.textFromEmptyCartMessage();
			assertEquals(actualText, "Your cart is currently empty.");
		}
		
		@Test(priority = 10)
		public void showProduct() {
			shopPageDomaci.productInfoClick();
			
			String actualText = shopPageDomaci.descriptionItem();
			assertEquals(actualText, "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, "
					+ "ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.");
			
		}
		@Test(priority = 15)
		public void TotalInCart() {
			addProductToCart();
			
			String actualText = cartPageDomaci.cartsTotal();
			assertEquals(actualText, "$32.00");
		}
		
		
		@AfterMethod
		public void posleSvakogTesta() throws InterruptedException {		
			mojDriver.manage().deleteAllCookies();
			mojDriver.navigate().refresh();
		}
	

}
