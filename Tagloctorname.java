import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagloctorname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement login=driver.findElement(By.tagName(null));
		login.click();
		
	}

}
		