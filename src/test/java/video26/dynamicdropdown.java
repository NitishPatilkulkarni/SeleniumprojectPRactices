package video26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("selenium");
 		Thread.sleep(5000);
 		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Number of suggestions:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String li=list.get(i).getText();
			System.out.println(li);
			
		}
		
	}
}


