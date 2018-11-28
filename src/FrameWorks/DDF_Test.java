package FrameWorks;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DDF_Test {

	public static void main(String[] args) throws Exception {

		//System.setProperty("webdriver.gecko.driver", "E:\\Downloads\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver","D:\\backup\\Downloads\\chromedriver.exe");

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("http://apps.qaplanet.in/qahrm/login.php");

		// read data from excel
		Workbook wb = Workbook.getWorkbook(new File("D:\\ex_1.xls"));
		Sheet ip = wb.getSheet(0);

		// write data to excel
		WritableWorkbook wwb = Workbook.createWorkbook(new File("C:\\New folder\\Res.xls"));
		WritableSheet op = wwb.createSheet("HRM", 0);

		// add cells in excel
		Label c1 = new Label(0, 0, "Username");
		Label c2 = new Label(1, 0, "Password");
		Label c3 = new Label(2, 0, "Result");

		op.addCell(c1);
		op.addCell(c2);
		op.addCell(c3);

		int r = ip.getRows();

		System.out.println(r);

		for (int i = 1; i < r; i++) {
			System.out.println("Iteration Number:" + i);
			WebElement un = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
			un.clear();
			un.sendKeys(ip.getCell(0, i).getContents());
			WebElement pwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
			pwd.sendKeys(ip.getCell(1, i).getContents());

			WebElement click = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
			click.click();

			String title = driver.getTitle();

			if (title.equals("OrangeHRM")) {
				System.out.println("Login Successful");
				Label r1 = new Label(0, i, ip.getCell(0, i).getContents());
				Label r2 = new Label(1, i, ip.getCell(1, i).getContents());
				Label r3 = new Label(2, i, "Passed");

				WebElement logout = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
				logout.click();

				op.addCell(r1);
				op.addCell(r2);
				op.addCell(r3);

			} 
			else 
			{
				System.out.println("Login Failed");
				Label r1 = new Label(0, i, ip.getCell(0, i).getContents());
				Label r2 = new Label(1, i, ip.getCell(1, i).getContents());
				Label r3 = new Label(2, i, "Failed");

				op.addCell(r1);
				op.addCell(r2);
				op.addCell(r3);
			}

		}
		wwb.write();
		wwb.close();
		driver.quit();
		driver.close();
		
	}

}
