package assignmentone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class assignmentone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Assignement
//		----------------
//		1) Launch browser
//		2) open url
//			URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
//		3) Provide username  - admin@yourstore.com
//		4) Provide password  - admin
//		5) Click on Login button 
//		6) Verify the title of dashboard page   
//			Exp title : Dashboard / nopCommerce administration
//		7) Verify Dasboad
//
//		ref
//		----
//		WebElement  txtemailbox=driver.findElement(By.name("username"));
//		txtemailbox.clear();
//		txtemailbox.sendKeys("email..");
//
//		driver.findElement(By.id("Email"));

//		1) Launch browser
		WebDriver driver= new EdgeDriver();
		
//		2) open url
//		URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		3) Provide username  - admin@yourstore.com

		WebElement emailbox=driver.findElement(By.xpath("//*[@id=\'Email\']"));
		emailbox.clear();
		emailbox.sendKeys("admin@yourstore.com");
		
		
		//driver.findElement(By.xpath("//*[@id=\'Email\']")).sendKeys("admin@yourstore.com");
		
		
//		4) Provide password  - admin
		WebElement passwordbox=driver.findElement(By.xpath("//*[@id=\'Password\']"));
		passwordbox.clear();
		passwordbox.sendKeys("admin");
		
		
//		5) Click on Login button 
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(5000);
//		6) Verify the title of dashboard page   
//		Exp title : Dashboard / nopCommerce administration
//	7) Verify Dasboad
		String actual_dashboard="";
		actual_dashboard= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String exp_dashboard="Dashboard";
		if(actual_dashboard.equals(exp_dashboard))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
			
		}
		
	}

}
