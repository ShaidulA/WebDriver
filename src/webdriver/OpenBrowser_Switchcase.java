package webdriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser_Switchcase {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		
		switch(browser)
		{

		case "chrome":
		{
			driver=new ChromeDriver();
			break;
			
		}
		case "edge":
		{
			driver=new EdgeDriver();
			break;
		}
	}

}
}
