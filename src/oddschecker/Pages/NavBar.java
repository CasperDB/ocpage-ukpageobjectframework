package oddschecker.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import BaseMethods.*;
import oddschecker.Pages.Initialize;
import BaseMethods.ByCSSSelector;

import oddschecker.Tests.*;

public class NavBar  extends Initialize 
{
	private static final String pathToFreeBets = "#top-menu > li:nth-child(1) > a > span";
	private static final String pathToSignIn = "#login-container > a";
	private static final String pathToLoggedBtn = "blah-blah";
	private static final String pathToEmailField = "#login-inputs > input.email";
	private static final String pathToPasswordField = "#login-inputs > input.password";
	private static final String signInEmailInput = "smoketest.devapi@yahoo.com";
	private static final String signInPasswordInput = "Oddschecker1";
	private static final String pathToLogInBtn = "#header-login-form > button";
	private static final String closePopupBtn = "#promo-modal > div.modal-dialog-inner > div > span";
	public static final String pathToMyOC = "#myoddschecker-btn";
	private static final String pathToMyBookies = "#myoc-panel > a:nth-child(2)";
	private static final String pathToMyBookmarks = "#myoc-panel > a:nth-child(3)";
	
	public static void goToFreeBets()
	{
		WebElement clickFreeBets = driver.findElement(By.cssSelector(pathToFreeBets));
		clickFreeBets.click();
	}
	public static void Signin()
	{
		//Clicks on the sign in button from the homepage
		ByCSSSelector.clickOn(pathToSignIn);
		ByCSSSelector.sendKeys(pathToEmailField, signInEmailInput);
		ByCSSSelector.sendKeys(pathToPasswordField, signInPasswordInput);
		ByCSSSelector.clickOn(pathToLogInBtn);
		
	}
	
	
	public static void closePopupOffer()
	{
		ByCSSSelector.closePopupElement(closePopupBtn);
	}
	
	public static boolean IsSignedIn()
	{	WebElement element = driver.findElement(By.cssSelector(pathToMyBookies));
		return element.isDisplayed();
	}
	public static void NavigatetoMyBookies() 
	{
		ByCSSSelector.clickOn(pathToMyOC);	
		ByCSSSelector.clickOn(pathToMyBookies);
	}
	
	public static void NavigateMyBookmarks()
	{
		ByCSSSelector.clickOn(pathToMyOC);
		ByCSSSelector.clickOn(pathToMyBookmarks);
	}

}

