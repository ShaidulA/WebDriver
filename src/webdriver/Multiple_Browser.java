package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Browser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//System.out.println(driver);
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();

	}

}
