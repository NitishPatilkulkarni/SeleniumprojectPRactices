package screenshot;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshottry {

	public static void main(String[] args) throws IOException, InterruptedException, HeadlessException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		
		driver.findElement(By.xpath("//*[@id=\"simple\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		String expectedAlertText = "Hello! I am an alert box!";
		System.out.println(alertText);

		if(alertText.equals(expectedAlertText)) {
			System.out.println("Test passed");
		}
			
		else {
			System.out.println("Test failed");
		}
		
		String projpath=System.getProperty("user.dir");
		BufferedImage sc= new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(sc,"jpg", new File(projpath+"/img.jpg"));
		

		
}
}
//		driver.get("https://demo.nopcommerce.com/");
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("C:\\Users\\2303559\\eclipse-workspace\\seleniumproject\\Screenshots\\one.png");
//		FileUtils.copyFile(src, trg);


//	public void Screenshot(WebDriver driver, String photoName) throws IOException {
//		TakesScreenshot scrShot =((TakesScreenshot)driver);
//		//Call getScreenshotAs method to create image file
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//		//Move image file to new destination
//		File DestFile=new File("C:\\Users\\2303559\\eclipse-workspace\\seleniumproject\\Screenshots\\"+photoName+".jpg" );
//		//Copy file at destination
//		FileUtils.copyFile(SrcFile, DestFile);
//	}