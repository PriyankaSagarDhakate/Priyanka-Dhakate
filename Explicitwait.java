import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
//	1.firstly we need to create objecy of webdrivwr wait class
		WebDriverWait =  new WebDriver(driver,Duration.ofSeconds(100));
		
//		2.
		WebElement username = driver.findElement(By.id("email"));
		
		Wait.until(Exceptedcondtions.visiblityof(username));
		username.sendKeys("priyanka");

		
		WebElement password = driver.findElement(By.id("password"));
		Wait.until(ExceptedCondition.presenceofElementLocated(By.id("pass")));
		password.sendKeys("priyanka123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		Wait.until(ExceptedCondtion.presenceofElementToBeclickable(login));
         login.click();
         
	}

}
