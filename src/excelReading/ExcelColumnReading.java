package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelColumnReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");

		Sheet sheet = WorkbookFactory.create(f).getSheet("DATA1");
	int row = sheet.getLastRowNum();
	System.out.println(row);
	short cell = sheet.getRow(0).getLastCellNum();
	System.out.println(cell);
	
	//	sheet.getRow(0).getCell(0).getStringCellValue();
	}

}
