package TakeScreenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshotConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Take screenshot & store as a file format
		 File ss = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 // now copy the screenshot to particular location using copy file //method
		 FileUtils.copyFile(ss, new File("D:\\Mourya.png"));

	}

}
