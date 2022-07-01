package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
    Sheet sheet = WorkbookFactory.create(f).getSheet("Sheet3");
    
    short cell = sheet.getRow(0).getLastCellNum();
    System.out.println(cell);
    
    int row = sheet.getLastRowNum();
    System.out.println(row);
    
    
    
    //static code row constant
    
    for(int i=0;i<=2;i++)
    {
    	String values = sheet.getRow(0).getCell(i).getStringCellValue();
    	System.out.println(values);
    }
    //Dynamic Coding row constant
    System.out.println("==================");
    int result = cell-1;
    
    for(int i=0;i<=result;i++)
    {
    	String values1 = sheet.getRow(0).getCell(i).getStringCellValue();
    	System.out.println(values1);   
    	
    }
    
    
    System.out.println("============");
    
    //static coding cell constant
    
    for(int i=0;i<=3;i++)
    {
    	String values2 = sheet.getRow(i).getCell(0).getStringCellValue();
    	System.out.println(values2);
    }
    
    System.out.println("============");

    //dynamic coding for cell constant
   for(int i=0;i<=row;i++)
   {
	   String rowvalue = sheet.getRow(i).getCell(2).getStringCellValue();
	   System.out.println(rowvalue);
   }
    
    
    
	}

}
