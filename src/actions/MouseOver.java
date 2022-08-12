package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseOver {
	WebDriver adriver;

	@BeforeClass
	public void Open_Aut() {
		adriver = new ChromeDriver();
		adriver.get("https://www.amazon.in/");
		adriver.manage().window().maximize();
		adriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}

	@Test
	public void mouseOver() throws InterruptedException {
		WebElement ele = adriver.findElement(By.linkText("Today's Deals"));

		//Creating object of an Actions class
		Actions action = new Actions(adriver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
	}

	@AfterClass
	public void Cloase_Aut() {
		adriver.quit();
	}

}
