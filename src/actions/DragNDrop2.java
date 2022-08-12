package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop2 {
	public static void dragAndDrop(WebElement source, WebElement target,
			WebDriver adriver) throws AWTException {
		new Actions(adriver).dragAndDrop(source, target).release().build()
				.perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

	public static void main(String[] args) throws InterruptedException,
			AWTException {
		// Initiate browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Open webpage
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		// Add 5 seconds wait
		Thread.sleep(5000);
		// Create object of actions class

		// find element which we need to drag
		WebElement drag = driver.findElement(By.xpath(".//*[@id='draggable']"));
		// find element which we need to drop
		WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));
		// this will drag element to destination
		// Actions act=new Actions(driver);
		// act.dragAndDrop(drag, drop).build().perform();
		dragAndDrop(drag, drop, driver);
	}
}