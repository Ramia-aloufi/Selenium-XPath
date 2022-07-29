package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_for_Contain_Type_of_XPath {
	@Test
	
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver	driver =new ChromeDriver();
		
		//Navigate to uber Home Page and Maximize
		driver.navigate().to("https://www.uber.com/global/en/sign-in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click log in 
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();	
		Thread.sleep(2000);	
	
		//click log in to order&delever
		driver.findElement(By.xpath("(//div[contains(@class,'bn fi et bp bo')])[4]")).click();	
		Thread.sleep(2000);	
		
		//click log in to order&delever
		driver.findElement(By.xpath("//input[contains(@inputmode,'email')]")).sendKeys("ram@gmail.com");	
		Thread.sleep(2000);	
		
		//click next
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();	
		Thread.sleep(5000);	
		
		//quite browser
		driver.quit();
	}
}
