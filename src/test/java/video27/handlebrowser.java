package video27;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		
		Set<String> windowsids=driver.getWindowHandles();
		
		for(String winid:windowsids)
		{
			String title= driver.switchTo().window(winid).getTitle();
			
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				System.out.println(title);
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/ul/li[2]/a/button")).click();
				
				
			}
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(title);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("aaa");
				driver.close();
			}
			
		}
		
		
		//convert to list coll
//		List <String>windList= new ArrayList(windowsids);
//		
//		String parentid= windList.get(0);
//		String childid= windList.get(1);
//		
//		driver.switchTo().window(childid);
//		
//		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//		
//		driver.switchTo().window(parentid);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
//		
		
		
			
	}

}
