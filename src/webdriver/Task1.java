package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://en.prothomalo.com/entertainment");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.get("https://en.prothomalo.com/business");
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

	
}
