package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class RightClick {
	WebDriver adriver;

	@BeforeClass
	public void Open_Aut() {
		adriver = new ChromeDriver();
		adriver.get("https://www.amazon.in/");
		adriver.manage().window().maximize();
		adriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

	}

	@Test
	public void rightClick() throws InterruptedException {
		WebElement findElement = adriver
				.findElement(By.linkText("Electronics"));
		Actions action = new Actions(adriver);
		action.contextClick(findElement).perform();
		
		Thread.sleep(10000);
	
		
	}

	@AfterClass
	public void Cloase_Aut() {
		adriver.quit();
	}

}
