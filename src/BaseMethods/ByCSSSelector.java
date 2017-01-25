package BaseMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import oddschecker.Pages.Initialize;

public class ByCSSSelector extends Initialize
{
 private static final String pathToPopupOffer = "#promo-1 > a";
;	
	public static void clickOn(String selector)
	{
		WebElement element = driver.findElement(By.cssSelector(selector));
		element.click();
	}
	
	public static void sendKeys(String selector, String input )
	{
		WebElement element = driver.findElement(By.cssSelector(selector));
		element.sendKeys(input);
		
	}
	
	public static void waitForElement(String selector)
	{
		WebElement element = driver.findElement(By.cssSelector(selector));
		element.click();
	}
		
	public static void dragAnddropElement(String from, String to)
	{
		WebElement element = driver.findElement(By.cssSelector(from)); 
		WebElement target = driver.findElement(By.cssSelector(to));
		(new Actions(driver)).dragAndDrop(element, target).perform();	
	}
	
	public static void closePopupElement(String selector)
	{
		boolean isDisplayedElement;
		if (isDisplayedElement = driver.findElement(By.cssSelector(pathToPopupOffer)).isDisplayed())
		{
			WebElement element = driver.findElement(By.cssSelector(selector));
			element.click();
		}
	}
	
	public static boolean verifyElement(String selector)
	{
		WebElement element = driver.findElement(By.cssSelector(selector));
		return element.isDisplayed();
	}
}

