package seleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFirst {
 public static void main(String args[]) {

	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.instagram.com");
	 WebElement UsernameTextField = driver.findElement(By.name("username"));
	UsernameTextField.sendKeys("9818587623");
	 WebElement UserTextPasswordField = driver.findElement(By.name("password"));
	 UserTextPasswordField.sendKeys("Anurag@12"); 
	 
	 WebElement loginButton = driver.findElement(By.className("_acap"));
     loginButton.click();
 }
}

