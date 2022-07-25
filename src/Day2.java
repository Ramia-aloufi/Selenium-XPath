import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// TODO Auto-generated method stub
		ChromeDriver	driver =new ChromeDriver();
		
		driver.navigate().to("https://www.deal4loans.com/apply-home-loans.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//input name and id
	    driver.findElement(By.xpath("//input[@id='Loan_Amount' and @name='Loan_Amount']")).sendKeys("17171717");	
		Thread.sleep(3000);	
		
		//input name and id
	    driver.findElement(By.xpath("(//input[@class='d4l-input'])[2]")).sendKeys("17171717");	
		Thread.sleep(3000);	
	
		//input name and id
	    driver.findElement(By.xpath("(//input[@type='submit' and @class='hl-get-quotebtn'])")).submit();	
		Thread.sleep(3000);	
		driver.close();
///html/body/div[1]/div[3]/div[1]/div/p[2]/a		
	}
}
