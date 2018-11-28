package WebDriverExamples;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Actions a = new Actions();

		driver.get("http://apps.qaplanet.in/erp/index.php");
		WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		un.sendKeys("frontaccount");
		Thread.sleep(5000);		
		un.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		un.sendKeys(Keys.CLEAR);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='./index.php?application=AP']")).click();
		driver.findElement(By.xpath("//a[@href='./reporting/reports_main.php?Class=1']")).click();
		
		driver.findElement(By.xpath("//a[@href='/erp/reporting/reports_main.php?Class=6']")).click();
		
		driver.findElement(By.xpath("//a[@href='/erp/reporting/reports_main.php?Class=6&REP_ID=710']")).click();
		
		

		
		
	}

}
