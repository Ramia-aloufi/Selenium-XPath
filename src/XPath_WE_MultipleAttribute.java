import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPath_WE_MultipleAttribute {
	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// TODO Auto-generated method stub
		ChromeDriver	driver =new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

		
		driver.navigate().to("https://www.amazon.sa/?&tag=sagooglepcakb-21&ref=pd_sl_7qhce485gw_e&adgrpid=102084282229&hvpone=&hvptwo=&hvadid=442304045256&hvpos=&hvnetw=g&hvrand=5904875234547148635&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1028873&hvtargid=kwd-10573980&hydadcr=15978_2027906&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd7DZNswEmmMGiSFsT3pc8u4AnIYcmhzuTDaQAsDRKDUMirAH-zb3m0aAvrvEALw_wcB&language=en_AE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		//mobile -MultipleAttribute -
		driver.findElement(By.xpath("(//a[@class='nav-a  'and @data-csa-c-content-id='nav_cs_mobiles'])")).click();	
		Thread.sleep(1000);	
		
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(1000);	
		
		//[1] Iphone 13 -SameAttribute -
	    driver.findElement(By.xpath("(//a[@class='bxc-grid-overlay__link'])[1]")).click();	
		Thread.sleep(5000);	
		


		

		driver.quit();
	}
	
}
