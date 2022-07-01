package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingStudy1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
		
		String Sheet = WorkbookFactory.create(f).getSheet("DATA1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(Sheet);   
        
        
        String result = (WorkbookFactory.create(f).getSheet("DATA1").getRow(7).getCell(2).getStringCellValue());
		System.out.println(result);
        
        double result1 = WorkbookFactory.create(f).getSheet("DATA1").getRow(5).getCell(4).getNumericCellValue();
	    System.out.println(result1);
	
	    String result2 = WorkbookFactory.create(f).getSheet("DATA1").getRow(5).getCell(3).getStringCellValue();
	    System.out.println(result2);
	}

}
