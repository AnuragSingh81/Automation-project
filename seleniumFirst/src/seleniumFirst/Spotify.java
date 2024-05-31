package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.get("https://www.spotify.com");
 	Thread.sleep(2000);
 	driver.findElement(By.name("encore-text encore-text-body-small NtkAQg9R1r5CjuP0XHwl")).sendKeys();
 	Thread.sleep(2000);
 	
 	driver.findElement(input("/")).click();
 	
}
}
