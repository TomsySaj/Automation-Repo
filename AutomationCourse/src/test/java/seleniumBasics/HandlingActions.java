package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void rightClick() {
		WebElement other=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.contextClick(other).build().perform();
		
		//code for actions class
	}
	public void verifyMouseHover()
	{
		WebElement mousehover=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).build().perform();
	}
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions handlingactions=new HandlingActions();
		handlingactions.browserLaunch();
		//handlingactions.rightClick();
		//handlingactions.verifyMouseHover();
		handlingactions.verifyDragAndDrop();
		
		

	}

}
