//20 march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement Upload = driver.findElement(By.id("uploadfile_0"));
		Upload.sendKeys("E:\\Introduction.automation.docx");
		WebElement submit =driver.findElement(By.id("Submitbutton"));
		submit.click();
		
	}

}
