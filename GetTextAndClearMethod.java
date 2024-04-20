//12-march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username=driver.findElement(By.id(null));
		
		username.sendKeys("priya");

		
		//to clear the populated text in textbox we need to 
		
		username.clear();
		
		//
		WebElement text=driver.findElement(By.tagName("h1"));
		
		String value=text.getText();
		System.out.println(value);
				
	}

}