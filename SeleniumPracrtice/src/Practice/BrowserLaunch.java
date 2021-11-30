package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;


public class BrowserLaunch {

static WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
			driver = new ChromeDriver();
		}
			
		
	//	if(browser.equalsIgnoreCase("Edge")) {
	//		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
	//		driver = new ();
	//	}
		driver.get(url);
		System.out.println(url); 
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String baseUrl = "http://shopclues.com/";
		BrowserLaunch obj = new BrowserLaunch();
		
		obj .setupBrowser("chrome", baseUrl);
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.manage().window().maximize() ;
		
		
		
		
		
	}

}
