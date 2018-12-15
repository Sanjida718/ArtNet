package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.LocatorForRegi;
import values.RegisterElementValue;

public class RegisterTest extends Config {
	RegisterElementValue val=new RegisterElementValue();
	LocatorForRegi loc=new LocatorForRegi();
	@Test
	public void regtest(){
		clickByXpath(loc.register);
		typeByXpath(loc.FirstName,val.FirstName);
		typeByXpath(loc.LastName,val.LastName);
		typeByXpath(loc.email,val.email);
		typeByXpath(loc.UserName,val.UserName);
		typeByXpath(loc.PassWord,val.PassWord);
		typeByXpath(loc.ConfirmPass,val.ConfirmPass);
		clickByXpath(loc.RegisNow);
		
		
	}
	

}
