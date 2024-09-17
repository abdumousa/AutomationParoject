package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerHomePage {
 private WebDriver driver;
 private By text=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
// private By text=By.linkText("Manger Id : mngr589601");
 private By logout = By.linkText("Log out");
	
	public ManagerHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String textverification() {
		return driver.findElement(text).getText();	
		}
	
	public IndexPage clicklogout() {
		driver.findElement(logout).click();
		driver.switchTo().alert().accept();
		return new IndexPage(driver);
	}
}
