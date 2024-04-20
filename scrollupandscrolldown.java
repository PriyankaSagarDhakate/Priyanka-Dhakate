// 02 april 2024
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupandscrolldown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		// to scroll down  we need to give positive value
		js.executeScript("window.scrollBy(0,700)");
		
//		to scroll  up we need to negative value
		js.executeScript("window.scrollBy(0,-500)");

		
		
	}

}
