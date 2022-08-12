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

public class DobleClick {
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
		Thread.sleep(5000);
		adriver.navigate()
				.to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		adriver.switchTo().frame("iframeResult");
		Actions act = new Actions(adriver);
		// Locate WebElement to perform double click
		WebElement btnElement = adriver
				.findElement(By
						.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		// Double Click the button
		act.doubleClick(btnElement).perform();
		Thread.sleep(6000);
}
	@AfterClass
	public void Cloase_Aut() {
		adriver.quit();
	}
}