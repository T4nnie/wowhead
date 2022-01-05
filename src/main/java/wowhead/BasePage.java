package wowhead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    //Constructor
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    @FindBy(xpath="//a[@class=\"header-logo\"]")
    private WebElement acceuil ;
    
    public HomePage acceuil() {
    	acceuil.click();
    	return new HomePage(this.driver);    	
    }
}