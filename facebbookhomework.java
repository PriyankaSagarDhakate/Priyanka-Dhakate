//12 march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebbookhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//      1.by using tag and class name
		WebElement un = driver.findElement(By.cssSelector("input.inputtext"));	
		
//		2.by using tag and id
		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		un.sendKeys("priyankanevkar1432@gmail.com");
		pass.sendKeys("Priyanka@1994");
		
//      3.by using the tag class and attribute
		WebElement un1 = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		
//      4.by using tag class and attribute
		WebElement pass1 = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
		un1.sendKeys("priyankanevkar1432@gmail.com");
		pass1.sendKeys("Priyanka@1994");
		
//		 5.by using tag id and attribute	
	    WebElement login = driver.findElement(By.cssSelector("input#u_0_1_pB[type='submit'][value=log in]"));
	    login.click();
		

	}

}
