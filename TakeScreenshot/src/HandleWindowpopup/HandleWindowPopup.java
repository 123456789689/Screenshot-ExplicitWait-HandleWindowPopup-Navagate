package HandleWindowpopup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.popuptest.com/");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		d.findElement(By.xpath("//a[contains(text(),'Sticky popup')]")).click();

		Set<String> count = d.getWindowHandles(); // .getWindowHandles use to get window id
		//Set is used to store content in the form of String not in the index
		//So when Set is used use Iterator

		Iterator<String> it = count.iterator();

		String childwindow = it.next(); // Navigates to 1st content

		System.out.println("Childelement id:" + childwindow);

		String str = d.getTitle();

		System.out.println("Child Title:" + str);
		
		String parentwindow = it.next();
		System.out.println("parentwindow id:" + parentwindow);
		
		String str2 = d.getTitle();
		System.out.println("parent window title:" + str2);

	}

}
