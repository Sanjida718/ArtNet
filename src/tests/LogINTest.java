package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.LogINLoc;
import values.LogInVal;

public class LogINTest extends Config {
	LogINLoc loc=new LogINLoc();
	LogInVal val=new LogInVal();
	@Test
	public void logtest(){
		clickByXpath(loc.login);
		typeByXpath (loc.userEmail,val.userEmail);
		typeByXpath (loc.Password,val.Password);
		clickByXpath(loc.SignIN);
		getByXpath(loc.massage);
		//System.out.println(driver.findElement(By.xpath("//*[@id='loginForm']/div[2]")).getText());
	
		
		
	}

}
