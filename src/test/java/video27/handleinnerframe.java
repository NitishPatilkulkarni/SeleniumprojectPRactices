package video27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleinnerframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frm1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("12345");
		
		driver.switchTo().defaultContent();
		
		
	}

}
