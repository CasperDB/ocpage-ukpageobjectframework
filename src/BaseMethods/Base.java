package BaseMethods;

import org.openqa.selenium.By;

import oddschecker.Pages.Initialize;

public class Base extends Initialize
{
	public static void switchTo(String frame)
	{
		//Switches to the an opened iFrame
		driver.switchTo().frame(driver.findElement(By.cssSelector(frame)));
	}

}
