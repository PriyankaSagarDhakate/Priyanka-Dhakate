//29 march program3
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waystoopenurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
////1.by using the refresh mehtod
//driver.navigate().refresh();
		//
		//	2.by using get and getcurrent url method
//driver.get(driver.getCurrentUrl());

//3.
//driver.navigate().to(driver.getCurrentUrl());

//4.by using f5 keys
//driver.findElement(By.id("email")).sendKeys(Keys.F5);

//5. by using ascii value
driver.findElement(By.id("email")).sendKeys("\uE035");
	}
}
