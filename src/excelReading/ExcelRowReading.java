package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
		
		Workbook book = WorkbookFactory.create(f);//returns workbook
		Sheet sheet = book.getSheet("DATA1");//returns sheet
		Row row = sheet.getRow(0);//returns row
		Cell cell = row.getCell(0);//returns cell
		String value = cell.getStringCellValue();//returns String
		
		System.out.println(value);
		
	}

	

}
