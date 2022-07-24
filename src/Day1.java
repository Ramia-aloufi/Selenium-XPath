import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// TODO Auto-generated method stub
		ChromeDriver	driver =new ChromeDriver();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		
//	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ram@gmail.com");	
//		Thread.sleep(3000);	
//		
//	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");	
//		Thread.sleep(3000);	
//		
//	    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).submit();	
//		Thread.sleep(3000);	
//		
//	    driver.findElement(By.xpath("//a[contains(text(),’Forgot password?’)]")).click();	
//		Thread.sleep(5000);	
		
		driver.navigate().to("https://login.salesforce.com/?locale=eu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//input by id
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("as@gmail.com");	
		Thread.sleep(3000);	
		//input by id

	    driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("12345678");	
		Thread.sleep(3000);	
		//input by class

	    driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).submit();	
		Thread.sleep(3000);	
		

		
	   driver.findElement(By.xpath("//a[text()[normalize-space(.)='Forgot Your Password?']]")).click();	
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
