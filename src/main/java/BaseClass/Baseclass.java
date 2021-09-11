package BaseClass;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	public Baseclass(){ 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./Config.Properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setUp() { 		
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
	driver= new ChromeDriver();

}
}