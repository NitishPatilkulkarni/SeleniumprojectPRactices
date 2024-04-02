package video19locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.To launch browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		//2. launch url
		driver.get("https://automationexercise.com/products");
		//3.maximize window
		driver.manage().window().maximize();
		//4.working on search bad locating it with id locator and feeding tshirt txt adn searching
		driver.findElement(By.id("search_product")).sendKeys("tshirt");
		
		driver.findElement(By.id("submit_search")).click();
	}

}
/*
		//Open app
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.name("submit_search")).click();
		
		//link text & partial linktext
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
*/