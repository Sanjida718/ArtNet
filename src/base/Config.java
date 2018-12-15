package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import webdriverApi.Swfunctions;

public class Config extends Swfunctions {
	@Parameters ({"browser"})
	@BeforeTest
	public void beforetestingstart(String browser){
		if (browser.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver", "/Users/SanjidaAfrin/Documents/Facebook/Drivers/chromedriver");
			 driver=new ChromeDriver();
			 APPLICATION_LOGS.debug("Chrome browser started");
		}else if (browser.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver", "/Users/SanjidaAfrin/Documents/Facebook/Drivers/geckodriver");
		driver = new FirefoxDriver();
		APPLICATION_LOGS.debug("gecko browser started");
		} else
			System.out.print("THERE ARE NO BROWSER TO TEST");
            driver.get("https://www.artnet.com/auctions/artists/alex-katz/luna-park-2");
           // System.out.println(driver.findElement(By.xpath("//*[@id='loginForm']/div[2]")).getText());
            APPLICATION_LOGS.debug("Went to artnet placing bid");
	}
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

		@AfterTest
		public void close1(){
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//driver.close();
		
		
		}
}






