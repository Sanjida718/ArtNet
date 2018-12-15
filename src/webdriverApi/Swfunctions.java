package webdriverApi;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Swfunctions {
public WebDriver driver;
	
	
	//public static Log log = LogFactory.getLog(Resolver.class);
	public static Logger APPLICATION_LOGS = Logger.getLogger("myLogs");

	
      public void getTextByXpath (String loc){
	WebElement convertIntoText = driver.findElement(By.xpath(loc));
	String actText = convertIntoText.getText();
	System.out.println ("Actual is : " +actText);
	APPLICATION_LOGS.debug("Actual is : " +actText);
      }
	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);

	}
	public void typeByCss (String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
		APPLICATION_LOGS.debug("elements will have their value from value class");
	}
	public void typeByid (String locator, String values){
		driver.findElement(By.xpath(locator)).sendKeys(values);
	}
	public void clickByXpath (String locators){
		driver.findElement(By.xpath(locators)).click();
		APPLICATION_LOGS.debug("its gonna click");
	}
	public void getByXpath (String loc){
		driver.findElement(By.xpath(loc)).getText();
		APPLICATION_LOGS.debug("Invalid username, email and/or password ");
		
		
	}
	public void clickByCss(String loc){
		driver.findElement(By.cssSelector(loc));
		APPLICATION_LOGS.debug("if it iss css thn");
	}
	//dropdown
	public void dropdownusingValue(String loc,String value){
		WebElement selectelements=driver.findElement(By.xpath(loc));
		Select dropdown=new Select (selectelements);
		dropdown.selectByVisibleText(value);
		APPLICATION_LOGS.debug("dropdown should work");
	}
	public void dropdownByIndex(String loc,int x){
		WebElement choseelement=driver.findElement(By.id(loc));
		Select dropdown=new Select(choseelement);
		dropdown.selectByIndex(x);
	}
	//radio button
	public void Radiobutton(String loc){
		//driver.findElement(By.xpath(loc)).clear();
		driver.findElement(By.xpath(loc)).click();
	  APPLICATION_LOGS.debug("");
	}
	//Radiocss
	public void radiobutton(String loc){
		driver.findElement(By.cssSelector(loc)).click();
		APPLICATION_LOGS.debug("Radio button should be click");

	}



	//Iframe

	public void iframe(String loc){
		WebElement ab=driver.findElement(By.xpath(loc));
		List<WebElement> el= ab.findElements(By.tagName("a"));
		System.out.println(el.size());
		for(int k=0;k<el.size();k++)
		{
			System.out.println(el.get(k).getText());

		}
		
		}
}
