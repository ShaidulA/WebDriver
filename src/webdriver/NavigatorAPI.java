package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatorAPI {

	public static void main(String[] args) throws InterruptedException {
		//open the chrome driver and launches the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//redirects to the google home page
		driver.get("https://www.google.com/");
		
		//Navigation
		driver.get("https://www.mycontactform.com/samples.php");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com/");
		//driver.close();
		//driver.quit();

	}

}
