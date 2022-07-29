package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GD {
	@Test
	
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver	driver =new ChromeDriver();
		
		//Navigate to google login  Maximize
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=ar&passive=true&continue=https%3A%2F%2Fwww.google.com.sa%2F%3Fhl%3Dar&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//Type Email
		driver.findElement(By.xpath("//div[@class='DRS7Fe bxPAYd k6Zj8d']/descendant::input[@type='email']")).sendKeys("ramia");	
		Thread.sleep(1000);	
		
		//click Forgot Email
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']//preceding ::button[@jsname=\"Cuz2Ue\"]")).click();	
		Thread.sleep(1000);	

	
		//quite browser
		driver.quit();
	}

}
