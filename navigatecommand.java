//16march:Navigate command
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatecommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		1.to open the url we can use navigate to method
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
//		2.to refresh the page
		driver.navigate().refresh();
//		3.to redirec on one step back
		WebElement flight = driver.findElement(By.linkText("flight"));
		flight.click();
		Thread.sleep(1000);
		driver.navigate().back();
//		4to redirect on one step forward
		driver.navigate().forward();		
	}

}
