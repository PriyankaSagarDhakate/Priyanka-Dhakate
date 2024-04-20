//21 march
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class tableexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		//to fetch  all the columns from the table we well use the below code
		List<WebElement>columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("total no of columns are"+size);
		for(int i=0;i<size;i++)
		{
	String columnName = columns.get(i).getText();
	System.out.println(columnName);
	if(columnName.equalsIgnoreCase("Company"))
	{
		System.out.println("we have columns name as per requrement");		
	}
	//to fetch the all rows from the table we well use the below code
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	int size1 =rows.size();
	System.out.println("total no of rows are"+size1);
	for(int j=0;j<size;j++)
	{
		String rowName = rows.get(j).getText();
		System.out.println(rowName);
	}	
//	to fetch the cell data we will use the below code 
    WebElement cellData = driver.findElement(By.xpath("//*[@=\"leftcontainer\"]/table/tbody/tr[6]/td[4]"));
	System.out.println(cellData.getText());
	}	
		}	
	}


