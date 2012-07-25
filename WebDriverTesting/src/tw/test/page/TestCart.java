package tw.test.page;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import tw.test.HomePage;
import tw.test.ResultsPage;

public class TestCart {
	private static final String URL = "http://flipkart.com";
	public FirefoxDriver webDriver;
	
	HomePage pageHeader;
	ResultsPage resultPage;

	@Test
	public void VerifyCartGetsUpdated() {
		pageHeader.search("Casino Royale");
		resultPage.navigateToResultsPage();
		resultPage.selectBook("James Bond : Casino Royale");
		resultPage.addItemToCart();
		Assert.assertEquals(1, pageHeader.getCartCount());
	}
	
	@After
	public void closeApp() {
		webDriver.close();
	}

	@Before
	public void launchApp() {
		if(webDriver == null)
			webDriver = new FirefoxDriver();
		webDriver.get(URL);
		pageHeader = new HomePage(webDriver);
		resultPage = new ResultsPage(webDriver);
	}

}
