//18-march
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleiframeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

//		to fetch the no of the iframe we will get the size of the iframe
		List<WebElement>noOfFrame = (List<WebElement>) driver.findElement(By.tagName("iframe"));
		int size  = noOfFrame.size();
		System.out.println("No of iframe in HTML page is "+size);
//		1.swith by idex
		
		
//		2swithc by id
		driver.switchTo().frame("singleframe");
//		3.switch by name
		driver.switchTo().frame("SingleFrame");
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/div"));
		text.sendKeys("priya");
		
	}

}
