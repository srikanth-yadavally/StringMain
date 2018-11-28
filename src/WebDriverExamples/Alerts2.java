package WebDriverExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\New folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 60);
		
		driver.get("http://apps.qaplanet.in/WebApp/");
		
		driver.findElement(By.xpath("//a[@href='http://apps.qaplanet.in/WebApp/AgeProb.html']")).click();
		
		String str=driver.getCurrentUrl();
		System.out.println(str);
		
		driver.switchTo().window(str);
		
		Thread.sleep(3000);
		driver.findElement(By.id("idAge")).sendKeys("25");
		driver.findElement(By.id("idSubGo")).click();
		
		
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
	}

}
