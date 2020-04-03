package assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ayushi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    
	    Actions a= new Actions(driver);
	    a.sendKeys("To The New").sendKeys(Keys.ENTER).build().perform();   


	}

}
