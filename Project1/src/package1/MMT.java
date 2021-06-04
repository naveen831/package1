package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/ ");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//Use Of actions because of alert 
		Actions ac = new Actions(driver);
		WebElement fc = driver.findElement(By.id("fromCity"));
	       ac.moveToElement(fc).click().perform();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	       fc.sendKeys("Mumbai");
	       driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	       driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
	      WebElement tc =  driver.findElement(By.id("toCity"));
	      tc.sendKeys("Delhi");
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.cssSelector("span[class='lbl_input latoBold appendBottom10']")).click();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.xpath("//div[@aria-label='Sat Jun 12 2021']")).click();
	      driver.findElement(By.cssSelector("p[class='latoBlack font12 greyText']")).click();
	      driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);	
	      driver.findElement(By.xpath("//div[@aria-label='Sat Jun 19 2021']")).click();
	      driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.id("travellers")).click();
	      driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      driver.findElement(By.linkText("Search")).click();
	      
	}

}
