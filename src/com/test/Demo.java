package com.test;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Automation_Feb\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	//url
	driver.get("https://www.facebook.com/");
	
	///max
	
	driver.manage().window().maximize();
	//title
	String title = driver.getTitle();
	System.out.println(title);
	
	
	//url
	
  String currentUrl = driver.getCurrentUrl();
  System.out.println(currentUrl);
	
	// 
  
  String pageSource = driver.getPageSource();
  System.out.println(pageSource);
  
	//close
  
  driver.close();
  
  
  //quit
  driver.quit();
  
  
  
	}
}


