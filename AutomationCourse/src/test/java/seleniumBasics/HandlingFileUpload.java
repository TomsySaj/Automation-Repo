package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbutton=driver.findElement(By.id("uploadfile_0"));
		uploadbutton.sendKeys("C:\\Users\\TOMSY SAJ\\git\\Automation-Repo\\AutomationCourse\\src\\main\\resources\\REGISTRATION PROCESS NEED TO ATTACH WITH EXAM INSTRUCTION.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.id("submitbutton"));
		submitbutton.click();
		
		
	}
	public void verifyFileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadbutton=driver.findElement(By.id("pickfiles"));
		uploadbutton.click();
		StringSelection Selection=new StringSelection("C:\\Users\\TOMSY SAJ\\git\\Automation-Repo\\AutomationCourse\\src\\main\\resources\\REGISTRATION PROCESS NEED TO ATTACH WITH EXAM INSTRUCTION.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		Robot r=new Robot();
		 r.delay(2500);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_V);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		
		
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupload=new HandlingFileUpload();
		fileupload.browserLaunch();
		//fileupload.verifyFileUploadUsingSendKeys();
		try {
			fileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
