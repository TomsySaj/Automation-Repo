package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement clickherebutton=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickherebutton.click();
		Set<String> handleids=driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String> it=handleids.iterator();
		while(it.hasNext())
		{
			String currentid=it.next();
			if(!currentid.equals(parentwindow))
			{
				driver.switchTo().window(currentid);
				WebElement emailidtextbox=driver.findElement(By.name("emailid"));
				emailidtextbox.sendKeys("test@gmail.com");
				WebElement submitbutton=driver.findElement(By.name("btnLogin"));
				submitbutton.click();
				
			}
		} 
		
			
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MultipleWindowHandling multiplewindow=new MultipleWindowHandling();
		multiplewindow.browserLaunch();
		multiplewindow.verifyMultipleWindow();
		

	}

}
