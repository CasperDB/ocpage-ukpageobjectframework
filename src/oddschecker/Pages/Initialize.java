package oddschecker.Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




public class Initialize  
{
	public static WebDriver driver;
	protected String baseUrl;
	@Before
	public void Setup() throws Exception
		{
			
			String systemOS =System.getProperty("os.name");	
			 
			if (systemOS.equals("Windows") )
			{
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");	
			}
			else if (systemOS.equals("Mac OS X"))
			{
				System.setProperty("webdriver.chrome.driver","Devicedriver/chromedriver");
			}
			
			driver = new ChromeDriver();
			
			baseUrl = "http://dev.oddschecker.com";
			driver.get(baseUrl);
			driver.manage().window().maximize();
			
			}
	
	@After
	public void TearDown()
	{
		driver.quit();
	}
	}

