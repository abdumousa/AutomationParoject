package Basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pagepackage.IndexPage;


public class BaseClass {
	public WebDriver driver;
	protected IndexPage index;
	
	@BeforeClass
	public void setup() {
     //   System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
       // driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/index.php");
        driver.manage().window().maximize();
        index =new IndexPage(driver);
      
    }
    
    @AfterClass
    public void teardown() {
    	driver.quit();
    }

}
