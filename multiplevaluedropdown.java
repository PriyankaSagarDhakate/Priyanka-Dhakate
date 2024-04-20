//16-MarchProgram2:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiplevaluedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select =new Select(fruits);
//		to check the if we can select the mutilple value from dropdwn we can use is multiple value
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByVisibleText("Apple");
			select.selectByValue("orange");
		}
	select.deselectByIndex(0);
	select.deselectByVisibleText("Apple");
	select.deselectByValue("orange");
	select.deselectAll();
		
		
	}

}
