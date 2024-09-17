package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
	
	private WebDriver driver;
	private By useridfield=By.name("uid");
	private By passwordfield=By.name("password");
	//private By loginbutton=By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	private By loginbutton=By.name("btnLogin");
	
	
	public IndexPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  void setuserid(String userid) {
		driver.findElement(useridfield).sendKeys(userid);
	}
	
	public  void setpassword(String password) {
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	public ManagerHomePage clickloginbutton() {
		driver.findElement(loginbutton).click();
		return new ManagerHomePage(driver);
	}
	

	public void clickloginbutton1() {
		driver.findElement(loginbutton).click();
		driver.switchTo().alert().accept();	
	}
	
	
	

}
