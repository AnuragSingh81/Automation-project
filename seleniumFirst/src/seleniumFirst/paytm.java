package seleniumFirst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class paytm { 
	 public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paytm.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.linkText("Paytm for Consumer"))).perform();
//		a.moveToElement(driver.findElement(By.linkText("Payments"))).perform();
//		a.click(driver.findElement(By.linkText("Online Payments"))).perform();
		///////////////////////////////////////////////////////////////////////
		////right click and select inspect button ////////////////
		
	
		WebElement rightClick = driver.findElement(By.id("app"));
		 a.contextClick(rightClick).perform();
		 
		 //////////////////now keyboard actions we need perform////////
		 Robot r = new Robot();
		 for(int i = 1; i<=12; i++) {
			 
				 r.keyPress(KeyEvent.VK_DOWN);
				 Thread.sleep(500);
				 r.keyRelease(KeyEvent.VK_DOWN);
				 }
		       r.keyPress(KeyEvent.VK_ENTER);
//		 		a.sendKeys(Keys.ENTER).perform();
				 
			 }
		 }
		
		
		


