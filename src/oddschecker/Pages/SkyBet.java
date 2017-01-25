package oddschecker.Pages;

import org.openqa.selenium.By;

import BaseMethods.Base;
import BaseMethods.ByCSSSelector;

public class SkyBet{

	private static final String frame = "iframe[name='SkyBetAccount']";
	private static final String pathToUserID = "#username";
	private static final String UserIDInput = "OCAPP1";
	private static final String pathToPIN = "#pin";
	private static final String PINInput = "2014";
	private static final String LogInBtn = "#form-1695072 > fieldset > ul > li:nth-child(4) > input";
	
	public static void Login()
	{
		Base.switchTo(frame);
		ByCSSSelector.sendKeys(pathToUserID, UserIDInput);
		ByCSSSelector.sendKeys(pathToPIN, PINInput);
		ByCSSSelector.clickOn(LogInBtn);
	}
}
