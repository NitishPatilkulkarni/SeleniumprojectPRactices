package seleniumproject;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//
//import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class google {

	public static void main(String[] args) throws InterruptedException {
		/*
		1) Launch browser
		2) open url
			https://opensource-demo.orangehrmlive.com/
		3) Provide username  - Admin
		4) Provide password  - admin123
		5) Click on Login button 
		6) Verify the title of dashboard page   
			Exp title : OrangeHRM
		7) close browser

		 */

		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	WebElement	dj=driver.findElement(By.name("username"));
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		//Below code gives test passed even if the credentials are wrong so use another validation
		
//		String act_dashboard= driver.getTitle();
//		String exp_dashboard="OrangeHRM";
//		if(act_dashboard.equals(exp_dashboard))
//		{
//			System.out.println("Test passsed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
//		WebDriverWait myWait=  new WebDriverWait(driver, Duration.ofSeconds(10));
//		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("))));
		
//		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
//		fw.withTimeout(Duration.ofSeconds(10));
//		fw.pollingEvery(Duration.ofSeconds(1));
//		fw.ignoring(NoSuchElementException.class);	
//		fw.until(ExpectedConditions.visibilityOf(fwElement));
		
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(Duration.ofSeconds(30));
		fw.pollingEvery(Duration.ofSeconds(6));
		fw.ignoring(NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOf(fwElement));
		
		Wait<WebDriver> w= new FluentWait<WebDriver>(driver);
	
		//2nd validation
		String act_dashboard="";
		try {
			act_dashboard= driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			
		}
		catch(NoSuchElementException e) {
			
		}
		String exp_dashboard="Dashboard";
		if(act_dashboard.equals(exp_dashboard))
			{
				System.out.println("Test passsed");
			}
		else
			{
				System.out.println("Test Failed");
			}
		//driver.close();
		driver.quit();
		
//		FluentWait<WebDriver> mywiat= new FluentWait<WebDriver> (driver);
//		mywiat.withTimeout(Duration.ofSeconds(10));
//		mywiat.pollingEvery(Duration.ofSeconds(2));
//		mywiat.ignoring(NoSuchElementException.class);
//		mywiat.until(ExpectedConditions.visibilityOf(null));
		
		Select d=new Select(dj);
		
		d.selectByIndex(1);
		d.getOptions();
		
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		alert.getText();
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		Actions act= new Actions(driver);
		act.moveToElement(dj).perform();
		act.contextClick();
		act.doubleClick();
		act.dragAndDropBy(dj, 0, 0);
		
		act.keyDown(Keys.ENTER).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", dj);
		js.executeScript("window.scrollBy(0,300);","");//"scrollIntoView();",flag
		
		
		FluentWait<WebDriver> fww =new FluentWait<WebDriver>(driver);
		fww.withTimeout(Duration.ofSeconds(10));
		fww.pollingEvery(Duration.ofSeconds(2));
		fww.ignoring(NoSuchElementException.class);
		fww.until(ExpectedConditions.visibilityOf(dj));
		
		
		WebDriverWait ww= new WebDriverWait(driver,Duration.ofSeconds(10));
		ww.until(ExpectedConditions.alertIsPresent());
		
		
		
}}
//
//
//








//Inheritance



//class Dog{
//	public void bark() {
//		System.out.println("BOW");
//	}
//	
//}
//class Bulldog extends Dog{
//	public void Bigbark() {
//		System.out.println("BOWW BOWW");
//	}
//}
//
//class google{
//	
//
//public static void main(String args[]) {
//	Bulldog BG = new Bulldog();
//	BG.bark();
//	BG.Bigbark();
//}
//
//}






//encapsulation

//class DOG{
//	private int age;
//	private String name;
//	
//	public int getage() {
//		return age;
//		
//	}
//	public void setage(int a) {
//		age=a;
//		
//	}
//	public String getname() {
//		return name;
//	}
//	public void setname(String n) {
//		name=n;
//	}
//}
//class google{
//	
//public static void  main (String args[]) {
//	DOG dog = new DOG();
//	dog.setname("name");
//	System.out.println(dog.getname());
//	dog.setage(5);
//	System.out.println(dog.getage());
//}
//
//}




//Abstraction

//abstract class Dog{
//	abstract void tom();
//	public void sweety() {
//		System.out.println("MEOW");
//		
//	}
//}
//
//class Cat extends Dog{
//	public void tom() {
//		System.out.println("BOW");
//		
//	}
//}
//
//class google{
//	public static void main(String args[]) {
//		Cat c=new Cat();
//		c.tom();
//		c.sweety();
//	}
//}

//constructors

//class Dog{
//	private int age;
//	private String name;
//	
//	public Dog() {
//		
//	age=10;
//	name="s";
//	
//	}
//	public int getage() {
//		return age;
//		
//	}
//	public String getname() {
//		return name;
//		
//	}
//	
//}
//
//class google{
//	public static void main(String args[]) {
//		Dog d = new Dog();
//		System.out.println(d.getage());
//		System.out.println(d.getname());
//		
//	}
//}


//polymorphism


//class Animal {
//	  public void animalSound() {
//	    System.out.println("The animal makes a sound");
//	  }
//	}
//
//	class Pig extends Animal {
//	  public void animalSound() {
//	    System.out.println("The pig says: wee wee");
//	  }
//	}
//
//	class Dog extends Animal {
//	  public void animalSound() {
//	    System.out.println("The dog says: bow wow");
//	  }
//	}
//
//	class google {
//	  public static void main(String[] args) {
//	    Animal myAnimal = new Animal();  // Create a Animal object
//	    Animal myPig = new Pig();  // Create a Pig object
//	    Animal myDog = new Dog();  // Create a Dog object
//	    myAnimal.animalSound();
//	    myPig.animalSound();
//	    myDog.animalSound();
//	  }
//	}


//method overloading
//
//class calc{
//
//	public int add(int a, int b) {
//		return a+b;
//	}
//		
//}
//class advcal extends calc{
//	public int add(int a, int b,int c) {
//		return a+b+c;
//	}
//}
//class google{
//	
//	public static void main(String args[]) {
//		advcal c=new advcal();
//		//System.out.println(c.add(1, 2));
//		System.out.println(c.add(1, 2,5));
//	}
//	
//}

//method overriding

//class human{
//	public void speaks() {
//		System.out.println("hie bro 1");
//		
//	}
//	public void barks() {
//		System.out.println("bark");
//		
//	}
//}
//class dog extends human{
//	public void speaks() {
//		System.out.println("hie bro 2");
//		
//	}
//}
//class cat extends dog{
//	public void speaks() {
//		System.out.println("hie bro 3");
//		
//	}
//}
//
//class google{
//	public static void main(String args[]) {
//	//	dog d= new dog();
//		human c= new human(); 
//		//d.speaks();
//		c.speaks();
//	}
//}


//interface

//interface Dog{
//	public void barks();
//	public void speaks();
//	 default void bag() {
//		System.out.println("bag");
//	}
//	 static void bell() {
//		 System.out.println("bell");
//	 }
//	
//}
//class dog implements Dog{
//	public void barks() {
//		System.out.println("bow");
//	}
//public void speaks() {
//	System.out.println("wow");
//	}
//}
//class google{
//public static void main(String args[]) {
//	dog d=new dog();
//	d.speaks();
//	d.barks();
//	d.bag();
//	Dog.bell();
//}
//}

//fibbonacci
//class google{
//	public static void main(String args[]) {
//		int n1=0;
//		int n2=1;
//		int sum=0;
//		System.out.print(n1+" "+n2);
//		for(int i=2;i<10;i++)
//		{
//			
//			sum=n1+n2;
//			System.out.print(" "+sum);
//			n1=n2;
//			n2=sum;
//		}
//	}
//	
//}


//palindrome

//class google{
//	public static void main(String args[]) {
//		int num=1221;
//		int org=num;
//		int rev=0;
//		while(num!=0)
//		{
//			rev= rev*10+num%10;
//			num=num/10;
//		}
//		if(org==rev)
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("Not palindrome");
//		}
//	}
//	
//}

//palindrome string


//class google{
//	public static void main(String args[]) {
//		String str="ABBA";
//		String orgstr=str;
//		String rev="";
//		int len=str.length();
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+ str.charAt(i);
//		}
//		if(orgstr.equals(rev))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("Not palindrome");
//		}
//	}
//	
//}



//reverse string
//class google{
//	public static void main(String args[]) {
//		String str="nitish";
//		
//		String rev="";
//		int len=str.length();
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+ str.charAt(i);
//		}
//		System.out.println(rev);
//	}
//	
//}

//reverse a number


//class google{
//public static void main(String args[]) {
//int num=12345;
//int rev=0;
//while(num!=0)
//{
//	rev= rev*10+num%10;
//	num=num/10;
//}
//System.out.println(rev);
//}
//}

//count of giving number

//class google{
//public static void main(String args[]) {
//int num=12345;
//int count=0;
//while(num>0)
//{
//	num=num/10;
//	count++;
//}
//System.out.println(count);
//}
//}

//number of even and odd digits in number

//class google{
//public static void main(String args[]) {
//int num=12345;
//int evencount=0;
//int oddcount=0;
//while(num>0)
//{
//	int rem=num%10;
//	if(rem%2==0)
//	{
//		evencount++;
//	}
//	else {
//		oddcount++;
//	}
//	num=num/10;
//}
//System.out.println(evencount);
//System.out.println(oddcount);
//
//}
//}


//factorial 4!=4*3*2*1

//class google{
//public static void main(String args[]) {
// int fact=1;
// int number=4;
// for(int i=1;i<=number;i++)
// {
//	 fact=fact*i;
// }
// System.out.println(fact);
//}
//}


//prime or not
//class google{
//public static void main(String args[]) {

//int m=0,flag=0;      
//int n=11;//it is the number to be checked    
//m=n/2;      
//if(n==0||n==1){  
// System.out.println(n+" is not prime number");      
//}
//else{  
// for(int i=2;i<=m;i++){      
//  if(n%i==0){      
//   System.out.println(n+" is not prime number");      
//   flag=1;      
//   break;      
//  }      
// }      
// if(flag==0) 
// {
//	 System.out.println(n+" is prime number"); 
// 
// }  
// 
//}//end of else  
//}    
//}  


//class google{
//public static void main(String args[]) {
//
//int num=11,flag=0;
//int m=num/2;
//if(num==0||num==1) {
//	System.out.println("not prime");
//}
//else {
//	for(int i=2;i<=m;i++)
//	{
//		if(num%i==0) {
//			System.out.println("not prime");
//			flag=1;
//			break;
//		}
//	}
//	if(flag==0)
//	{
//		System.out.println("it is prime no");
//	}
//}
//
//
//}    
//} 








