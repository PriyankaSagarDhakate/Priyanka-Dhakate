//30 march program1:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement flight = driver.findElement(By.linkText("Flights"));
		Actions action = new Actions(driver);
		

		//1.the mouse left key operation and hold on given web element
		//action.clickAndHold(flight).perform;
		
		
		//2.release
		//action.release().perform();
		
		
		//3.context click it will use to right click of mouse at given web element
		//action.contextClick(flight).perform();
		
	
		
	}


	}

