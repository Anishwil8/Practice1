package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		
	//Get the parent Handle and save it in Parent	
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent id: "+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("size is :"+allWindows.size());
		System.out.println("All Windows :"+allWindows);
		
		for(String child:allWindows)
		{
			 if(!parent.equals(child))
			 {
				 driver.switchTo().window(child);
				 System.out.println(driver.getTitle());
				 driver.close();
			 }
		}
		
		
		driver.switchTo().window(parent);
	
		

	}

}
