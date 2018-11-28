package General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class B extends A
{
	
	

	public void LoginApplication() throws Exception
	{	
	System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	for(int i=1;i<InputSheet().getRows();i++)
	{
	
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.name("txtUserName"));
		un.sendKeys(InputSheet().getCell(0, i).getContents());
		
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.sendKeys(InputSheet().getCell(1, i).getContents());
		
		WebElement click = driver.findElement(By.name("Submit"));
		click.click();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Login Success with "+InputSheet().getCell(0, i).getContents()+" "+InputSheet().getCell(1, i).getContents());
		}
		else
		{
			System.out.println("Login Failed with "+InputSheet().getCell(0, i).getContents()+" "+InputSheet().getCell(1, i).getContents());
		}
	
	}
	
		
	}
}
