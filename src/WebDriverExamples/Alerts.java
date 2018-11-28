package WebDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "E:\\New folder\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://apps.qaplanet.in/WebApp/AgeProb.html");
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		boolean res=wait.until(ExpectedConditions.titleIs("Age Problem"));
		//verify Age Problem
		if(res)
		{
			System.out.println("Age Problem displayed");
		}
		//-----------------------------------------------------------
		//Enter age
		driver.findElement(By.id("idAge")).sendKeys("10");
		//Click on submit
		driver.findElement(By.id("idSubGo")).click();
		//--------------------------------------------------------
		//wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
		//Switch to alert
		Alert A=driver.switchTo().alert();
		//Verify Kid message
		if(A.getText().equals("Kid"))
		{
			System.out.println("Kid alert displayed");
			A.accept();
		}
		//------------------------------------------------------------
		driver.close();
		
	}
	}
