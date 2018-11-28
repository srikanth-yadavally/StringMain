package FrameWorks;
import java.io.File;
import jxl.*;


public class HowToReadMultipleRowsofData 
{

public static void main(String args[]) throws Exception
		{
			File File=new File("D:\\ex_1.xls");
			Workbook objWB=Workbook.getWorkbook(File); 
			Sheet s1= objWB.getSheet(0); //1- Means second sheet, index start from 0
			
			//Get row count
			int rows=s1.getRows();	
			
			for (int i=0;i<rows;i++)
			{
				String un=s1.getCell(0, i).getContents();	
				String pwd=s1.getCell(1, i).getContents();	
				System.out.println(un+" "+pwd);			
			}
		}
	}

