package wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

	public ResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//td[@class=\"icon-boss-padded\"]")
	private WebElement leLienBoss ;
	public BossPage selectABoss() {
		leLienBoss.click();
		return new BossPage(this.driver);
	}

}
