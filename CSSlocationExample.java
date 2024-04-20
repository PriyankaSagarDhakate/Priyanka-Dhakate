//11-march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
	
//      1.by u sing tag and class name
		WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
		
//      2.by using tag and id
		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		un.sendKeys("priya");
		pass.sendKeys("priya@123");
		
		
//      3.by using the tag class and attribute
		WebElement un1 = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		
//      4.by using tag class and attribute
		WebElement pass1 = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
		un1.sendKeys("priya");
		pass1.sendKeys("priya@123");
		
		
//      5.by using tag id and attribute
		
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value=log in]"));
		login.click();
		
//		13-march-2024
		
//		6. will start with- it will find the locator based can starting character below check start with 
		WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("priya");
	
//		7.by using end with-it will find the locator based on ending character
		WebElement pass = driver.findElement(By.cssSelector("input[type$=word]"));
		pass.sendKeys("priyanka@123");
		
		//8.by using the contains it will find the loctor baseed on charcter which is perssend or not
        WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
				
		
		
		

	}

}
//id mai # tag.