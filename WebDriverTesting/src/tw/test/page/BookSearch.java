package tw.test.page;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tw.test.HomePage;
import tw.test.ResultsPage;
import tw.test.page.BaseTest;


public class BookSearch extends BaseTest{
	//public FirefoxDriver webDriver;
	//private static final String URL = "http://flipkart.com";
	
	//BaseTest bt ;
	//HomePage homePage;
	//ResultsPage resultPage;

	@Test
	public void VerifyTheSearchResult() {
		String searchString = "The Choice";
		homePage.search(searchString);
		String searchTitle = resultPage.getSearchResultTitle();
		Assert.assertTrue(searchTitle.contains(searchString));
	}

	@Test
	public void verifyLandingToBooksPageFromSearch(){
		String searchString = "The Choice";
		homePage.search(searchString);
		resultPage.navigateToResultsPage();
		Assert.assertTrue(resultPage.getIsBooksHomeTextIsDisplayed());
	}
	
}
