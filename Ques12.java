package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ayushi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ayushi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Rohila");
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ayushi.rohilla@tothenew.com");
		

	}

}
