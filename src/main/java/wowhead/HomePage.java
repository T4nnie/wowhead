package wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//gère les cookies et autres
	public void cookieSetUp() {
		
	}
	
	@FindBy(xpath="//")
	private WebElement champsInputRechercher ;
	
	public ResultPage faireUnerecherche(String text) {
		
		champsInputRechercher.sendKeys(text);
		return new ResultPage(this.driver);
		
	}

}
