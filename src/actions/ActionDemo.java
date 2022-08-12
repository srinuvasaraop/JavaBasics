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

public class ActionDemo {
	WebDriver adriver;

	@BeforeClass
	public void Open_Aut() {
		adriver = new ChromeDriver();
		adriver.manage().window().maximize();
		adriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		adriver.get("https://www.amazon.in/");
	}

	@Test
	public void AmazonSerach() throws InterruptedException {
		WebElement elemen = adriver.findElement(By.id("twotabsearchtextbox"));
		elemen.sendKeys("java books");
		Actions action = new Actions(adriver);
		for (int i = 0; i < 7; i++)
			//without performwe will not get output
			action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
	}

	@AfterClass
	public void Cloase_Aut() {
		adriver.quit();
	}

}
