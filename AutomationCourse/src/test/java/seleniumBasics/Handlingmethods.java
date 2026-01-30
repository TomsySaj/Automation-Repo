package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handlingmethods extends Base {
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement simpleAlertButton=driver.findElement(By.id("alertButton"));
		simpleAlertButton.click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept(); 
		
	}
public void verifyConfirmAlert()
{
	driver.navigate().to("https://demoqa.com/alerts");
	
	WebElement confirmAlertButton=driver.findElement(By.id("confirmButton"));
	confirmAlertButton.click();
	Alert confirmAlert=driver.switchTo().alert();
	//confirmAlert.accept(); 
	confirmAlert.dismiss();
	
}
public void verifyPromptAlert()
{
	driver.navigate().to("https://demoqa.com/alerts");
	
	WebElement promptAlertButton=driver.findElement(By.id("promtButton"));
	promptAlertButton.click();
	Alert promptAlert=driver.switchTo().alert();
	promptAlert.sendKeys("Tomsy");
	promptAlert.accept();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handlingmethods handle=new Handlingmethods();
		handle.browserLaunch();
		//handle.verifySimpleAlert();
		//handle.verifyConfirmAlert();
		handle.verifyPromptAlert();
		

	}

}
