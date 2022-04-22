package Facebook_Webelement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElmentInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Anish");
		driver.findElement(By.name("lastname")).sendKeys("Maliackal");
		driver.findElement(By.name("reg_email__")).sendKeys("497539377");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@23658");
		
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selDay = new Select(day);
		Select selMonth = new Select(month);
		Select selYear = new Select(year);
		
		selDay.selectByIndex(9);
		selMonth.selectByValue("8");
		selYear.selectByVisibleText("1984");
		
		driver.findElement(By.xpath("//label[text()='Male")).click();
		driver.findElement(By.name(null));

		
		
		
		
		
		
	}

}
