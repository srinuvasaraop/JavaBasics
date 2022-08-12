package selectandmultiselect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiselect_demo {
	WebDriver driver;
	String selecturl;

	@BeforeClass
	public void Launch_Aut() {
		driver = new FirefoxDriver();
		selecturl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	@Test
	public void select() throws InterruptedException {
		driver.get(selecturl);
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement ele = driver.findElement(By.id("cars"));
		Select sel = new Select(ele);
		if (sel.isMultiple()) {
			sel.selectByIndex(1);
			Thread.sleep(2000);
			sel.selectByIndex(2);
			Thread.sleep(2000);
			sel.deselectAll();
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
		}
		else
		{
			System.out.println("above is not multi select");
		}

	}

	@AfterClass
	public void Close_Aut() {
		 driver.close();
	}
}
