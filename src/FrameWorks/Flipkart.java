package FrameWorks;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{
	static int count =1;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\softnet\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
				.sendKeys("9492674483");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();

		Thread.sleep(10000);

		WebElement ele = driver.findElement(By.xpath("//a[@title=\"Electronics\"]/span"));

		Actions act = new Actions(driver);

		act.moveToElement(ele).perform();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("VIEW ALL")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[contains(text(),'Price -- Low to High')]")).click();
		
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Mobile Info");
				
		Row r1=sheet.createRow(0);
		r1.createCell(0).setCellValue("Mobile");		
		r1.createCell(1).setCellValue("Price");
		

		for (int i = 0; i < 8; i++) {

			Thread.sleep(20000);
			getmobileTableData(driver, sheet);

			String index = String.valueOf(i + 2);

			Thread.sleep(10000);

			System.out.println(index);

			driver.findElement(By.linkText(index)).click();
			

		}
		
		FileOutputStream fp=new FileOutputStream("D:\\Flipkart.xlsx");
		wb.write(fp);

	}

	public static void getmobileTableData(WebDriver driver,XSSFSheet sheet) {
		List<WebElement> we = driver.findElements(By.cssSelector("._3T_wwx>div>div>a div"));
		System.out.println("size ...." + we.size());

		
		
		Row r= null;
		for (WebElement el : we) 
		{
		/*	// System.out.println("getting Text: " + el.getText() +">>>>>>>>>>>>>>>>>>>>
			// getting class name"+ el.getAttribute("class"));
*/			
			boolean isMobileClass = false;
			boolean isPriceClass = false;
			String mobileName = null, mobilePrice = null;
			
			
			if (el.getAttribute("class").equals("_3wU53n")) 
			{
				System.out.println("product name : " + el.getText());
				isMobileClass = true;     
				mobileName = el.getText();
			}
			
			if(isMobileClass)
			{
				r = sheet.createRow(count);
				r.createCell(0).setCellValue(mobileName);
			}

			if (el.getAttribute("class").equals("_1vC4OE _2rQ-NK")) 
			{
				System.out.println("product price : " + el.getText());
				isPriceClass = true;
				mobilePrice =  el.getText();
			}
  			
			if(isPriceClass)
			{
				
				r.createCell(1).setCellValue(mobilePrice);
				count++;
			}
			 
			
		}
		
	}

}
