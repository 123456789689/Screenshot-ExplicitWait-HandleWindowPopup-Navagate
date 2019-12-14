package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBetweenURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		d.navigate().to("https://www.google.com/");     //Always use .navigate().to(""); for navigating to child URL 
		d.navigate().forward();
		d.navigate().back();
		d.navigate().refresh();
		
	}

}
