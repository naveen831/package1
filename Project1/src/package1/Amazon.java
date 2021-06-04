package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.findElement(By.id("nav-hamburger-menu")). click();
			Actions ac = new Actions(driver);
			WebElement wb = driver.findElement(By.linkText("Echo & Alexa"));
		       ac.moveToElement(wb).click().perform();
	       driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	       driver.findElement(By.linkText("Echo Show 8")).click();
	       boolean isEnabled = driver.findElement(By.id("productTitle")).isEnabled();
	       boolean isDisplayed = driver.findElement(By.id("productTitle")).isDisplayed();
	       if(isEnabled) {
	    	   System.out.println("Title is Enabled");
	       }else 
	    	   System.out.println("Title is Not Enabled");
	       
	if(isDisplayed) {
 	   System.out.println("Title is Displayed");
    }else 
 	   System.out.println("Title is Not Displayed");
    }
	      
	}


