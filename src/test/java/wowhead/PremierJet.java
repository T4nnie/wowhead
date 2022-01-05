package wowhead;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierJet {
	WebDriver driver;
	
	@BeforeEach
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void run() {
		driver.get("https://fr.wowhead.com/");
		HomePage homePage = new HomePage(driver);
		homePage.cookieSetUp();
		ResultPage laurderSearch = homePage.faireUnerecherche("laurdeur");
		
		
	}

}
