package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	String selecturl;

	@BeforeClass
	public void Launch_Aut() {
		driver = new FirefoxDriver();
		selecturl = "https://www.indiehackers.com/sign-in";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}
	@Test
	public void Alert_demo() throws InterruptedException
	{
		driver.get(selecturl);
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("p.srinu4b1@gail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	@AfterClass
	public void Close_Aut()
	{
		//driver.close();
	}
}
