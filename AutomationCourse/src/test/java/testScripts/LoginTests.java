package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNGBase;
import utilities.excelUtility;

public class LoginTests extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials() throws Exception
	{
		String username=excelUtility.getStringData(0, 0, "LoginPage");
		String password=excelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton(); 
		
	}
	@Test
	 public void verifyUserLoginWithValidUsernameAndInvalidPassword()throws Exception
	 {
		 
		String username=excelUtility.getStringData(1, 0, "LoginPage");
		String password=excelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
	 }
	@Test
	 public void verifyUserLoginWithInvalidUsernameAndValidPassword()throws Exception
	 {
		String username=excelUtility.getStringData(2, 0, "LoginPage");
		String password=excelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
	 }
	@Test
	 public void verifyUserloginWithInvalidCredentials()throws Exception
	 {
		String username=excelUtility.getStringData(3, 0, "LoginPage");
		String password=excelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
	 }
	 

	
}
