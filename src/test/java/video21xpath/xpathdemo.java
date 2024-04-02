package video21xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		//using own relative xpath
//		String product= driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
//		System.out.println(product);
		//using absolute xpath
		String product= driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
		System.out.println(product);
		
		
	}

}
