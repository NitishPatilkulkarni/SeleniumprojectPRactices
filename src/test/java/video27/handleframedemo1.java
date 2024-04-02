package video27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handleframedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("org.openqa.selenium.bidi.log")).click();
		
		driver.findElement(By.linkText("BaseLogEntry")).click();
		
		driver.findElement(By.linkText("Constr")).click();
		
		driver.quit();
	}

}
