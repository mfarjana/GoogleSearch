package GoogleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC_001 {

	//WebDriver driver = new FirefoxDriver();

	public WebDriver driver;

	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("this is open browser");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void Test_1() throws InterruptedException {

		System.out.println("This is test 001");

		driver.findElement(By.name("q")).sendKeys("Dhaka University");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
	}

	@Test
	public void Test_2() throws InterruptedException {
		System.out.println("This is test 002");
		Thread.sleep(3000);

		driver.findElement(By.name("q")).sendKeys("New York City");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(3000);
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
