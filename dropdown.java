//16-Marchprogram1

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
	     WebElement country = driver.findElement(By.name("country"));
	     Select select = new Select(country);
//	     1.Select by visible text
	     select.selectByVisibleText("CHINA");
	     
//	     2.select by value
//	     select.selectByValue("BERMUDA");
	     
//	     3select by index
	     select.selectByIndex('6');     	
	}
}
