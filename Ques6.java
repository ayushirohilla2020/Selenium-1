package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//  Write a script to get the url of the "Contact Us' page

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ayushi/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.tothenew.com");
	    driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
	    System.out.println(driver.getCurrentUrl());
	  
	}

}