//18 march
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		to maximize the window we can use below code
		driver.manage().window().maximize();
//		to minimize the window we can use below code
		driver.manage().window().minimize();
		
//		a)alert with ok
	WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
			
			WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//			button.click();
//			
//		1to get the text form alert box we will use get text mehtod
String char[] text = driver.switchTo().alert().getText();
	System.out.println(text);
//		2.to accpet the alert we can accpet method
	driver.switchTo().alert().accept();
		
		
//		b)alert with ok cancel
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
	button click();
	WebElement button = driver.findElement(By.xpth("//html/body/div[1]/div/div/div/div[1]/ul/li[2]/a");
	button1.click();
	
//		3.to dismiss the alert we can usse dismmiss method
	driver.switchTo().alert().dismiss();
		
//		c)alert with text box
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		Thread.sleep(3000);
//		
		
		driver.switchTo().alert().sendKeys("priya");
		driver.switchTo().alert().accept();
		
//		
		
		
		
		
	}

	
		
	}

	

