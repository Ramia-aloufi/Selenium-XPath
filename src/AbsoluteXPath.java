import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXPath {
	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// TODO Auto-generated method stub
		ChromeDriver	driver =new ChromeDriver();
		
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		//AbsoluteXPath
	    driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();	
		Thread.sleep(5000);	
		driver.close();
	}
}
