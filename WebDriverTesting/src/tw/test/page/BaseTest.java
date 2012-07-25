package tw.test.page;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import tw.test.HomePage;
import tw.test.ResultsPage;

public class BaseTest {
	public FirefoxDriver webDriver;
	protected HomePage homePage;
	protected ResultsPage resultPage;
	private static final String URL = "http://flipkart.com";
	
	public BaseTest() {
		//this.webDriver = webDriver;
	}

	@After
	public void closeApp(BookSearch bookSearch) {
		webDriver.close();
	}

	@Before
	public void launchApp(BookSearch bookSearch) {
		if(webDriver == null)
			webDriver = new FirefoxDriver();
		webDriver.get(URL);
		homePage = new HomePage(webDriver);
		resultPage = new ResultsPage(webDriver);
	}
}