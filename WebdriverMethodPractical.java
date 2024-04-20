import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodPractical {

	public static void main(String[] args) {
		//this method will help you to set browser path which we need to run the automation script
		// to create chrome driver object we need to create webdriver interface reference variable and need to create chrome object
		WebDriver driver =new ChromeDriver();
	
//		 1.this method use for open url
         driver.get("https://www.amazon.in/");
         
        //3.to get the currently open
         String title=driver.getTitle();
         System.out.print(title);
         
         //4.to get the currently open url we can use get current url method
         String url=driver.getCurrentUrl();
         System.out.println(url);
         
         //5.to get the source code of open url we can current url method
         String source=driver.getPageSource();
         System.out.println();
         
         //6.to close the current open url we need close method
         driver.close();
         
         //7.to get the current poen url we need quit
         driver.quit();
         
         //2.to close use for url
         driver.close();
}
}