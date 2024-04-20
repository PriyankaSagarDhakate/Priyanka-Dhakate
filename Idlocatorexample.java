//7-march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocatorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//	    driver.get("https://demo.guru99.com/test/facebook.html");
//		//to find the element by using id locator firstly we need to create reference variable of web element interface and need to use below sysntax
//		WebElement username =driver.findElement(By.id("email"));
//		
//		// (object)
//		WebElement password =driver.findElement(By.id("pass"));
//		WebElement login =driver.findElement(By.id("log"));
//		
//		//send keys method is used to enter the value to textbox
//		username.sendKeys("priyankadhakate@123");
//		username.sendKeys("pd@123");
//		
//		//click method used to click on any button,radio button checkbox or link
//		login.click();
//	}
//}
System.setProperty( "webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/facebook.html");
WebElement username = driver.findElement(By.id("email"));
WebElement password = driver.findElement(By.id("pass"));
WebElement login = driver.findElement(By.id("log"));

username.sendKeys("priyankadhakate@123");
username.sendKeys("priya@123");
login.click();

	}}

