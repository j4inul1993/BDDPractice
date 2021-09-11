package CommonUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import PageFactory.MainPageFact;

public class Utility{

	public static void Screenshot(WebDriver driver,String picturename) throws IOException {
		File folder = new File("./target/screenshot");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File(picturename+".png"));	
	}
	
	public static void Highlighter(WebDriver driver) {
		
		MainPageFact obj=new MainPageFact(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement user=obj.getUsername();
		js.executeScript("arguments[0].style.border='5px solid yellow'", user);
		
		WebElement password=obj.getPassword();
		js.executeScript("arguments[0].style.border='5px solid yellow'", password);
		
		WebElement button=obj.getLoginbutton();
		js.executeScript("arguments[0].style.border='5px solid red'", button);
		
	}
}
