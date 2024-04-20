//03-april-2024
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotexample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
//		firstly we are creating reference of take screenshot interface 
        TakesScreenshot ts = (TakesScreenshot)driver;
        		
//	     calling get screenshotes method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
				
//	     move the file into new destination folder
		File destFile = new File("E:\\image\\error.png");
		
//		we will copy the scrrenshot into destination folder
		Files.copy(srcFile, destFile);
	
	}

}
