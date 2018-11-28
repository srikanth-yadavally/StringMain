package General;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class A 
{
	
	public Sheet InputSheet() throws BiffException, IOException 
	{
		
	Workbook wb = Workbook.getWorkbook(new File("D:\\ex_1.xls"));
	Sheet ip = wb.getSheet(0);
	return ip;
	
}
}
