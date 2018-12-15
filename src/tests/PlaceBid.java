package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.LiveBidLocForArt;
import values.DDvalue;

public class PlaceBid extends Config {
	LiveBidLocForArt loc=new LiveBidLocForArt();
	DDvalue val=new DDvalue();
	@Test
	public void placebidtest(){
		typeByXpath(loc.dropdown,val.Bid);
		
	}

}
