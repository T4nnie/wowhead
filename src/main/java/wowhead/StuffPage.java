package wowhead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StuffPage extends BasePage {

	public StuffPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@data-visible=\"yes\"]")
	private WebElement rectInfoStuff;
	public String exctractTableInfo() {	
		//String leBordelInfo = rectInfoStuff.findElements(By.xpath(".//")).stream().map(s->s.getText()).reduce("",(a,b)->a+b);
		return rectInfoStuff.getText() ;
	}

}
