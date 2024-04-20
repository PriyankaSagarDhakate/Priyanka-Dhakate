//13-march program2:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectordisplayedenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
      WebElement username=driver.findElement(By.id("email"));
      WebElement password=driver.findElement(By.id("pass"));
      
//      boolean result=username1.isDisplayed();
//    boolean result1=username1.isEnabled();
//      System.out.println(result);
//      System.out.println(result1);
//boolean result2=password.isDisplayed();
//    boolean result3=password.isEnabled();
//    System.out.println(result2);
//    System.out.println(result3);
//      is displayed method is used to validate different is present or not
//      is enabled method is used to validate element is enable or disable
      if(username.isDisplayed()&& username.isEnabled())
      {
    	  username.sendKeys("priya");  
      }
      else {
    	  System.out.println("username is not Displayed");  
      }
	    if(password.isDisplayed() && password.isEnabled())
      {
    	  password.sendKeys("priya");  
      }
      else
      {
    	  System.out.println("password is not displayed");  
      }
	WebElement checkbox = driver.findElement(By.id("persist_box"));
//	is selected method is used to vaildate checkbox or radio button is alredy selected or not
			boolean result1 =checkbox.isSelected();
			System.out.println(result1);
}
}
