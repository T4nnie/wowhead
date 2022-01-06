package wowhead;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BossPage extends BasePage{

	public BossPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//tr[@class=\"listview-row\"]")
	private List<WebElement> liensLoot;
	
	public List<WebElement> lootsList(){
			return liensLoot ;			
	}

}
