package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowReading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{ File f1=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");

	Sheet sheet2 = WorkbookFactory.create(f1).getSheet("DATA1");
	//row constant & column Varies
	for(int i=0;i<=6;i++) //static coding
	{
	String values = sheet2.getRow(0).getCell(i).getStringCellValue();
	System.out.println(values);
	}
	
	System.out.println("=================");
	//single row values
	short cellcount = sheet2.getRow(0).getLastCellNum();
	System.out.println(cellcount);
    System.out.println("=================");
 	 int totalcell = cellcount-1;
	for(int i=0;i<=totalcell;i++)
	{
		String values = sheet2.getRow(0).getCell(i).getStringCellValue();
		System.out.println(values);
	}
	
    System.out.println("=================");
	//single column print
	
	for(int i=0;i<=8;i++)
	{
		String values1 = sheet2.getRow(i).getCell(2).getStringCellValue();
		System.out.println(values1);
	}
    System.out.println("=================");
    
    int rowcount = sheet2.getLastRowNum();
    
    //dynamic coding
    for(int i=0;i<=rowcount;i++)
    {
    	String values2 = sheet2.getRow(i).getCell(1).getStringCellValue();
    	System.out.println(values2);
    }

	}

}
