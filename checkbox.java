//15-march topic:checkbox

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
//        to check on the single checkbox we need to find out the element and need to click on it
//        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//        checkbox1.click();
////        to check the checkbox is alredy selected or not we need to use below logic
//        if(checkbox1.isSelected())
//        {
//        	System.out.println("checkbox is selected by default");	
//        }
//        else
//        {
//        	checkbox1.click();
//        }
     List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
       int size =checkboxes.size();
       System.out.println(size);
       
//       if you hVE MULTIPLE element and you want to perform operation on specific index you c
//       checkboxes.get(0).click();    this line is not imp we we run for loop
//       for(int i=0;i<size;i++)
//       {
//    	   checkboxes.get(i).click();
//       }
       		
    
       for(int i=0;i<size;i++)
       {
//    	   get attribute metod is used to fetch the value of element attribute as per gives  key
    	   String value = checkboxes.get(i).getAttribute("value");
    	   if(value.equalsIgnoreCase("hockey"))
    	   {
    		   checkboxes.get(i).click();
    	   }
    	   
       }	   
	}
}
