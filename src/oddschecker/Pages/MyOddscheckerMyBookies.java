package oddschecker.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseMethods.Base;
import BaseMethods.ByCSSSelector;

public class MyOddscheckerMyBookies {

	private static final String SkyBetFavouriteBookie = "#SK";
	private static final String MyFavouriteBookies = "#my-bookmakers > li > img";
	private static final String UpdateMyFavouriteBtn = "#apply";
	private static final String MyFavouriteBookieUpdateText = "#mc > div.tab-content2 > section:nth-child(1) > div > section:nth-child(1) > div";
	private static final String AllBookies = "#other-bookmakers > li.empty > img";
	private static final String SKLoginBtn = "#mc > div.tab-content2 > section:nth-child(2) > div > div > div.show-on-load > section.logged-split.loggedOut > div:nth-child(1) > div.top-content > div.details-right > div > span.btn-1-large.button.no-arrow";
	
	
	public static void UpdateFavouriteBookies() 
	{
		ByCSSSelector.dragAnddropElement(SkyBetFavouriteBookie, MyFavouriteBookies);
		ByCSSSelector.clickOn(UpdateMyFavouriteBtn);
		
	}
	
	public static void RemoveFavouriteBookie()
	{
		ByCSSSelector.dragAnddropElement(SkyBetFavouriteBookie, AllBookies);
		ByCSSSelector.clickOn(UpdateMyFavouriteBtn);
	}
	
	public static boolean IsFavouriteBookieUpdated()
	{	
		if (ByCSSSelector.verifyElement(MyFavouriteBookieUpdateText))
		{return ByCSSSelector.verifyElement(SkyBetFavouriteBookie);	}
		return false;
	}
	
	public static void SignInToSkyBetBookie()
	{
		ByCSSSelector.clickOn(SKLoginBtn);
	}
	

}
