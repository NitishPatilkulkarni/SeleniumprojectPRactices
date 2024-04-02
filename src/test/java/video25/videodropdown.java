package video25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class videodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.findElement(By.id("country-list")).click();
		List<WebElement> options= driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++)
		{
			String op=options.get(i).getText();
			if(op.equals("Brazil"))
			{
				options.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("state-list")).click();
		List<WebElement> options2= driver.findElements(By.xpath("//select[@id=\"state-list\"]//option"));
		System.out.println(options2.size());
		
		for(int i=0;i<options2.size();i++)
		{
//			String op2=options2.get(i).getText();
			
				System.out.println(options2.get(i).getText());
				
		
		}
		
	}

}
