package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.remote.session.ChromeFilter;

public class ChromeHeadless {

	public static void main(String[] args) {
		//work in headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
