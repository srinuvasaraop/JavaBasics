package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragNDrop {
	WebDriver adriver;
//this program is not working bcz website problem //
	@BeforeClass
	public void Open_Aut() {
		adriver = new ChromeDriver();
		adriver.get("https://www.amazon.in/");
		adriver.manage().window().maximize();
		adriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void dragNdrop()  {
		try
		{
			
			adriver.navigate()
					.to("https://www.w3schools.com/html/html5_draganddrop.asp");
			Thread.sleep(5000);
			//adriver.switchTo().frame(adriver.findElement(By.xpath("//iframe[@id='iframeResult']")));
			//System.out.println(adriver.findElement(By.xpath("//div[@id='div1']/parent::body/h2")).getText());
			// WebElement on which drag and drop operation needs to be performed
			WebElement fromElement = adriver.findElement(By.xpath("//div[@id='belowtopnav']/descendant::div[@id='div1']"));
			// WebElement to which the above object is dropped
			WebElement toElement = adriver.findElement(By.xpath("//div[@id='belowtopnav']/descendant::div[@id='div2']"));
							// Performing the drag and drop action
//			Actions action = new Actions(adriver);
//			action.dragAndDrop(fromElement, toElement).build().perform();
			
			dragAndDrop(fromElement,toElement);
//			action.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
			
		}
		catch(Exception ec)
		{
			System.out.println(ec.getMessage());
		}
		
	}
	public void dragAndDrop(WebElement source, WebElement target) throws AWTException  {
	    new Actions(adriver).dragAndDrop(source, target).release().build().perform();
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ESCAPE);
	    robot.keyRelease(KeyEvent.VK_ESCAPE);
	}
	@AfterClass
	public void Cloase_Aut() {
		 //adriver.quit();
	}

}
