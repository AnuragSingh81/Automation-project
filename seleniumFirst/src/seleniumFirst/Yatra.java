package seleniumFirst;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Yatra { 
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'(DEL)')]"));
		driver.findElement(By.className("required_field cityPadRight ac_input origin_ac"));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("span[text()='MAA']"));
		Thread.sleep(2000);
		driver.findElement(By.id("06/06/2024"));
		

	}
}
