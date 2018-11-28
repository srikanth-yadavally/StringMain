package Huawei;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;


class RMAExcel{
	
	public static void main(String[] args) throws Exception {
		
	
		
		
		File f=new File("D://NGN//Daily//Test.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0); 
		
		int rows=sh.getRows();
		
		int col=sh.getColumns();
		
		System.out.println(rows +" "+col);
		
		
		
		
		String r1=sh.getCell(6,3).getContents();
		String r2=sh.getCell(6,5).getContents();
		String r3=sh.getCell(6,11).getContents();
		String r4=sh.getCell(6,12).getContents();
		String r5=sh.getCell(6,13).getContents();
		String r6=sh.getCell(6,14).getContents();
		String r7=sh.getCell(6,15).getContents();
		String r8=sh.getCell(6,15).getContents();
		String r9=sh.getCell(6,16).getContents();
		String r10=sh.getCell(6,17).getContents();
		String r11=sh.getCell(6,18).getContents();
		/*String r12=sh.getCell(6,24).getContents();
		String r13=sh.getCell(6,25).getContents();*/
		String r14=sh.getCell(6,30).getContents();
		String r15=sh.getCell(6,31).getContents();
		String r16=sh.getCell(6,32).getContents();
		String r17=sh.getCell(6,33).getContents();
		String r18=sh.getCell(6,34).getContents();
		String r19=sh.getCell(6,35).getContents();
		String r20=sh.getCell(6,36).getContents();
		String r21=sh.getCell(6,37).getContents();
		/*String r22=sh.getCell(6,38).getContents();
		*/
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		System.out.println(r7);
		System.out.println(r8);
		System.out.println(r9);
		System.out.println(r10);
		System.out.println(r11);
		System.out.println(r14);
		System.out.println(r15);
		System.out.println(r16);
		System.out.println(r17);
		System.out.println(r18);
		System.out.println(r19);
		System.out.println(r20);
		System.out.println(r21);
		
		
		
		File  File1=new File("C://Users//softnet//Desktop//RMA_Raise_Form.xls");
		Workbook wwb=Workbook.getWorkbook(File1);
		Sheet ssh=wwb.getSheet(1);
		Label l=new Label(0, 0, sh.getCell(6,3).getContents());
		/*
		sh.addCell(l);
		ws.addCell(l1);
		ws.addCell(r1);
		ws.addCell(r2);*/
		/*System.out.println(rows);
		System.out.println(col);*/
		
		/* for(int i=0;i<rows;i++) {
			 String s1=sh.getCell(0,i).getContents();
			 String s2=sh.getCell(1,i).getContents();
			 
			 System.out.println(s1);
			 System.out.println(s2);
		 }*/
		
		
			
		
	
		
			
	/*String FilePath = "C://Users//softnet//Desktop//RMA_Raise_Form.xls";
	
	 this is to get the access to Sheet1. 
	
	String CellGetContent = sh.getCell(0,0).getContents();
	
	System.out.println(CellGetContent);
	
	
	Cell Row0Col0 = sh.getCell(0,0);
	Cell Row1Col1 = sh.getCell(1,1);
	String FirstRowFirstColumn = Row0Col0.getContents();
	String SecondRowSecondColumn = Row1Col1.getContents();*/
}

	
	}
