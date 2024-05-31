package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumwebDriver {
        public static void main(String args[]) throws InterruptedException {
        	
        	WebDriver driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.facebook.com");
        	Thread.sleep(2000);
        	WebElement Create = driver.findElement(By.className("_4jy2"));
        	Create.click();
        	Thread.sleep(2000);
        	driver.findElement(By.name("firstname")).sendKeys("Anruag");
        	Thread.sleep(2000);
        	driver.findElement(By.name("lastname")).sendKeys("Singh");
        	Thread.sleep(2000);
        	driver.findElement(By.name("reg_email__")).sendKeys("Anruag.spell5@gmail.com");
        	Thread.sleep(2000);
        	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Anruag.spell5@gmail.com");
        	Thread.sleep(2000);
        	driver.findElement(By.name("reg_passwd__")).sendKeys("Anurag@12");
        	driver.findElement(By.name("birthday_day")).sendKeys("30");
        	driver.findElement(By.name("birthday_month")).sendKeys("June");
        	driver.findElement(By.name("birthday_year")).sendKeys("2001");
        	Thread.sleep(2000);
        	driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.name("websubmit")).click();
        	
        }
}
