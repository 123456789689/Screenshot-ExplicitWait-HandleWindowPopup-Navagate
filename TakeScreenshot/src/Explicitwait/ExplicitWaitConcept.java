package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept { // Explicit wait is used for particular element to perform action

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

		clickon(d, d.findElement(By.xpath("//input[@id='u_0_b']")), 20); // As this method is a static no need to create object
		/*
		 * ExplicitWaitConcept obj = new ExplicitWaitConcept(); //If this method is not
		 * a static then use this code create object & call obj.clickon(Driver, locator,
		 * timeout);on();
		 */

	}

	public static void clickon(WebDriver Driver, WebElement locator, int timeout) { // This is an generic method can be
																					// used for check box, button,radio
																					// button etc
		new WebDriverWait(Driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}

}
