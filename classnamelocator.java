//7 march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/facebook.html");
//		WebElement username =driver.findElement(By.className("inputtext"));
//		WebElement password =driver.findElement(By.className("inputtext"));
//		username.sendKeys("priyanka");
//		password.sendKeys("priyanka@123");	
		
//		................................practise.........................................
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
         WebElement username =driver.findElement(By.className("inputtext"));
		WebElement password =driver.findElement(By.className("inputtext"));
		username.sendKeys("priyanka");
		password.sendKeys("sagar@123");
		
		
	}
}
