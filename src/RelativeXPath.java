import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RelativeXPath {
	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// TODO Auto-generated method stub
		ChromeDriver	driver =new ChromeDriver();
		
		driver.navigate().to("https://letcode.in/test");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		//AbsoluteXPath
	    driver.findElement(By.xpath("(//a[@class='card-footer-item'])[4]")).click();	
		Thread.sleep(5000);	
		driver.close();
	}
}
