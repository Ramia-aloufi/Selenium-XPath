package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_for_Using_OR_AND_Type_of_XPath {
	
	@Test
	public void xPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/r/eclipse-workspace/TestProject/Driver/chromedriver");

		// Use chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//Navigate to amazon Home Page and Maximize
		driver.navigate().to("https://www.amazon.sa/?&tag=sagooglepcakb-21&ref=pd_sl_7qhce485gw_e&adgrpid=102084282229&hvpone=&hvptwo=&hvadid=442304045256&hvpos=&hvnetw=g&hvrand=5904875234547148635&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1028873&hvtargid=kwd-10573980&hydadcr=15978_2027906&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd7DZNswEmmMGiSFsT3pc8u4AnIYcmhzuTDaQAsDRKDUMirAH-zb3m0aAvrvEALw_wcB&language=en_AE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click mobile from header with unique id
		driver.findElement(By.xpath("(//a[@class='nav-a  'and @data-csa-c-content-id='nav_cs_mobiles'])")).click();	
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath(null));	

		
		//click Mobiles & Accessories if it not found click Computer & Accessories
	    driver.findElement(By.xpath("//span[contains(text(),' Mobiles & Accessories') or contains(text(),'Computer & Accessories')]")).click();	
		Thread.sleep(5000);	
	
		//quite browser
		driver.quit();
	}
	}

