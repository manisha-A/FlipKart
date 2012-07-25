package tw.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	private static final String SEARCH_BOX = "fk-top-search-box";
	public FirefoxDriver webDriver;
	
	public HomePage(FirefoxDriver webDriver){
		this.webDriver = webDriver;
	}

	public void search(String searchString) {
		WebElement searchbox = webDriver.findElementById(SEARCH_BOX);
		searchbox.sendKeys(searchString);
		searchbox.submit();
	}
	
	public int getCartCount(){
		return Integer.parseInt(webDriver.findElementById("item_count_in_cart_top_displayed").getText());
	}
}