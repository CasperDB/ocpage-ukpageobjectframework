package oddschecker.Tests;
import org.junit.Assert;
import org.junit.Test;

import oddschecker.Pages.Initialize;
import oddschecker.Pages.MyOddscheckerMyBookies;
import oddschecker.Pages.NavBar;
import oddschecker.Pages.Pages;
import oddschecker.Pages.SkyBet;

public class TestMyOddschecker extends Initialize
{

@Test 
	public void SignInTest() throws InterruptedException
	{
		NavBar.closePopupOffer();
		NavBar.Signin();
		Thread.sleep(2000);
		Assert.assertTrue(NavBar.IsSignedIn());
	}
/*
@Test
	public void UpdateMyProfileTest()
	{
		
	}
*/
@Test
	public void UpdateMyFavouriteBookiesTest() throws InterruptedException // FUTURE IDEA: RANDOM BOOKIE MOVED AND VERIFIED
	{
		NavBar.closePopupOffer();
		NavBar.Signin();
		Thread.sleep(2000);
		NavBar.NavigatetoMyBookies();
		MyOddscheckerMyBookies.UpdateFavouriteBookies();
		Assert.assertTrue(MyOddscheckerMyBookies.IsFavouriteBookieUpdated());
		// Currently only verifying the SkyBet logo is present & Texxt, need to change to it to the array within MyBookies
	}

@Test
	public void RemoveBookieFromFavBookiesTest() throws InterruptedException // FUTUREW IDEA: RANDOM BOOKIE MOVED AND VERIFIED
	{
		NavBar.closePopupOffer();
		NavBar.Signin();
		Thread.sleep(2000);
		NavBar.NavigatetoMyBookies();
		MyOddscheckerMyBookies.RemoveFavouriteBookie();
		Assert.assertTrue(MyOddscheckerMyBookies.IsFavouriteBookieUpdated());
		// Currently only verifying the SkyBet logo is present & Texxt, need to change to it to the array within MyBookies
	}

@Test
	public void SignInToBookieTest() throws InterruptedException // FUTUTRE IDEA: RANDOM BOOKIE LOGIN 
	{
		NavBar.closePopupOffer();
		NavBar.Signin();
		Thread.sleep(2000);
		NavBar.NavigatetoMyBookies();
		MyOddscheckerMyBookies.SignInToSkyBetBookie();
		Thread.sleep(2000);
		SkyBet.Login();
	}

@Test
	public void AddBookmarksTest() throws InterruptedException 
	{
		NavBar.closePopupOffer();
		NavBar.Signin();
		Thread.sleep(2000);
		
		NavBar.NavigateMyBookmarks();
	}
}
