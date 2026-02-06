package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//switch to frame by id
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement heading1=driver.findElement(By.id("sampleHeading"));
		System.out.println(heading1.getText());
		//switch back to main page
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frame=new HandlingFrames();
		frame.browserLaunch();
		frame.verifyFrames();
		
		
		

	}

}
