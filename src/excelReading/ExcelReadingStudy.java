package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{ 
		
		File myfile=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
	
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(name);
	
	              double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	              System.out.println(number);
	             
	              boolean value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
	System.out.println(value);
	
	
	}

}
