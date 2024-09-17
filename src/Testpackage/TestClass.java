package Testpackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Basepackage.BaseClass;
import Pagepackage.ManagerHomePage;

public class TestClass extends BaseClass {
	
	@Test
	public void loginSuccessfullytest() {
		
		index.setuserid("mngr589601");
		index.setpassword("sutudaz");
		ManagerHomePage managerhomepage=index.clickloginbutton();
		assertTrue(managerhomepage.textverification().contains("Manger Id : mngr589601")) ; 
		managerhomepage.clicklogout();
	}
	
	@Test
	public void notloginSuccessfullytest() {
		
		index.setuserid("123");
		index.setpassword("123");
		index.clickloginbutton1();
	}
	
}
