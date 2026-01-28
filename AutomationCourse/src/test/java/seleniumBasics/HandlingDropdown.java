package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown  extends Base {
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
		
		
		
	}
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		
		
	}
	public void verifyRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='green']"));
		radiobutton1.click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown drop=new HandlingDropdown();
		drop.browserLaunch();
		drop.verifyDropdown();
		drop.verifyCheckbox();
		drop.verifyRadiobutton();
		
		

	}

}
