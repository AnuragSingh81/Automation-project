package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spotifyPlaylist {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://open.spotify.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 ///////////////////////////////////////////////////////////////
	 driver.findElement(By.xpath("//span[text()='Log in']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("anuragsinghbsm@gmail.com");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Anurag@9958");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Log In']")).click();
	 Thread.sleep(3000);
	 //////////////////////////// playlist ////////////////////////
	 driver.findElement(By.xpath("//button[@aria-label='Create playlist or folder']")).click();
	 driver.findElement(By.xpath("//span[text()='Create a new playlist']")).click();
	 
	 driver.findElement(By.xpath("//input[@class = 'encore-text encore-text-body-small FeWwGSRANj36qpOBoxdx']")).sendKeys("piya o re piya");
	
	
	driver.findElement(By.xpath("(//button[@class ='Button-sc-y0gtbx-0 ftVawI encore-text-body-small-bold'])[1]")).click();

	 
	 
}
}
