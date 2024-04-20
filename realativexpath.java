//14 march program 2realtive

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class realativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		1.using simple xpath method by using tag and attribute
		
//        WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//        WebElement pass = driver.findElement(By.xpath("//input[@type=password"));
//        WebElement login = driver.findElement(By.xpath("//input[@value=log in"));
      
//		2.using and condition 
		
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' and  @class='inputtext']"));
//		WebElement pass =driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='log in' and @type='submit']"));
//		
		
//		3.using condition or operator
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' or @class='inputtext']"));
//		WebElement pass = driver.findElement(By.xpath("//input[@id='pass' or @tableindex='1000']"));				
//		WebElement login = driver.findElement(By.xpath("//input[@value='log in' or @type='submit']"));
	
//      4.using contain method
//		WebElement un = driver.findElement(By.xpath("//input[contains(@name,'ma')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'wo')]"));
//		WebElement login= driver.findElement(By.xpath("//input[contains(@type,'sub']"));
		
//		5.using start method
//		WebElement un = driver.findElement(By.xpath("//input[start-with(@name,'em')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[start-with(@id,'pa)]"));
//		WebElement login= driver.findElement(By.xpath("//input[start-with(@value,'log']"));
			
//        un.sendKeys("priya");
//        pass.sendKeys("priya@123");
//        login.click();
        
//     6.using text method 
		WebElement link =driver.findElement(By.xpath("//*[text()='Agile project']"));
		link.click();  
	}
}
