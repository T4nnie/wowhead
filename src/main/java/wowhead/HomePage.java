package wowhead;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//gère les cookies et autres
	@FindBy(xpath="//button[@id=\"onetrust-accept-btn-handler\"]")
	private WebElement boutonAccepterCookies ;
	
	public void cookieSetUp() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boutonAccepterCookies.click();
	}
	
	@FindBy(xpath="//button[@class=\"notifications-dialog-buttons-decline btn\"]")
	private WebElement refuserNotif ;
	
	public void refuserNotififcation() {
		wait.until(ExpectedConditions.visibilityOf(refuserNotif));
		refuserNotif.click();
	}
	
	@FindBy(xpath="//input[@placeholder=\"Rechercher des guides, des infos, ou dans la base de données…\"]")
	private WebElement champsInputRechercher ;
	
	public ResultPage faireUnerecherche(String text) {
		
		champsInputRechercher.sendKeys(text);
		champsInputRechercher.sendKeys(Keys.RETURN);
		return new ResultPage(this.driver);
		
	}

}
