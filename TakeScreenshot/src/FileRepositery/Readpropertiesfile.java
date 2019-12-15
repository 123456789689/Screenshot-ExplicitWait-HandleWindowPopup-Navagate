package FileRepositery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readpropertiesfile {

	static WebDriver d;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\DELL\\git\\Selenium\\TakeScreenshot\\src\\FileRepositery\\config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);

		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
/*
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			d = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
			d = new FirefoxDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.gecko.driver", "D:\\driver\\internetexplorer.exe");
			d = new InternetExplorerDriver();
		}*/
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(url);
	}
}
