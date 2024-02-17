package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textbox_Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//System.out.println(driver);
		driver.get("https://www.mycontactform.com/samples.php");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//textbox
		driver.findElement(By.id("subject")).sendKeys("email");
		
		driver.findElement(By.id("email")).sendKeys("shaidulazam@gmail.com");
		
		//checkbox
		
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
		
		
		List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input"));
		for(WebElement ele1:ls)
		{
			System.out.println(ele1);
			System.out.println(ele1.getText());
		}
		//dropdown
		
		WebElement ele=driver.findElement(By.id("q3"));
		Select s=new Select(ele);
		s.selectByVisibleText("First Option");
		
		driver.close();

}
}
