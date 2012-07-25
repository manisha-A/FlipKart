package tw.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ResultsPage {
	public FirefoxDriver webDriver;
	//public HomePage homePage;
	private static final String Results_title = "allresults_info";

	public ResultsPage(FirefoxDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void navigateToResultsPage() {
		webDriver.findElementByPartialLinkText("Books (").click();
	}

	public String getSearchResultTitle() {
		return webDriver.findElementById(Results_title).getText();
	}
	
	public void selectBook(String bookName){
		webDriver.findElementByPartialLinkText(bookName).click();
	}
	
	public void addItemToCart(){
		
	}

	public boolean getIsBooksHomeTextIsDisplayed() {
		return webDriver.findElementByLinkText("Books Home").isDisplayed();
	}
}