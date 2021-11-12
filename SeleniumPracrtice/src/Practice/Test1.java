package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Test1 {

	public static void main(String[] args) {
		
		//System.out.println("Hellzos");
		
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", null);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement objname = driver.findElement(By.id(("txtUsername")));
		
		System.out.println(objname.getTagName());		
		objname.sendKeys("Anish");
		System.out.println(objname.getText());
		System.out.println(objname.isEnabled());
		System.out.println(objname.isSelected());
		System.out.println(objname.getClass());	
		driver.close();
		

	}

}
