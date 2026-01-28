package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements  extends Base {
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgbox =driver.findElement(By.id("single-input-field"));	
		msgbox.sendKeys("Selenium");
		WebElement showmsgbtn=driver.findElement(By.id("button-one"));
		showmsgbtn.click();
		WebElement msgdisplay=driver.findElement(By.id("message-one"));
		System.out.println(msgdisplay.getText());
		msgbox.clear();
		System.out.println(showmsgbtn.getTagName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElements webelement=new HandlingWebElements();
		webelement.browserLaunch();
		webelement.verifyWebElement();

	}

}
