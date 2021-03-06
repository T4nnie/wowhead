package wowhead;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PremierJet {
	WebDriver driver;
	
	
	@Before
	public void setUp() {
		String p = System.getProperty("BROWSER");
		p = p.toLowerCase();
		if (!p.isEmpty() && p.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.edge.driver","src/main/resources/driver/msedgedriver.exe");
			driver = new EdgeDriver();			
		}
		
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void run() {
		driver.get("https://fr.wowhead.com/");
		HomePage homePage = new HomePage(driver);
		homePage.cookieSetUp();
		homePage.refuserNotififcation();
		ResultPage lardeurSearch = homePage.faireUnerecherche("lardeur");
		BossPage lardeurPage = lardeurSearch.selectABoss();
		List<WebElement> listeDuLoot = lardeurPage.lootsList();
		int sizeLoot = listeDuLoot.size();
		System.out.println(sizeLoot);
		
		for (int i=0; i<sizeLoot; i++) {
			listeDuLoot.get(i).click();
			StuffPage pageStuff = new StuffPage(driver);
			System.out.println(i);
			System.out.println(pageStuff.exctractTableInfo());
			driver.navigate().back();
		}
		System.out.println("*****FIN****");
		//List <String> lesInfosLoot = listeDuLoot.stream().map(s -> {s.click(); });
		
	}

}
